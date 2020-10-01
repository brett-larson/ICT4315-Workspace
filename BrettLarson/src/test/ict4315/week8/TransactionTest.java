package test.ict4315.week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week6.Transaction;

class TransactionTest {

	@Test
	void testAmountPass() {
		
		//Create a new transaction object
		Transaction transaction = new Transaction();
		transaction.setAmount(100);
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isAmountValid method and storing the result
		boolean actualResult = transaction.isAmountValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testAmountHighValueFail() {
		
		//Create a new transaction object
		Transaction transaction = new Transaction();
		transaction.setAmount(250000000);
		
		//Setting expected result to false
		boolean expectedResult = false;
		
		//Calling the isAmountValid method and storing the result
		boolean actualResult = transaction.isAmountValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}	
	
	@Test
	void testAmountLowValueFail() {
		
		//Create a new transaction object
		Transaction transaction = new Transaction();
		transaction.setAmount(-10.00);
		
		//Setting expected result to false
		boolean expectedResult = false;
		
		//Calling the isAmountValid method and storing the result
		boolean actualResult = transaction.isAmountValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}	

}
