package test.ict4315.week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week1.Check;

class CheckTest {

	@Test
	void testOne() {
		
		//Create a new check object
		Check check = new Check();
		
		//Set the check object's variables
		check.accountId = "1234567890";
		check.bankId = "100100";
		check.payee = "Melissa Larson";
		check.checkNumber = 101;
		check.amount = 500.25;
		check.date = "1/14/2020";
		
		String expectedString = "101 - Melissa Larson - 500.25 - 1/14/2020";
		String actualString = check.getCheckInfo();
		
		System.out.println(expectedString);
		System.out.println(actualString);
		
		assertEquals(expectedString,actualString);
		
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testTwo() {
		
		//Create a new check object
		Check check = new Check();
		
		//Set the check object's variables
		check.accountId = "1234567890";
		check.bankId = "100100";
		check.payee = "Brett Larson";
		check.checkNumber = 101;
		check.amount = 1000;
		check.date = "01/14/2020";
		
		String expectedString = "101 - Brett Larson - 1000.0 - 01/14/2020";
		String actualString = check.getCheckInfo();
		
		System.out.println(expectedString);
		System.out.println(actualString);
		
		assertEquals(expectedString,actualString);
		
		
		//fail("Not yet implemented");
	}

}
