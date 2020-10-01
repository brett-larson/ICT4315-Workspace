package main.ict4315.week1;

public class Address {
	
	//Class variables
	public String street1;
	public String street2;
	public String city;
	public String state;
	public String zipCode;
	
	public String getMailingAddress() {
		
		//Variable to hold the completed/returned string.
		String address = "";
		
		if(street2 == null) {
			
			address = street1 + " - "  + city + ", " + state + ". " + zipCode;
			
		} else {
			
			address = street1 + " - " + street2 + " - " + city + ", " + state + ". " + zipCode;
			
		}
		
		return address;
		
	}

}
