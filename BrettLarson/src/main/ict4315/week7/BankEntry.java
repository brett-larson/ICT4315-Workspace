package main.ict4315.week7;

/**Class to build a Bank Entry object
 * @author Brett Larson
 * @version 1.0
 * @param fee Double to hold the fee amount
 * @param interest Double to hold the interest amount
 */
public class BankEntry extends Entry {
	
	//Class variables
	private double fee;
	private double interest;

	/**
	 * Constructor that takes no arguments
	 */
	public BankEntry() {
	}
	
	/**Constructor that accepts all variables
	 * @param accountId
	 * @param bankId
	 * @param payee
	 * @param date
	 * @param debitCredit
	 * @param description
	 * @param checkNumber
	 * @param amount
	 * @param currentBalance
	 * @param newBalance
	 * @param fee
	 * @param interest
	 */
	public BankEntry(String accountId, String bankId, String payee, String date, String debitCredit, String description,
			int checkNumber, double amount, double currentBalance, double newBalance, double fee, double interest) {
		super(accountId, bankId, payee, date, debitCredit, description, checkNumber, amount, currentBalance, newBalance);
		
		//Adding child attributes to constructor
		this.fee = fee;
		this.interest = interest;
	}

	/**
	 * @return the fee
	 */
	public double getFee() {
		return fee;
	}

	/**
	 * @param feeName the fee to set
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}

	/**
	 * @return the interest
	 */
	public double getInteres() {
		return interest;
	}

	/**
	 * @param interestName the interest to set
	 */
	public void setInterest(double interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "BankEntry [fee=" + fee + ", interest=" + interest + "]";
	}
	
	/**The getBankEntry method returns a string containing a bank registry entry.
	 * @return string that holds a completed bank entry
	 */
	public String getBankEntry() {
		
		//Variable to hold the return string
		String retEntry = null;
		
		//Building the return string using getters from the Entry class and the UserEntry variables
		retEntry = getDate() + " - " + getDescription() + " - " + getCheckNumber() + " - " + getDebitCredit() + " - "
				+ getAmount() + " - " + getPayee() + " - " + getBankId() + " - " + getAccountId() + " - " + getCurrentBalance() + " - " + getNewBalance() + " - " + fee + " - " + interest;
		
		//Returning the string to the calling method
		return retEntry;
		
	}
	
	/**isFeeValid method validates the fee is a positive double number
	 * @return boolean value returns true if fee > 0, otherwise returns false
	 */
	public boolean isFeeValid() {
		
		//Setting the boolean value for retValue to true.
		boolean retValue = true;
		
		//Set the retValue value to false if checkNumber is less than 1
		if (fee <= 0) {
			retValue = false;
		} 
		
		return retValue;
		
	}
	
	/**The isInterestValid method validates the interest rate is a positive double
	 * @return boolean value returns true if rate is > 0, otherwise returns false
	 */
	public boolean isInterestValid() {
		
		//Setting the boolean value for retValue to true.
		boolean retValue = true;
		
		//Set the retValue value to false if amount is less than/equal to 0
		if (interest <= 0) {
			retValue = false;
		} 
		
		return retValue;
		
	}

}
