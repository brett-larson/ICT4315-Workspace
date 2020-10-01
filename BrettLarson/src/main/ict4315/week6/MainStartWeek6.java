package main.ict4315.week6;


public class MainStartWeek6 {

	public static void main(String[] args) {
		
		//Creating a new account object
		Account account = new Account("Checking",12345);
		
		//First transaction to add to the array list
		Transaction firstCredit= new Transaction("001", "02/15/2020", "First Credit Transaction", 100.00, "CREDIT");
		
		//Add transaction to arrayList
		account.addTransaction(firstCredit);
		
		//Display current balance
		System.out.println(account.getBalance());
		
		//Second transaction to add to the array list
		Transaction firstDebit = new Transaction("002", "02/15/2020", "First Debit Transaction", 25.00, "DEBIT");
		
		//Add transaction to arrayList
		account.addTransaction(firstDebit);
		
		//Display current balance
		System.out.println(account.getBalance());
		
		//Third transaction to add to the array list
		Transaction secondCredit= new Transaction("003", "02/01/2020", "Second Credit Transaction", 500.00, "CREDIT");
		
		//Add transaction to arrayList
		account.addTransaction(secondCredit);
		
		//Display current balance
		System.out.println(account.getBalance());
		
		//Fourth transaction to add to the array list
		Transaction secondDebit = new Transaction("004", "01/25/2020", "Second Credit Transaction", 250.00, "DEBIT");
		
		//Add transaction to arrayList
		account.addTransaction(secondDebit);
		
		//Display current balance
		System.out.println(account.getBalance());
		
		//Fifth transaction to add to the array list
		Transaction thirdCredit= new Transaction("005", "01/15/2020", "Third Credit Transaction", 1175.00, "CREDIT");
		
		//Add transaction to arrayList
		account.addTransaction(thirdCredit);
		
		//Display current balance
		System.out.println(account.getBalance());
		
		//Look up and display transaction that does not exist
		System.out.println(account.lookupTransaction("006"));
		
		//Reconcile account and display result
		System.out.println(account.reconcileTransactions());
		
	}

}
