package main.ict4315.week6;

public class User {
	
	//Class variables
	private String userId;
	private String firstName;
	private String lastName;
	private Address address; 
	
	//Object constructor that does not take any arguments.
	public User() {
	}

	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param address
	 */
	public User(String userId, String firstName, String lastName, Address address) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}
	
	/*The getUserInfo method takes input from other objects and creates a formatted
	 *string based on the data received.
	 */
	public String getUserInfo() {
		
		//System.out.println(toString());
		
		//Variable to hold the string to be returned
		String retUserInfo = null;
		
		//Build the checkInfo string
		retUserInfo = userId + " - " + firstName + " " + lastName + " - " + address.getMailingAddress();
		
		return retUserInfo;
		
	}
	
	//The isUserIdValid method is used to verify the userId entered is only 10 characters
	public boolean isUserIdValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the bankId variable length. If not 10, change returnValue to false
		if(userId.length() != 10) {
			retValue = false;
		}
		
		return retValue;
		
	}
	
	//The isFirstNameValid method is used to verify the first name entered has 1 or more characters
	public boolean isFirstNameValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the bankId variable length. If not 10, change returnValue to false
		if(firstName.length() < 1) {
			retValue = false;
		}
		
		return retValue;
		
	}
	
	//The isLastNameValid method is used to verify the last name entered has 1 or more characters
	public boolean isLastNameValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the bankId variable length. If not 10, change returnValue to false
		if(lastName.length() < 1) {
			retValue = false;
		}
		
		return retValue;
		
	}
	

}
