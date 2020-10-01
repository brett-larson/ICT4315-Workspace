package main.ict4315.week6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

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
	public String printMethod() {
		
		//String to hold the return value
		String retString = "";
		
		//Try-catch block to create the output file and catch any exceptions
		try {
			//Create a new output.txt file object
			File file = new File("output.txt");
			
			//Check if this file already exists in the project
			if(!file.exists()) {
				
				//Create a new file
				file.createNewFile();
				
				//Create a new PrintWriter object to write to the file
				PrintWriter pw = new PrintWriter(file);
				
				//What is printed to the output.txt file
				pw.println("Check Number: " + checkNumber + "	Date: " + date);
				pw.println("Payee: " + payee + "	Amount:" + amount);
				pw.println("Memo:		Signature");
				pw.println(accountId + " || " + bankId);
				
				//Closing the PrintWriter object
				pw.close();
				
				retString = "The file was created successfully.";
				
				} else {
					retString = "The file already exists.";
				}
		} 
		catch (IOException e) {
			retString = "An unexpected error was encountered.";
			e.printStackTrace();
		}
		
		return retString;

	}
		
}
