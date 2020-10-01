package test.ict4315.week9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import java.io.File;
//import java.io.IOException;

//import org.junit.Rule;
//import org.junit.rules.TemporaryFolder;

import main.ict4315.week5.Check;

/**The CheckTest class contains JUnit test cases to test the functionality of the Check class.
 * @author Brett Larson
 */
class CheckTest {
	
	@Test
	void testGetCheckInfo() {
		//This test confirms the getCheckInfo method returns the correct string

		//Create a new check object with variable values
		Check check = new Check("1234567890","100100","Melissa Larson","1/14/2020",101,500);
		
		//Setting the expected string
		String expectedString = "101 - Melissa Larson - 500.0 - 1/14/2020";
		
		//Calling the getCheckInfo method and storing the result
		String actualString = check.getCheckInfo();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		//Evaluate expected versus actual results
		assertEquals(expectedString,actualString);
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testCheckNumPass() {
		
		/*This test confirms the isCheckNumPositive method returns true if 
		 *the check number is greater than 0
		 */
		
		//Create a new check object
		Check check = new Check();
		check.setCheckNumber(1001);
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isCheckNumValid method and storing the result
		boolean actualResult = check.isCheckNumValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testCheckNumFail() {
		
		/*This test confirms the isCheckNumPositive method returns false if 
		 *the check number is less than 1
		 */
		
		//Create a new check object
		Check check = new Check();
		check.setCheckNumber(-200);
		
		//Setting expected result to false
		boolean expectedResult = false;
		
		//Calling the isCheckNumValid method and storing the result
		boolean actualResult = check.isCheckNumValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testCheckAmountPass() {
		
		//Create a new check object
		Check check = new Check();
		check.setAmount(100);
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isCheckNumValid method and storing the result
		boolean actualResult = check.isAmountValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testCheckAmountFail() {
		
		//Create a new check object
		Check check = new Check();
		check.setAmount(-100);
		
		//Setting expected result to false
		boolean expectedResult = false;
		
		//Calling the isCheckNumValid method and storing the result
		boolean actualResult = check.isCheckNumValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}	
	
	
	@Test
	void testCheckPrintMethodFileDoesNotExist() {
		
		//Create a new check object
		Check check = new Check("1234567890","100100","Melissa Larson","1/14/2020",101,500);
		check.printMethod();
		
		//Setting expected result to "The file was created successfully."
		String expectedResult = "The file was created successfully.";
		
		//Calling the printMethod method and storing the result
		String actualResult = check.printMethod();
		
		System.out.println(expectedResult);
		System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testCheckPrintMethodFileExists() {
		
		//Create a new check object
		Check check = new Check("1234567890","100100","Melissa Larson","1/14/2020",101,500);
		check.printMethod();
		
		//Setting expected result to "The file already exists."
		String expectedResult = "The file already exists.";
		
		//Calling the printMethod method and storing the result
		String actualResult = check.printMethod();
		
		System.out.println(expectedResult);
		System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	


}
