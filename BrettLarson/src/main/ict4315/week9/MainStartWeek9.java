package main.ict4315.week9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import main.ict4315.week9.Account;

/**MainStartWeek9 acts as the main method class for this week's assignment 
 * @author Brett Larson
 * @version 1.0
 */
public class MainStartWeek9  {
	

	/**writeChecks method takes an array of checks and converts it to a serialized file
	 * Files are stored within the project folder
	 * @param checkArray - Turns array into .dat serialized file
	 */
	public static void writeChecks(Check[] checkArray) {
		
		//File name to store the serialized data
		String fileName = "Checks.dat";
		
		try {
			
			//Creating objects to generate the file and write data to it
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			//Write the checkArray to the file
			out.writeObject(checkArray);
			
			//Closing the objects
			out.close();
			file.close();
			
		} catch(IOException e) {
			System.out.println("There was an error in serializing the array");
			e.printStackTrace();
		}
		
	}
	
	/**writeAccounts method takes an array of accounts and converts it to a serialized file
	 * Files are stored within the project folder
	 * @param accountArray - Turns array into .dat serialized file
	 */
	public static void writeAccounts(Account[] accountArray) {
		
		//File name to store the serialized data
		String fileName = "Account.dat";
		
		try {
			
			//Creating objects to generate the file and write data to it
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			//Write the accountArray to the file
			out.writeObject(accountArray);
			
			//Closing the objects
			out.close();
			file.close();
			
		} catch(IOException e) {
			System.out.println("There was an error in serializing the array");
			e.printStackTrace();
		}	
		
	}
	
	/**readChecks is a method to read from a file containing serialized data
	 * and write the data to an array
	 * @return Array checkArray - array that holds checks
	 */
	public static Check[] readChecks() {
		
		//Check array to hold the deserialized data
		Check[] checkArray = new Check[5];

		//File name that stores the serialized data
		String fileName = "Checks.dat";
		
		try {
			
			//Creating objects to read from the file and write to an array
			FileInputStream  file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			//Read and add data to the checkArray
			checkArray = (Check[])in.readObject();
			
			//Close objects
			in.close();
			file.close();
			
		} catch(IOException e) {
			System.out.println("There was an IO error in deserializing the array");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("There was a ClassNotFound error in deserializing the array");
			e.printStackTrace();
		}
		
		return checkArray;
		
	}
	
	/**readAccount is a method to read from a file containing serialized data
	 * and write the data to an array
	 * @return Array accountArray - array that holds accounts
	 */
	public static Account[] readAccount() {
		
		//Check array to hold the deserialized data
		Account[] accountArray = new Account[5];

		//File name that stores the serialized data
		String fileName = "Account.dat";
		
		try {
			
			//Creating objects to read from the file and write to an array
			FileInputStream  file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			//Read and add data to the accountArray
			accountArray = (Account[])in.readObject();
			
			//Close objects
			in.close();
			file.close();
			
		} catch(IOException e) {
			System.out.println("There was an IO error in deserializing the array");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("There was a ClassNotFound error in deserializing the array");
			e.printStackTrace();
		}
		
		return accountArray;
		
	}
	
