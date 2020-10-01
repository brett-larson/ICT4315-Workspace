package main.ict4315.week7;

import java.util.ArrayList;

/**This class represents an account.
 * @author Brett Larson
 * @version 1.0
 */
public class Account implements Printable {
	
	//Class variables
	private String accountId;
	private int accountNum;
	private double balance = 0;
	private ArrayList<Transaction> transactionArrayList = new ArrayList<>();
	
	/**
	 * Constructor that accepts no variables
	 */
	public Account() {
	}


	/**Constructor that only accepts an Account ID and  Account Number variables
	 * @param id
	 * @param accountNum
	 */
	public Account(String accountId, int accountNum) {
		this.accountId = accountId;
		this.accountNum = accountNum;
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
	 * @return the accountNum
	 */
	public int getAccountNum() {
		return accountNum;
	}


	/**
	 * @param accountNum the accountNum to set
	 */
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}


	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @return the transactionArrayList
	 */
	public ArrayList<Transaction> getTransactionArrayList() {
		return transactionArrayList;
	}


	/**
	 * @param transactionArrayList the transactionArrayList to set
	 */
	public void setTransactionArrayList(ArrayList<Transaction> transactionArrayList) {
		this.transactionArrayList = transactionArrayList;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + accountNum;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transactionArrayList == null) ? 0 : transactionArrayList.hashCode());
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
		Account other = (Account) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (accountNum != other.accountNum)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (transactionArrayList == null) {
			if (other.transactionArrayList != null)
				return false;
		} else if (!transactionArrayList.equals(other.transactionArrayList))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNum=" + accountNum + ", balance=" + balance
				+ ", transactionArrayList=" + transactionArrayList + "]";
	}


	/**The addTransaction method takes transaction objects and adds them to the array 
	 * @param transaction
	 */
	public void addTransaction(Transaction transaction) {
		
		//Add the new transaction to the transactions array list
		transactionArrayList.add(transaction);
		
		//Logic to update the account balance based on the transaction type
		if(transaction.getType() == TransactionType.CREDIT) {
			balance += transaction.getAmount();
		} else if(transaction.getType() == TransactionType.DEBIT) {
			balance -= transaction.getAmount();
		}
	 }
	
	
	/**The lookupTransaction method takes a transaction ID (string) argument
	 * and returns the associated transaction or null if there is no transaction. 
	 * @param transactionId
	 * @return boolean
	 */
	 public Transaction lookupTransaction (String transactionId) {
		 
		 //Variable to hold a transaction and defaults to null
		 Transaction transaction = null;
		 
		 //String to hold the transaction ID from the main method
		 String transId = transactionId;
		 
		 //Loop through the array
		 for (int i = 0; i < transactionArrayList.size(); i++) {
			 
			 //Assessing each object to see if it matches the criteria
			 if (transactionArrayList.get(i).getTransactionId().equalsIgnoreCase(transId)) {
				 transaction = transactionArrayList.get(i);
			 }
			 
		 }
		 
		 return transaction;
		 
	 }
	 
	 /**The reconcileTransactions method loops through all transactions and adds their
	  * amounts. Then, it compares the account balance with the total calculated.
	  * It returns true if it is the same or false if not
	  * @return boolean
	  */
	 public boolean reconcileTransactions() {
		 
		 //Default return value
		 boolean retValue = true;
		 
		 //Variable to hold the calculated balance
		 double reconcileBalance = 0;
		 
		 //Loop to look at all variables in the array.
		 for (int i = 0; i < transactionArrayList.size(); i++) {
			 
			 //If the transaction type is credit, add the amount to the reconcileBalance variable
			 //Else, subtract the value from the reconcileBalance variable
			 if(transactionArrayList.get(i).getType() == TransactionType.CREDIT) {
				 reconcileBalance += transactionArrayList.get(i).getAmount();
			 } else {
				 reconcileBalance -= transactionArrayList.get(i).getAmount();
			 }
			 			 
		 }
		 
		 //If the two balances don't match, switch to false.
		 if(reconcileBalance != balance) {
			 retValue = false;
		 }
		 
		 return retValue;
		 
	 }
	 

	@Override
	public void print() {
		
		//Create a new print factory object
		PrinterFactory pf = new PrinterFactory();
		
		//Create a new Printer for checks
		Printer printer = pf.getPrinter("account");
		
		//Sending this object to the printer to print
		printer.print(this);
		
	}
	
}
