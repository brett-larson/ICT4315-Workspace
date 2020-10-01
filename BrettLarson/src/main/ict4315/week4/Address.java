package main.ict4315.week4;

public class Address {
	
	//Class variables
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zipCode;


	//Object constructor that does not take any arguments.
	public Address() {
	}

	/**
	 * @param street1
	 * @param street2
	 * @param city
	 * @param state
	 * @param zipCode
	 * 
	 * Constructor that will accept values for all class variables and create an object.
	 */
	public Address(String street1, String street2, String city, String state, String zipCode)  {
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	/**
	 * @param street1
	 * @param city
	 * @param state
	 * @param zipCode
	 * 
	 * Constructor that will accept values for all class variables except 'street2'
	 * and create an object.
	 */
	public Address(String street1, String city, String state, String zipCode) {
		this.street1 = street1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	/**
	 * @return the street1
	 */
	public String getStreet1() {
		return street1;
	}

	/**
	 * @param street1 the street1 to set
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	/**
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}

	/**
	 * @param street2 the street2 to set
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}


	/*The getMailingAddress method takes input from other objects and creates a formatted
	 * string based on the data received via the class constructors.
	 */
	public String getMailingAddress() {
		
		//Variable to hold the return string
		String retAddress = null;
		
		/*If street2 is null, the first statement executes creating a string without street2.
		 * If street2 is not null, the second statement executes creating a string with street2.
		 */
		if(street2 == null) {
			retAddress = street1 + " - "  + city + ", " + state + ". " + zipCode;
		} else {
			retAddress = street1 + " - " + street2 + " - " + city + ", " + state + ". " + zipCode;
		}
		
		return retAddress;
		
	}
	
	//The isStateValue method is used to verify the state entered is only two characters
	public boolean isStateValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the state variable length. If not 2, change returnValue to false
		if(state.length() != 2) {
			retValue = false;
		}
		
		return retValue;
		
	}
	
	//The isStateValue method is used to verify the state entered is only two characters
	public boolean isZipCodeValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the state variable length. If not 2, change returnValue to false
		if(zipCode.length() != 5) {
			retValue = false;
		}
		
		return retValue;
		
	}

}
