package test.ict4315.week4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week3.Bank;
import main.ict4315.week3.Address;

class BankTest {

	@Test
	void testBankInfo() {
		
		//Create a new address object to test
		Address address = new Address("200 High St.", "Columbus", "OH", "43215");

		//Create a new check object with variable values
		Bank bank = new Bank("123456789", "Key Bank", "6149882345", address);
		
		//Setting the expected string
		String expectedString = "123456789 - Key Bank - 6149882345 - 200 High St. - Columbus, OH. 43215";
		
		//Calling the getCheckInfo method and storing the result
		String actualString = bank.getBankInfo();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		//Evaluate expected versus actual results
		assertEquals(expectedString,actualString);
		
	}
	
	@Test
	void testIsBankIdValidPass() {

		//Create a new bank object with no variables
		Bank bank = new Bank();
		bank.setBankId("123456789");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isBankIdValid method and storing the result
		boolean actualResult = bank.isBankIdValid();
		
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsBankIdValidFail() {

		//Create a new bank object with no variables
		Bank bank = new Bank();
		bank.setBankId("23456789");
		
		//Setting expected result to true
		boolean expectedResult = false;
		
		//Calling the isBankIdValid method and storing the result
		boolean actualResult = bank.isBankIdValid();
		
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsBankNameValidPass() {

		//Create a new bank object with no variables
		Bank bank = new Bank();
		bank.setName("Key Bank");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isBankIdValid method and storing the result
		boolean actualResult = bank.isBankNameValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsBankNameValidFail() {

		//Create a new bank object with no variables
		Bank bank = new Bank();
		bank.setName("");
		
		//Setting expected result to true
		boolean expectedResult = false;
		
		//Calling the isBankIdValid method and storing the result
		boolean actualResult = bank.isBankNameValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	void testIsPhoneNumberValidPass() {
		
		//Create a new bank object with no variables
		Bank bank = new Bank();
		bank.setPhoneNumber("55512312345");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isBankIdValid method and storing the result
		boolean actualResult = bank.isPhoneNumberValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsPhoneNumberValidFail() {

		//Create a new bank object with no variables
		Bank bank = new Bank();
		bank.setPhoneNumber("555-123-12345");
		
		//Setting expected result to true
		boolean expectedResult = false;
		
		//Calling the isBankIdValid method and storing the result
		boolean actualResult = bank.isPhoneNumberValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}

}
