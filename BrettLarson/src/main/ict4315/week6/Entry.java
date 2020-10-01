package main.ict4315.week6;

/**Class to build an Entry object
 * @author Brett Larson
 * @version 1.0
 * @param accountId - String to hold the account ID
 * @param bankId - String to hold the bank ID
 * @param payee - String to hold the payee (if applicable)
 * @param date - String to hold the date
 * @param debitCredit - String to hold debit or credit
 * @param description - String to hold the description
 * @param checkNumber - Int to hold the check number
 * @param amount - Double to hold the amount
 * @param currentBalance - double to hold the current balance
 * @param newBalance - double to hold the new balance
 */
public class Entry {
	
	//Class variables
	private String accountId;
	private String bankId;
	private String payee;
	private String date;
	private String debitCredit;
	private String description;
	private int checkNumber;
	private double amount;
	private double currentBalance;
	private double newBalance;
	
	/**
	 * Constructor that takes no arguments
	 */
	public Entry() {
	}



	/** Entry constructor that takes all variables
	 * @param accountId - String to hold the account ID
	 * @param bankId - String to hold the bank ID
	 * @param payee - String to hold the payee (if applicable)
	 * @param date - String to hold the date
	 * @param debitCredit - String to hold debit or credit
	 * @param description - String to hold the description
	 * @param checkNumber - Int to hold the check number
	 * @param amount - Double to hold the amount
	 * @param currentBalance - double to hold the current balance
	 * @param newBalance - double to hold the new balance
	 */
	public Entry(String accountId, String bankId, String payee, String date, String debitCredit, String description,
			int checkNumber, double amount, double currentBalance, double newBalance) {
		this.accountId = accountId;
		this.bankId = bankId;
		this.payee = payee;
		this.date = date;
		this.debitCredit = debitCredit;
		this.description = description;
		this.checkNumber = checkNumber;
		this.amount = amount;
		this.currentBalance = currentBalance;
		this.newBalance = newBalance;
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
	 * @return the debitCredit
	 */
	public String getDebitCredit() {
		return debitCredit;
	}

	/**
	 * @param debitCredit the debitCredit to set
	 */
	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
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

	/**
	 * @return the currentBalance
	 */
	public double getCurrentBalance() {
		return currentBalance;
	}

	/**
	 * @param currentBalance the currentBalance to set
	 */
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	/**
	 * @return the newBalance
	 */
	public double getNewBalance() {
		return newBalance;
	}

	/**
	 * @param newBalance the newBalance to set
	 */
	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	@Override
	public String toString() {
		return "Entry [accountId=" + accountId + ", bankId=" + bankId + ", payee=" + payee + ", date=" + date
				+ ", debitCredit=" + debitCredit + ", description=" + description + ", checkNumber=" + checkNumber
				+ ", amount=" + amount + ", currentBalance=" + currentBalance + ", newBalance=" + newBalance + "]";
	}


	/**
	 * 
	 * @return string that holds a completed entry
	 */
	public String getEntry() {
		
		//Variable to hold the return string
		String retEntry = null;
		
		//Building the return string
		retEntry = date + " - " + description + " - " + checkNumber + " - " + debitCredit + " - "
		+ amount + " - " + payee + " - " + bankId + " - " + accountId + " - " + currentBalance + " - " + newBalance;
		
		//Returning the string to the calling method
		return retEntry;
		
	}
	
	/**Returns true/false if the check number is valid
	 * @return boolean value is true if check num is < 1, otherwise false
	 */
	public boolean isCheckNumValid() {
		
		//Setting the boolean value for retValue to true.
		boolean retValue = true;
		
		//Set the retCheckNumValid value to false if checkNumber is less than 1
		if (checkNumber < 1) {
			retValue = false;
		} 
		
		return retValue;
		
	}
	
	/**Returns true/false if the amount is valid
	 * @return boolean value is true if amount is <= 0, otherwise false
	 */
	public boolean isAmountValid() {
		
		//Setting the boolean value for retValue to true.
		boolean retValue = true;
		
		//Set the retCheckNumValid value to false if amount is less than/equal to 0
		if (amount <= 0) {
			retValue = false;
		} 
		
		return retValue;
		
	}
	
	/**Returns true/false if the bank ID is valid
	 * @return boolean value is true if ID = 9, otherwise false
	 */
	public boolean isBankIdValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the bankId variable length. If not 9, change returnValue to false
		if(bankId.length() != 9) {
			retValue = false;
		}
		
		return retValue;
		
	}
	
	/**Returns true/false if the acct ID is valid
	 * @return boolean value is true if ID = 10, otherwise false
	 */
	public boolean isAccountIdValid() {
		
		//Setting the boolean returnValue to true
		boolean retValue = true;
		
		//Checking the account ID variable length. If not 10, change returnValue to false
		if(accountId.length() != 10) {
			retValue = false;
		}
		
		return retValue;
		
	}	

}
