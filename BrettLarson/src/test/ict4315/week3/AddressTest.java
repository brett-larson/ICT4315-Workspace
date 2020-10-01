package test.ict4315.week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week3.Address;

class AddressTest {

	@Test
	void testStreetTwoNotNull() {
		/*This test confirms the getMailingAddress method sends the correct string
		 * back when street2 contains a string. 
		 */
		
		//Create a new Address object
		Address address = new Address("123 Main St.","Apt 25","Columbus","OH","43215");
		
		//Expected string
		String expectedString = "123 Main St. - Apt 25 - Columbus, OH. 43215";
		
		//Calling the getMailingAddress method and storing the result
		String actualString = address.getMailingAddress();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		//Evaluate expected versus actual results
		assertEquals(expectedString,actualString);
		

	}
	
	@Test
	void testStreetTwoNull() {
		/*This test confirms the getMailingAddress method sends the correct string
		 * back when street2 is null. 
		 */
		
		//Create a new Address object
		Address address = new Address("123 Main St.","Columbus","OH","43215");
		
		//Expected string
		String expectedString = "123 Main St. - Columbus, OH. 43215";
		
		//Calling the getMailingAddress method and storing the result
		String actualString = address.getMailingAddress();
		
		System.out.println(expectedString);
		System.out.println(actualString);
		
		//Evaluate expected versus actual results
		assertEquals(expectedString,actualString);
		
	}
	
	@Test
	void testStateLengthPass() {
		
		/*This test confirms the isStateValue method returns True if 
		 *the State string length is not two
		 */
		
		//Create a new Address object
		Address address = new Address();
		address.setState("OH");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isStateValid method and storing the result
		boolean actualResult = address.isStateValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testStateLengthFail() {
		
		/*This test confirms the isStateValue method returns false if 
		 *the State string length is not two
		 */
		
		//Create a new Address object and set state to "OHIO"
		Address address = new Address();
		address.setState("OHIO");
		
		//Setting expected result to false		
		boolean expectedResult = false;
		
		//Calling the isStateValid method and storing the result
		boolean actualResult = address.isStateValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}

}
