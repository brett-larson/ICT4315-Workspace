package main.ict4315.week7;

/**The check class creates and manipulates check objects
 * @author Brett Larson
 * @version 1.0
 * @param accountId string to hold the account id
 * @param bankId string to hold the bank id
 * @param payee string to hold the payee
 * @param date string to hold the date
 * @param checkNumber int to hold the check number
 * @param amount double to hold the amount
 * 
 */
public class Check implements Printable {
	
	//Class variables
	private String accountId;
	private String bankId;
	private String payee;
	private String date;
	private int checkNumber;
	private double amount;
	
	
	//Object constructor that does not take any arguments.
	public Check() {
	}

	/**Constructor that will accept values for all class variables and create an object.
	 * @param accountId
	 * @param bankId
	 * @param payee
	 * @param date
	 * @param checkNumber
	 * @param amount
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bankId == null) ? 0 : bankId.hashCode());
		result = prime * result + checkNumber;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((payee == null) ? 0 : payee.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Check other = (Check) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (bankId == null) {
			if (other.bankId != null)
				return false;
		} else if (!bankId.equals(other.bankId))
			return false;
		if (checkNumber != other.checkNumber)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (payee == null) {
			if (other.payee != null)
				return false;
		} else if (!payee.equals(other.payee))
			return false;
		return true;
	}

	/**The getCheckInfo method returns a string with complete check details.
	 * @return string with check details.
	 */
	public String getCheckInfo() {
		
		//Variable to hold the string to be returned
		String retCheckString = null;
		
		//Build the checkInfo string
		retCheckString = checkNumber + " - " + payee + " - " + amount + " - " + date;
		
		return retCheckString;
		
	}
	
	/**
	 * The isCheckNumValid method validates the check num is a positive integer
	 * @return boolean value returns true if check num > 1, otherwise returns false
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
	
	/**
	 * The isAmountValid method validates the amount is a positive integer
	 * @return boolean value returns true if amount is > 0, otherwise returns false
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


	@Override
	public void print() {
		
		//Create a new print factory object
		PrinterFactory pf = new PrinterFactory();
		
		//Create a new Printer for checks
		Printer printer = pf.getPrinter("check");
		
		//Sending this object to the printer to print
		printer.print(this);
		
	}
		
}
