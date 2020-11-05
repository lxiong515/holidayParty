package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class HolidayParty {
	private String host;
	private String street;
	private String city;
	private String state;
	private String day;
	private String time;
	
	public HolidayParty(){
		
	}
	public HolidayParty(String host, String street, String city, String state, String day, String time) {
		
	}
	/*
	//getters and setters	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}*/
	@Override
	public String toString() {
		return "Holiday Party [host=" + host + " , street=" + street + ", city=" + city +  " , state=" + " , day="+ day + " , time="+ time + "]";
				
	}

}
