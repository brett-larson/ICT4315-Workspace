package test.ict4315.week5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week3.Address;
import main.ict4315.week3.User;


class UserTest {

	@Test
	void testGetUserInfo() {
		
		//Create a new address object to test
		Address address = new Address("1515 Front St.", "Columbus", "OH", "43215");

		//Create a new user object with variable values
		User user = new User("1234567890", "Brett", "Larson", address);
		
		//Setting the expected string
		String expectedString = "1234567890 - Brett Larson - 1515 Front St. - Columbus, OH. 43215";
		
		//Calling the getUserInfo method and storing the result
		String actualString = user.getUserInfo();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		//Evaluate expected versus actual results
		assertEquals(expectedString,actualString);
		
	}
	
	@Test
	void testIsUserIdValidPass() {

		//Create a new user object with no variables
		User user = new User();
		user.setUserId("1234567890");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isUserIdValud method and storing the result
		boolean actualResult = user.isUserIdValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsUserIdValidFail() {

		//Create a new user object with no variables
		User user = new User();
		user.setUserId("12345");
		
		//Setting expected result to true
		boolean expectedResult = false;
		
		//Calling the isBankIdValid method and storing the result
		boolean actualResult = user.isUserIdValid();
		
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsFirstNameValidPass() {

		//Create a new user object with no variables
		User user = new User();
		user.setFirstName("Brett");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isFirstNameValid method and storing the result
		boolean actualResult = user.isFirstNameValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testisFirstNameValidFail() {

		//Create a new user object with no variables
		User user = new User();
		user.setFirstName("");
		
		//Setting expected result to true
		boolean expectedResult = false;
		
		//Calling the isFirstNameValid method and storing the result
		boolean actualResult = user.isFirstNameValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	void testIsLastNameValidPass() {
		
		//Create a new user object with no variables
		User user = new User();
		user.setLastName("Larson");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isLastNameValid method and storing the result
		boolean actualResult = user.isLastNameValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsLastNameValidFail() {

		//Create a new user object with no variables
		User user = new User();
		user.setLastName("");
		
		//Setting expected result to true
		boolean expectedResult = false;
		
		//Calling the isLastNameValid method and storing the result
		boolean actualResult = user.isLastNameValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}

}
