package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.HolidayParty;
import dmacc.beans.Presents;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PresentsRepository;;

@SpringBootApplication
public class HolidayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolidayApplication.class, args);
		
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Presents p = appContext.getBean("presents", Presents.class);
		//System.out.println(p.toString());
	}
	@Autowired
	PresentsRepository repo;
	
	//@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//using an existing bean
		Presents p = appContext.getBean("presents", Presents.class);
		p.setRelationship("best friend");
		repo.save(p);
		
		//creating a bean to use - not managed by Spring
		Presents d = new Presents("Sandra Boynton", "Wine Decanter", "friend");
		HolidayParty h = new HolidayParty("Sandra", "123 Main Street", "Des Moines", "IA", "12/15/2020", "4:00pm");
		d.setHolidayParty(h);
		repo.save(d);
		
		List<Presents> allMyPresents = repo.findAll();
		for(Presents people: allMyPresents) {
			System.out.println(people.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
