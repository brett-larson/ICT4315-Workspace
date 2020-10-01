package main.ict4315.week2;

public class Check {
	
	//Class variables
	private String accountId;
	private String bankId;
	private String payee;
	private String date;
	private int checkNumber;
	private double amount;
	
	
	/**
	 * Object constructor that does not take any arguments.
	 */
	public Check() {
	}

	/**
	 * @param accountId
	 * @param bankId
	 * @param payee
	 * @param date
	 * @param checkNumber
	 * @param amount
	 * 
	 * Constructor that will accept values for all class variables and create an object.
	 */
	public Check(String accountId, String bankId, String payee, String date, int checkNumber, double amount) {
		this.accountId = accountId;
		this.bankId = bankId;
		this.payee = payee;
		this.date = date;
		this.checkNumber = checkNumber;
		this.amount = amount;
	}


	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
	 * @return the payee
	 */
	public String getPayee() {
		return payee;
	}

	/**
	 * @param payee the payee to set
	 */
	public void setPayee(String payee) {
		this.payee = payee;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the checkNumber
	 */
	public int getCheckNumber() {
		return checkNumber;
	}

	/**
	 * @param checkNumber the checkNumber to set
	 */
	public void setCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Check [accountId=" + accountId + ", bankId=" + bankId + ", payee=" + payee + ", date=" + date
				+ ", checkNumber=" + checkNumber + ", amount=" + amount + "]";
	}

	/*The getCheckInfo method takes input from other objects and creates a formatted
	 *string based on the data received.
	 */
	public String getCheckInfo() {
		
		//Variable to hold the string to be returned
		String retCheckString = null;
		
		//Build the checkInfo string
		retCheckString = checkNumber + " - " + payee + " - " + amount + " - " + date;
		
		return retCheckString;
		
	}
	
	/*The positiveCheckNumber method is used to validate 
	 *the check number entered is a positive integer. 
	 */
	public boolean isCheckNumValid() {
		
		//Setting the boolean value for retCheckNumValid to true.
		boolean retCheckNumValid = true;
		
		//Set the retCheckNumValid value to false if checkNumber is less than 1
		if (checkNumber < 1) {
			retCheckNumValid = false;
		} 
		
		return retCheckNumValid;
		
	}

}
