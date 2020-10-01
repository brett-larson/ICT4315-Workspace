package test.ict4315.week9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week4.Entry;

/**The EntryTest class contains JUnit test cases that test the Entry class.
 * @author Brett Larson
 *@version 1.0
 */
class EntryTest {
	
	/**testGetEntry tests the getEntry method by validating the return string
	 */
	@Test
	void testGetEntry() {

		//Create a new check object with variable values
		Entry entry = new Entry("1234567890","545928150","Brett Larson","2/1/2020","Credit","Example Transaction",
				101,5000,1500,5500);
		
		//Setting the expected string
		String expectedString = "2/1/2020 - Example Transaction - 101 - Credit - 5000.0 - Brett Larson - 545928150 - 1234567890 - 1500.0 - 5500.0";
		
		//Calling the getCheckInfo method and storing the result
		String actualString = entry.getEntry();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		//Evaluate expected versus actual results
		assertEquals(expectedString,actualString);
		
	}
	
	/**testCheckNumPass is a positive test of the check number test method. 
	 */
	@Test
	void testCheckNumPass() {
		
		/*This test confirms the isCheckNumValid method returns true if 
		 *the check number is greater than 0
		 */
		
		//Create a new entry object
		Entry entry = new Entry();
		entry.setCheckNumber(1001);
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isCheckNumValid method and storing the result
		boolean actualResult = entry.isCheckNumValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	/**testCheckNumFail is a negative test of the check number test method. 
	 */
	@Test
	void testCheckNumFail() {
		
		//Create a new entry object
		Entry entry = new Entry();
		entry.setCheckNumber(-1001);
		
		//Setting expected result to false
		boolean expectedResult = false;
		
		//Calling the isCheckNumValid method and storing the result
		boolean actualResult = entry.isCheckNumValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	/**testAmountFail is a positive test of the amount test method. 
	 */
	@Test
	void testAmountPass() {
		
		//Create a new entry object
		Entry entry = new Entry();
		entry.setAmount(100);
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isAmountValid method and storing the result
		boolean actualResult = entry.isAmountValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	/**testAmountFail is a negative test of the amount test method. 
	 */
	@Test
	void testAmountFail() {
		
		//Create a new entry object
		Entry entry = new Entry();
		entry.setAmount(-100);
		
		//Setting expected result to false
		boolean expectedResult = false;
		
		//Calling the isAmountValid method and storing the result
		boolean actualResult = entry.isCheckNumValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	/**testBankIdValidFail is a positive test of the bank id test method. 
	 */
	@Test
	void testBankIdValidPass() {

		//Create a new entry object
		Entry entry = new Entry();
		entry.setBankId("123456789");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isBankIdValid method and storing the result
		boolean actualResult = entry.isBankIdValid();
		
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	/**testBankIdValidFail is a negative test of the bank id test method. 
	 */
	@Test
	void testBankIdValidFail() {

		//Create a new entry object
		Entry entry = new Entry();
		entry.setBankId("23456789");
		
		//Setting expected result to true
		boolean expectedResult = false;
		
		//Calling the isBankIdValid method and storing the result
		boolean actualResult = entry.isBankIdValid();
		
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	/**testAccountIdValidPass is a positive test of the account id test method. 
	 */
	@Test
	void testAccountIdValidPass() {

		//Create a new entry object
		Entry entry = new Entry();
		entry.setAccountId("1234567890");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isAccountIdValid method and storing the result
		boolean actualResult = entry.isAccountIdValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	/**testAccountIdValidFail is a negative test of the account id test method. 
	 */
	@Test
	void testAccountIdValidFail() {

		//Create a new entry object
		Entry entry = new Entry();
		entry.setAccountId("23456789");
		
		//Setting expected result to true
		boolean expectedResult = false;
		
		//Calling the isAccountIdValid method and storing the result
		boolean actualResult = entry.isAccountIdValid();
		
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}

}
