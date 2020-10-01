package test.ict4315.week6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week4.BankEntry;

/**JUnit test cases for the BankEntry class
 * @author Brett Larson
 * @version 1.1
 */
class BankEntryTest {

	@Test
	void testGetBankEntryFee() {
		//This test confirms the getUserEntry method returns the correct string

		//Create a new check object with variable values
		BankEntry bankEntry = new BankEntry("1234567890","545928150","Brett Larson","2/1/2020","Debit","Example Debit",
				0,1000,0,990,10.0,0.0);
		
		//Setting the expected string
		String expectedString = "2/1/2020 - Example Debit - 0 - Debit - 1000.0 - Brett Larson - 545928150 - 1234567890 - 0.0 - 990.0 - 10.0 - 0.0";
		
		//Calling the getCheckInfo method and storing the result
		String actualString = bankEntry.getBankEntry();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		//Evaluate expected versus actual results
		assertEquals(expectedString,actualString);
		
	}
	

	@Test
	void testGetBankEntryInterest() {
		//This test confirms the getUserEntry method returns the correct string

		//Create a new check object with variable values
		BankEntry bankEntry = new BankEntry("1234567890","545928150","Brett Larson","2/1/2020","Credit","Example Credit",
				0,1000,0,1025.0,0.0,25.0);
		
		//Setting the expected string
		String expectedString = "2/1/2020 - Example Credit - 0 - Credit - 1000.0 - Brett Larson - 545928150 - 1234567890 - 0.0 - 1025.0 - 0.0 - 25.0";
		
		//Calling the getCheckInfo method and storing the result
		String actualString = bankEntry.getBankEntry();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		//Evaluate expected versus actual results
		assertEquals(expectedString,actualString);
		
	}
	
	@Test
	void testIsFeeValidPass() {
		
		/*This test confirms the isFeeValid method returns true if 
		 *the fee is greater than 0
		 */
		
		//Create a new bankEntry object
		BankEntry bankEntry = new BankEntry();
		bankEntry.setFee(10.00);
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isFeeValid method and storing the result
		boolean actualResult = bankEntry.isFeeValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsFeeValidFail() {
		
		/*This test confirms the isFeeValid method returns false if 
		 *the fee is less than 0
		 */
		
		//Create a new bankEntry object
		BankEntry bankEntry = new BankEntry();
		bankEntry.setFee(-10.00);
		
		//Setting expected result to false
		boolean expectedResult = false;
		
		//Calling the isFeeValid method and storing the result
		boolean actualResult = bankEntry.isFeeValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsInterestValidPass() {
		
		/*This test confirms the isInterestValid method returns true if 
		 *the interest is greater than 0
		 */
		
		//Create a new bankEntry object
		BankEntry bankEntry = new BankEntry();
		bankEntry.setInterest(2.0);
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isFeeValid method and storing the result
		boolean actualResult = bankEntry.isInterestValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsInterestValidFail() {
		
		/*This test confirms the isInterestValid method returns false if 
		 *the interest is less than 0
		 */
		
		//Create a new bankEntry object
		BankEntry bankEntry = new BankEntry();
		bankEntry.setFee(-2);
		
		//Setting expected result to false
		boolean expectedResult = false;
		
		//Calling the isFeeValid method and storing the result
		boolean actualResult = bankEntry.isInterestValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
}
