package test.ict4315.week7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ict4315.week6.Account;
import main.ict4315.week6.Transaction;


class AccountTest {
	
	@BeforeEach
	void setUp() {
		//Fill in later
	}

	@Test
	void testReconcileAccountPass() {
		
		//Creating a new account object
		Account account = new Account("Checking",12345);
		
		//First transaction to add to the array list
		Transaction credit = new Transaction("005", "01/15/2020", "Third Credit Transaction", 1175.00, "CREDIT");
		account.addTransaction(credit);
		
		//Second transaction to add to the array list
		Transaction debit = new Transaction("004", "01/25/2020", "Second Credit Transaction", 250.00, "DEBIT");
		account.addTransaction(debit);
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isCheckNumValid method and storing the result
		boolean actualResult = account.reconcileTransactions();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testReconcileAccountFail() {
		
		//Creating a new account object
		Account account = new Account("Checking",12345);
		
		//transaction to add to the array list
		Transaction transaction = new Transaction("001", "01/15/2020", "Example Transaction", 100.00, "CREDIT");
		account.addTransaction(transaction);
		
		account.getTransactions().add(0, transaction);
		
		assertFalse(account.reconcileTransactions());
		
	}
	
	@Test
	void testTransactionLookupPass() {
		
		//Creating a new account object
		Account account = new Account("Checking",12345);
		
		//First transaction to add to the array list
		Transaction credit = new Transaction("005", "01/15/2020", "Third Credit Transaction", 1175.00, "CREDIT");
		account.addTransaction(credit);
		
		//Second transaction to add to the array list
		Transaction debit = new Transaction("004", "01/25/2020", "Second Credit Transaction", 250.00, "DEBIT");
		account.addTransaction(debit);
		
		//Setting expected result to true
		String expectedResult = "Transaction [transactionId=005, date=01/15/2020, description=Third Credit Transaction, amount=1175.0, type=CREDIT]";
		
		//Looking up a transaction that does exist
		Transaction actualResult = account.lookupTransaction("005");
		String result = actualResult.toString();
		
		//System.out.println(expectedResult);
		//System.out.println(result);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,result);
		
	}
	
	@Test
	void testTransactionLookupFail() {
		
		//Creating a new account object
		Account account = new Account("Checking",12345);
		
		//First transaction to add to the array list
		Transaction credit = new Transaction("005", "01/15/2020", "Third Credit Transaction", 1175.00, "CREDIT");
		account.addTransaction(credit);
		
		//Second transaction to add to the array list
		Transaction debit = new Transaction("004", "01/25/2020", "Second Credit Transaction", 250.00, "DEBIT");
		account.addTransaction(debit);
		
		//Setting expected result to true
		Transaction expectedResult = null;
		
		//Looking up a transaction that does not exist
		Transaction actualResult = account.lookupTransaction("001");
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test 
	void addTransactionTest() {
		
		//Creating a new account object
		Account account = new Account("Checking",12345);
		
		//First transaction to add to the array list
		Transaction credit = new Transaction("005", "01/15/2020", "Third Credit Transaction", 1175.00, "CREDIT");
		
		account.addTransaction(credit);
		
		int expectedResult = 1;
		int actualResult = account.getTransactions().size();
		assertEquals(expectedResult,actualResult);
		
	}
	

}
