package dmacc.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;;

@Data
@NoArgsConstructor
public class Name {
	private String firstName;
	private String lastName;
	private String elfName;
	
	public Name(String elf) {
		super();
		//this.user1=user1;
		this.setfirstNameToRandom();
		this.setlastNameToRandom();
		this.determineElfName();
	}
	
	private void setfirstNameToRandom() {
		// TODO Auto-generated method stub
		//need to do if statement for gender
		//String[] female= {"Bougey", "Merry", "Happy", "Icy", "Snow", "Princess", "Paris", "Cardi", "Holly", "Twinkle", "Candy", "Tiny"};
		//String[] male= {"Hairy", "Biggie", "OnePac", "Smelly", "Figgy", "Jolly", "Tiny", "Fluffy", "McJingles", "Noel", "Sparky", "Shorty"};
		String[] first= {"Bougey", "Merry", "Happy", "Icy", "Snow", "Princess", "Paris", "Cardi", "Holly", "Twinkle", "Candy", "Tiny","Hairy", "Biggie", "OnePac", "Smelly", "Figgy", "Jolly", "Tiny", "Fluffy", "McJingles", "Noel", "Sparky", "Shorty"};
		Random r = new Random();
		/*
		if(theChoice == "female"){
			firstName = female[r.nextInt(female.length)];
		}
		else if(theChoice =="male") {
			firstName = male[r.nextInt(male.length)];
		}
		*/
		firstName = first[r.nextInt(first.length)];
	}

	private void setlastNameToRandom() {
		// TODO Auto-generated method stub
		//need to do if statement for gender
		//String[] female = {"Lady", "Star", "Deer", "Elf", "Elfie", "Baby", "Spark", "Angel", "Mitts", "Cookie", "Peppermint", "Jewel", "Rose", "Shimmer", "Berry"};
		//String[] male = {"Elf", "Bells", "SnowFlake", "Drawers", "Toes", "Bling", "Ice", "Kringle", "Wink", "Zippy", "Snowball", "Evergreen", "Blitz", "Dash"};
		String[] last = {"Lady", "Star", "Deer", "Elf", "Elfie", "Baby", "Spark", "Angel", "Mitts", "Cookie", "Peppermint", "Jewel", "Rose", "Shimmer", "Berry", "Elf", "Bells", "SnowFlake", "Drawers", "Toes", "Bling", "Ice", "Kringle", "Wink", "Zippy", "Snowball", "Evergreen", "Blitz", "Dash"};
		Random r = new Random();
		/*
		if(theChoice == "female"){
			firstName = female[r.nextInt(female.length)];
		}
		else if(theChoice =="male") {
			firstName = male[r.nextInt(male.length)];
		}
		*/
		lastName = last[r.nextInt(last.length)];
	}

	private void determineElfName() {
		// TODO Auto-generated method stub
		elfName = (" " + firstName + " " + lastName);
	}
}
