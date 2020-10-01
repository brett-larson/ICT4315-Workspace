package test.ict4315.week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week1.Address;

class AddressTest {

	@Test
	void testOne() {
		
		//Create a new Address object
		Address address = new Address();
		
		//Set the address object's variables
		address.street1 = "123 Main St.";
		address.street2 = "Apt 25";
		address.city = "Columbus";
		address.state = "OH";
		address.zipCode = "43215";
		
		//String to compare the expected return vs the actual return value
		String expectedString = "123 Main St. - Apt 25 - Columbus, OH. 43215";
		String actualString = address.getMailingAddress();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		assertEquals(expectedString,actualString);
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testTwo() {
		
		//Create a new Address object
		Address address = new Address();
		
		//Set the address object's variables
		address.street1 = "925 High Street";
		//address.street2 = "Apt 25";
		address.city = "Columbus";
		address.state = "OH";
		address.zipCode = "43215";
		
		//String to compare the expected return vs the actual return value
		String expectedString = "925 High Street - Columbus, OH. 43215";
		String actualString = address.getMailingAddress();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		assertEquals(expectedString,actualString);
		
		//fail("Not yet implemented");
	}

}
