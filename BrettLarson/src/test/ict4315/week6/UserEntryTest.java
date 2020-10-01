package test.ict4315.week6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week4.UserEntry;

/**JUnit test cases for the UserEntry class
 * @author Brett Larson
 * @version 1.1
 */
class UserEntryTest {

	@Test
	void testGetUserEntry() {
		//This test confirms the getUserEntry method returns the correct string

		//Create a new userEntry object with variable values
		UserEntry userEntry = new UserEntry("1234567890","545928150","Brett Larson","2/1/2020","Credit","Example Transaction",
				101,5000,1500,5500,"Check",false,"Some test notes");
		
		System.out.println(userEntry.toString());
		
		//Setting the expected string
		String expectedString = "2/1/2020 - Example Transaction - 101 - Credit - 5000.0 - Brett Larson - 545928150 - 1234567890 - 1500.0 - 5500.0 - Check - false - Some test notes";

		
		//Calling the getCheckInfo method and storing the result
		String actualString = userEntry.getUserEntry();
		
		//System.out.println(expectedString);
		//System.out.println(actualString);
		
		//Evaluate expected versus actual results
		assertEquals(expectedString,actualString);
		
	}
	
	@Test
	void testIsCategoryValidPass() {
		
		/*This test confirms the isCategoryValid method returns true if 
		 *the category variable holds at least one character
		 */
		
		//Create a new userEntry object
		UserEntry userEntry = new UserEntry();
		userEntry.setCategory("Utilities");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isCategoryValid method and storing the result
		boolean actualResult = userEntry.isCategoryValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsCategoryValidFail() {
		
		/*This test confirms the isCategoryValid method returns false if 
		 *the category variable holds less than one character
		 */
		
		//Create a new userEntry object
		UserEntry userEntry = new UserEntry();
		userEntry.setCategory("");
		
		//Setting expected result to false		
		boolean expectedResult = false;
		
		//Calling the isCategoryValid method and storing the result
		boolean actualResult = userEntry.isCategoryValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsNoteValidPass() {
		
		/*This test confirms the isNoteValid method returns true if 
		 *the note variable holds at least one character
		 */
		
		//Create a new userEntry object
		UserEntry userEntry = new UserEntry();
		userEntry.setNotes("Test Note");
		
		//Setting expected result to true
		boolean expectedResult = true;
		
		//Calling the isCategoryValid method and storing the result
		boolean actualResult = userEntry.isNoteValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	void testIsNoteValidFail() {
		
		/*This test confirms the isNoteValid method returns false if 
		 *the note variable holds less than one character
		 */
		
		//Create a new userEntry object
		UserEntry userEntry = new UserEntry();
		userEntry.setNotes("");
		
		//Setting expected result to false		
		boolean expectedResult = false;
		
		//Calling the isCategoryValid method and storing the result
		boolean actualResult = userEntry.isNoteValid();
		
		//System.out.println(expectedResult);
		//System.out.println(actualResult);
		
		//Evaluate expected versus actual results
		assertEquals(expectedResult,actualResult);
		
	}

}
