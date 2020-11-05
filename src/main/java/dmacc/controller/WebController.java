package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dmacc.beans.Name;
import dmacc.beans.Presents;
import dmacc.repository.PresentsRepository;

@Controller
public class WebController {
	
	@Autowired
	PresentsRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllPresents(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewPresents(model);
		}
		model.addAttribute("presents", repo.findAll());
		return "results";
		
	}

	
	@GetMapping("input/Presents")
	public String addNewPresents(Model model) {
		Presents p = new Presents();
		model.addAttribute("newPresents", p);
		return "input";
	}
	
	@PostMapping("/inputPresents")
	public String addNewPresents(@ModelAttribute Presents p, Model model) {
		repo.save(p);
		return viewAllPresents(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdatePresents(@PathVariable("id") long id, Model model) {
		Presents p = repo.findById(id).orElse(null);
		model.addAttribute("newPresents", p);
		return "input";
	}
	@PostMapping("/update/{id}")
	public String revisePresents(Presents p, Model model) {
		repo.save(p);
		return viewAllPresents(model);
	}
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Presents p = repo.findById(id).orElse(null);
	    repo.delete(p);
	    return viewAllPresents(model);
	}
	
	@GetMapping("/pickacategory")
	public String pickCategory(@RequestParam(name="choice", required=false) String theChoice, Model model) {
		if(theChoice == null) {
			return "index";	
			}

		Name theOutcome = new Name(theChoice);
		model.addAttribute("name", theOutcome);
		return "results";
		
	}
	

}
