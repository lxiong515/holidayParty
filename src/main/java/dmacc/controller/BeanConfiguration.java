package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.HolidayParty;
import dmacc.beans.Presents;

@Configuration
public class BeanConfiguration {
	@Bean
	public Presents presents() {
		Presents bean = new Presents();
		//bean.setName("Kid 1");
		//bean.setPresent("Coals");
		//bean.setRelationship("First Born");
		return bean;
	}
	@Bean
	public HolidayParty holidayParty() {
		HolidayParty bean = new HolidayParty("In-Laws", "123 Main St", "Denver", "CO", "12/24/2020", "12:00pm");
		return bean;
	}
	
}
