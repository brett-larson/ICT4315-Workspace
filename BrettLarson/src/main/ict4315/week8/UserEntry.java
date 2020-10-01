package main.ict4315.week8;

/**Class to build a Bank Entry object
 * @author Brett Larson
 * @version 1.0
 * @param category string to hold the type of transaction
 * @param reconciled boolean to hold if the transaction is reconciled
 * @param notes string to hold any additional notes
 */
public class UserEntry extends Entry {
	
	//Class variables
	private String category;
	private boolean reconciled;
	private String notes;
	
	/**
	 * Constructor that takes no arguments
	 */
	public UserEntry() {
	}
	
	/**
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
	 * @param category
	 * @param reconciled
	 * @param notes
	 */
	public UserEntry(String accountId, String bankId, String payee, String date, String debitCredit, String description,
			int checkNumber, double amount, double currentBalance, double newBalance, String category, boolean reconciled, String notes) {
		
		//Accessing the Entry (parent) class variables to create the object
		super (accountId, bankId, payee, date, debitCredit, description, checkNumber, amount, currentBalance, newBalance);
		
		//Adding child attributes to constructor
		this.category = category;
		this.reconciled = reconciled;
		this.notes = notes;
	}

	/**Constructor that uses only child class arguments
	 * @param category
	 * @param reconciled
	 * @param notes
	 */
	public UserEntry(String category, boolean reconciled, String notes) {
		this.category = category;
		this.reconciled = reconciled;
		this.notes = notes;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the reconciled
	 */
	public boolean isReconciled() {
		return reconciled;
	}

	/**
	 * @param reconciled the reconciled to set
	 */
	public void setReconciled(boolean reconciled) {
		this.reconciled = reconciled;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "UserEntry [category=" + category + ", reconciled=" + reconciled + ", notes=" + notes + "]";
	}
	
	/**The getUserEntry method returns a string with a user entry.
	 * @return string that holds a completed user entry
	 */	
	public String getUserEntry() {
		
		//Variable to hold the return string
		String retEntry = null;
		
		//Building the return string using getters from the Entry class and the UserEntry variables
		retEntry = getDate() + " - " + getDescription() + " - " + getCheckNumber() + " - " + getDebitCredit() + " - "
				+ getAmount() + " - " + getPayee() + " - " + getBankId() + " - " + getAccountId() + " - " + getCurrentBalance() + " - " + getNewBalance() + " - " 
				+ category + " - " + reconciled + " - " + notes;
		
		//Returning the string to the calling method
		return retEntry;
		
	}
	
	/**isCategoryValid method validates the category string has at least one character
	 * @return boolean value returns true if category length > 0, otherwise returns false
	 */
	public boolean isCategoryValid() {
		
		//Setting the boolean value for retValue to true.
		boolean retValue = true;
		
		//Set the retValue value to false if category string length <= 0
		if (category.length() <= 0) {
			retValue = false;
		} 
		
		return retValue;
		
	}
	
	/**The isNoteValid method validates the note string has at least one character
	 * @return boolean value returns true if note length > 0, otherwise returns false
	 */
	public boolean isNoteValid() {
		
		//Setting the boolean value for retValue to true.
		boolean retValue = true;
		
		//Set the retValue value to false if amount is less than/equal to 0
		if (notes.length() <= 0) {
			retValue = false;
		} 
		
		return retValue;
		
	}

}
