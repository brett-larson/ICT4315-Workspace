package main.ict4315.week8;

import main.ict4315.week8.Account;
import main.ict4315.week8.Transaction;

public class MainStartWeek8 {

	public static void main(String[] args) {
		
		//String variables to use when calling the print factory to get printers
		String printCheck = "Check";
		String printAccount = "Account";
		
		//Create a new print factory object
		PrinterFactory pfCheck = new PrinterFactory();
		
		//Get a check printer object
		Printer checkPrinter = pfCheck.getPrinter(printCheck);
		
		//Create a check object, including the printer object
		Check check = new Check("1522396172", "123555789", "Melissa Larson", "02/15/2020", 101, 1000, checkPrinter);
		
		//call the check print method
		check.print();
		
		//Create a new print factory object
		PrinterFactory pfAccount = new PrinterFactory();
		
		//Get an account printer object
		Printer accountPrinter = pfAccount.getPrinter(printAccount);
		
		//Creating a new account object
		Account account = new Account("Checking", 12345, accountPrinter);
		
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

		
	}

}