	public static void main(String[] args) {
		
		//String variables to use when calling the print factory to get printers
		String printCheck = "Check";
		String printAccount = "Account";
		
		//Create a new print factory object
		PrinterFactory pfCheck = new PrinterFactory();
		
		//Get a check printer object
		Printer checkPrinter = pfCheck.getPrinter(printCheck);
		
		//Create a new print factory object
		PrinterFactory pfAccount = new PrinterFactory();
		
		//Get an account printer object
		Printer accountPrinter = pfAccount.getPrinter(printAccount);
		
		//Two fixed length arrays to hold checks and accounts
		Check[] checkArray = new Check[5];
		Account[] accountArray = new Account[5];
		
		//Creating 5 new account objects
		Account account1 = new Account("Checking",12345, accountPrinter);
		Account account2 = new Account("Checking",23456, accountPrinter);
		Account account3 = new Account("Checking",34567, accountPrinter);
		Account account4 = new Account("Checking",45678, accountPrinter);
		Account account5 = new Account("Checking",56789, accountPrinter);
		
		//First transaction to add to the array list
		Transaction firstCredit= new Transaction("001", "02/15/2020", "First Credit Transaction", 100.00, "CREDIT");
		
		//Add first transaction to arrayList of all accounts
		account1.addTransaction(firstCredit);
		account2.addTransaction(firstCredit);
		account3.addTransaction(firstCredit);
		account4.addTransaction(firstCredit);
		account5.addTransaction(firstCredit);
		
		//Second transaction to add to the array list
		Transaction firstDebit = new Transaction("002", "02/15/2020", "First Debit Transaction", 25.00, "DEBIT");
		
		//Add second transaction to arrayList of all accounts
		account1.addTransaction(firstDebit);
		account2.addTransaction(firstDebit);
		account3.addTransaction(firstDebit);
		account4.addTransaction(firstDebit);
		account5.addTransaction(firstDebit);
		
		//Third transaction to add to the array list
		Transaction secondCredit= new Transaction("003", "02/01/2020", "Second Credit Transaction", 500.00, "CREDIT");
		
		//Add third transaction to arrayList of all accounts
		account1.addTransaction(secondCredit);
		account2.addTransaction(secondCredit);
		account3.addTransaction(secondCredit);
		account4.addTransaction(secondCredit);
		account5.addTransaction(secondCredit);
		
		//Fourth transaction to add to the array list
		Transaction secondDebit = new Transaction("004", "01/25/2020", "Second Credit Transaction", 250.00, "DEBIT");
		
		//Add fourth transaction to arrayList of all accounts
		account1.addTransaction(secondDebit);
		account2.addTransaction(secondDebit);
		account3.addTransaction(secondDebit);
		account4.addTransaction(secondDebit);
		account5.addTransaction(secondDebit);
		
		//Fifth transaction to add to the array list
		Transaction thirdCredit= new Transaction("005", "01/15/2020", "Third Credit Transaction", 1175.00, "CREDIT");
		
		//Add fifth transaction to arrayList of all accounts
		account1.addTransaction(thirdCredit);
		account2.addTransaction(thirdCredit);
		account3.addTransaction(thirdCredit);
		account4.addTransaction(thirdCredit);
		account5.addTransaction(thirdCredit);
		
		//Populate the array with the accounts
		accountArray[0] = account1;
		accountArray[1] = account2;
		accountArray[2] = account3;
		accountArray[3] = account4;
		accountArray[4] = account5;
		
		//Create 5 check objects, including the printer object
		Check check1 = new Check("1522396172", "123555789", "Melissa Larson", "03/01/2020", 101, 1000, checkPrinter);
		Check check2 = new Check("1522396172", "123555789", "Brett Larson", "03/02/2020", 102, 2000, checkPrinter);
		Check check3 = new Check("1522396172", "123555789", "Susan Larson", "03/03/2020", 103, 3000, checkPrinter);
		Check check4 = new Check("1522396172", "123555789", "Johnny Larson", "03/04/2020", 104, 4000, checkPrinter);
		Check check5 = new Check("1522396172", "123555789", "Jira Larson", "03/05/2020", 105, 5000, checkPrinter);

		//Populate the array with the checks
		checkArray[0] = check1;
		checkArray[1] = check2;
		checkArray[2] = check3;
		checkArray[3] = check4;
		checkArray[4] = check5;

		//Display the contents of the accountArray
		System.out.println(Arrays.toString(accountArray));
		
		//Display the contents of the checkArray
		System.out.println(Arrays.toString(checkArray));
		
		//Call the writeAccounts and writeChecks methods to write to .dat files
		writeAccounts(accountArray);
		writeChecks(checkArray);
		
		//Fill both account and check arrays with 'null'
		Arrays.fill(accountArray, null);
		Arrays.fill(checkArray, null);
		
		//Display the contents of the accountArray
		System.out.println(Arrays.toString(accountArray));
		
		//Display the contents of the checkArray
		System.out.println(Arrays.toString(checkArray));
		
		//Call the readAccount and readChecks methods to populate the array
		accountArray = readAccount();
		checkArray = readChecks();
		
		//Display the contents of the accountArray
		System.out.println(Arrays.toString(accountArray));
		
		//Display the contents of the checkArray
		System.out.println(Arrays.toString(checkArray));

	}

}
