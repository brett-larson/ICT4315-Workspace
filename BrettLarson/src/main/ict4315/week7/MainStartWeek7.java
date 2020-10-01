package main.ict4315.week7;

import main.ict4315.week7.Account;
import main.ict4315.week7.Transaction;

public class MainStartWeek7 {

	public static void main(String[] args) {
		
		//Creating a new account object
		Account account = new Account("Checking",12345);
		
		//First transaction to add to the array list
		Transaction firstCredit= new Transaction("001", "02/15/2020", "First Credit Transaction", 100.00, "CREDIT");
		
		//Add transaction to arrayList
		account.addTransaction(firstCredit);
		
		//Second transaction to add to the array list
		Transaction firstDebit = new Transaction("002", "02/15/2020", "First Debit Transaction", 25.00, "DEBIT");
		
		//Add transaction to arrayList
		account.addTransaction(firstDebit);
		
		//Third transaction to add to the array list
		Transaction secondCredit= new Transaction("003", "02/01/2020", "Second Credit Transaction", 500.00, "CREDIT");
		
		//Add transaction to arrayList
		account.addTransaction(secondCredit);
		
		//Fourth transaction to add to the array list
		Transaction secondDebit = new Transaction("004", "01/25/2020", "Second Credit Transaction", 250.00, "DEBIT");
		
		//Add transaction to arrayList
		account.addTransaction(secondDebit);
		
		//Fifth transaction to add to the array list
		Transaction thirdCredit= new Transaction("005", "01/15/2020", "Third Credit Transaction", 1175.00, "CREDIT");
		
		//Add transaction to arrayList
		account.addTransaction(thirdCredit);
		
		//Print transactions
		account.print();
		
		//Create a check object
		Check check = new Check("1522396172", "123555789", "Melissa Larson", "02/15/2020", 101, 1000);
		
		//Print check
		check.print();
	}

}
