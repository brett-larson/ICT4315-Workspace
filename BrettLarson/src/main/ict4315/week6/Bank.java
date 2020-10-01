package main.ict4315.week6;

public class Bank {
	
	//Class variables
	private String bankId;
	private String name;
	private String phoneNumber;
	private Address address;
	

	//Object constructor that does not take any arguments.
	public Bank() {
	}


	/**
	 * @param bankId
	 * @param name
	 * @param phoneNumber
	 * @param address
	 */
	public Bank(String bankId, String name, String phoneNumber, Address address) {
		this.bankId = bankId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}


	/**
	 * @return the bankId
	 */
	public String getBankId() {
		return bankId;
	}


	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
		return "Bank [bankId=" + bankId + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	/*The getBankInfo method takes input from other objects and creates a formatted
	 *string based on the data received.
	 */
	public String getBankInfo() {
		
		//Variable to hold the string to be returned
		String retBankInfo = null;
		
		//Build the checkInfo string
		retBankInfo = bankId + " - " + name + " - " + phoneNumber + " - " + address.getMailingAddress();
		
		return retBankInfo;
		
	}
	
	//The isBankIdValid method is used to verify the bankId entered is only 9 characters
	public boolean isBankIdValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the bankId variable length. If not 9, change returnValue to false
		if(bankId.length() != 9) {
			retValue = false;
		}
		
		return retValue;
		
	}
	
	//The isBankNameValid method is used to verify the bank name entered is greater than 0 characters
	public boolean isBankNameValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the bankId variable length. If not 9, change returnValue to false
		if(name.length() < 1) {
			retValue = false;
		}
		
		return retValue;
		
	}
	
	//The isPhoneNumberValid method is used to verify the phone number is 10 characters long
	public boolean isPhoneNumberValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the bankId variable length. If not 9, change returnValue to false
		if(phoneNumber.length() != 10) {
			retValue = false;
		}
		
		return retValue;
		
	}
	


}
