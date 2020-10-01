package main.ict4315.week4;

import java.util.Scanner;

/**Main class used to build user-defined objects associated with a bank account register.
 * @author Brett Larson
 * @version 1.0
 */
public class MainStart {
	
	/**
	 * Builds a user object based on user inputs.
	 * @param userInput A string to hold user input.
	 */
	public static void buildUserObject() {
		//This method is called when an application user chooses to build a User object
		
		//Create a new scanner object to accept user input
		Scanner input = new Scanner(System.in);
		
		//Create a new user object
		User user = new User();
		Address address = new Address();
		
		//String to hold the user's input
		String userInput;
		
		//Code block to obtain the user's ID and store it in the user object
		System.out.print("Enter your 10 digit User ID: ");
		userInput = input.nextLine();
		user.setUserId(userInput);
		
		//Code to check the validity of the User ID and provide an error if it is incorrect
		if(user.isUserIdValid() == false) {
			System.out.println("The User ID " + user.getUserId() + " is not valid.");
		}
		
		//Code to obtain the user's first name and store it in the user object
		System.out.print("Enter your First Name: ");
		userInput = input.nextLine();
		user.setFirstName(userInput);
		
		//Code to check the validity of the first name and provide an error if it is incorrect
		if(user.isFirstNameValid() == false) {
			System.out.println("The first name " + user.getFirstName() + " is not valid.");
		}
		
		//Code to obtain the user's last name and store it in the user object
		System.out.print("Enter your Last Name: ");
		userInput = input.nextLine();
		user.setLastName(userInput);
		
		//Code to check the validity of the last name and provide an error if it is incorrect
		if(user.isLastNameValid() == false) {
			System.out.println("The last name " + user.getLastName() + " is not valid.");
		}
		
		//Code to obtain and store the user's Street1 Address
		System.out.print("Enter Address (Street1): ");
		userInput = input.nextLine();
		address.setStreet1(userInput);
		
		//Code to obtain and store the user's Street2 Address
		System.out.print("Enter Address (Street2): ");
		userInput = input.nextLine();
		address.setStreet2(userInput);
		
		//Code to obtain and store the user's city
		System.out.print("Enter City: ");
		userInput = input.nextLine();
		address.setCity(userInput);
		
		//Code to obtain and store the user's State
		System.out.print("Enter State (Two Characters Only): ");
		userInput = input.nextLine();
		address.setState(userInput);
		
		if(address.isStateValid() == false) {
			System.out.println("The State " + address.getState() + " is not valid.");
		}
		
		//Code to obtain and store the user's zip code
		System.out.print("Enter Zip Code (Five Characters Only): ");
		userInput = input.nextLine();
		address.setZipCode(userInput);
		
		if(address.isZipCodeValid() == false) {
			System.out.println("The Zip Code " + address.getZipCode() + " is not valid.");
		}
		
		//Adding data to the address object associated with the user object
		user.setAddress(address);
		
		//Final statements to print the object's data
		System.out.println("The user object was created and tested successfully.");
		System.out.println(user.getUserInfo());
		
		//close the scanner input
		input.close();
		
	}
	
	/**
	 * Builds a bank object based on user inputs.
	 * @param userInput A string to hold user input.
	 */
	public static void buildBankObject() {
		//This method is called when an application user chooses to build a User
		
		//Create a new scanner object to accept user input
		Scanner input = new Scanner(System.in);
		
		//Create a new bank object
		Bank bank = new Bank();
		Address address = new Address();
		
		//String to hold the user's input
		String userInput;
		
		//Code block to obtain the bank's ID and store it in the bank object
		System.out.print("Enter 9 digit bank ID: ");
		userInput = input.nextLine();
		bank.setBankId(userInput);
		
		//Code to check the validity of the bank ID and provide an error if it is incorrect
		if(bank.isBankIdValid() == false) {
			System.out.println("The Bank ID " + bank.getBankId() + " is not valid.");
		}
		
		//Code to obtain the bank's name and store it in the bank object
		System.out.print("Enter Bank Name: ");
		userInput = input.nextLine();
		bank.setName(userInput);
		
		//Code to check the validity of the bank name and provide an error if it is incorrect
		if(bank.isBankNameValid() == false) {
			System.out.println("The bank name " + bank.getName() + " is not valid.");
		}		
		
		//Code to obtain the bank phone number and store it in the bank object
		System.out.print("Enter the bank's phone number (digits only): ");
		userInput = input.nextLine();
		bank.setPhoneNumber(userInput);
		
		//Code to check the validity of the bank phone number and provide an error if it is incorrect
		if(bank.isPhoneNumberValid() == false) {
			System.out.println("The bank phone number " + bank.getPhoneNumber() + " is not valid.");
		}
		
		//Code to obtain the bank's address it in the address object
		System.out.print("Enter Address (Street1): ");
		userInput = input.nextLine();
		address.setStreet1(userInput);
		
		//Code to obtain the bank's address it in the address object
		System.out.print("Enter Address (Street2): ");
		userInput = input.nextLine();
		address.setStreet2(userInput);
		
		//Code to obtain the bank's address it in the address object
		System.out.print("Enter City: ");
		userInput = input.nextLine();
		address.setCity(userInput);
		
		//Code to obtain the bank's address it in the address object
		System.out.print("Enter State (Two Characters Only): ");
		userInput = input.nextLine();
		address.setState(userInput);
		
		if(address.isStateValid() == false) {
			System.out.println("The State " + address.getState() + " is not valid.");
		}
		
		//Code to obtain the bank's address it in the address object
		System.out.print("Enter Zip Code (Five Characters Only): ");
		userInput = input.nextLine();
		address.setZipCode(userInput);
		
		if(address.isZipCodeValid() == false) {
			System.out.println("The Zip Code " + address.getZipCode() + " is not valid.");
		}
		
		//Setting the variables in the address object associated with the bank object
		bank.setAddress(address);
		
		//Final print statement to display the object's data
		System.out.println("The user object was created and tested successfully.");
		System.out.println(bank.getBankInfo()); //This is where I get the NullPointerException
		
		//close the scanner input
		input.close();
		
	}
	
	/**
	 * Builds a check object based on user inputs.
	 * @param userInput - A string to hold user input.
	 * @param userIntInput - An int variable to hold user input.
	 * @param userDoubleInput - A double variable to hold user input.
	 */
	public static void buildCheckObject() {
		//This method is called when an application user chooses to build a User
		
		//Create a new scanner object to accept user input
		Scanner input = new Scanner(System.in);
		
		//Create a new check object
		Check check = new Check();
		
		//String to hold the user's input
		String userInput;
		int userIntInput;
		double userDoubleInput;
		
		//Code block to obtain the account ID and store it in the check object
		System.out.print("Enter your 10 digit Account ID: ");
		userInput = input.nextLine();
		check.setAccountId(userInput);
		
		//Code to obtain the bank ID and store it in the check object
		System.out.print("Enter the 9 digit bank ID: ");
		userInput = input.nextLine();
		check.setBankId(userInput);
		
		//Code to obtain the payee and store it in the check object
		System.out.print("Enter the payee: ");
		userInput = input.nextLine();
		check.setPayee(userInput);
		
		//Code to obtain the date and store it in the check object
		System.out.print("Enter the date: ");
		userInput = input.nextLine();
		check.setDate(userInput);
		
		//Code to obtain the check number and store it in the check object
		System.out.print("Enter the check number: ");
		userIntInput = input.nextInt();
		check.setCheckNumber(userIntInput);
		
		//Code to check the validity of the check number and provide an error if it is incorrect
		if(check.isCheckNumValid() == false) {
			System.out.println("The check number " + check.getCheckNumber() + " is not valid.");
		}
		
		//Code to obtain the check amount and store it in the check object
		System.out.print("Enter the amount: ");
		userDoubleInput = input.nextDouble();
		check.setAmount(userDoubleInput);
		
		//Code to check the validity of the check amount and provide an error if it is incorrect
		if(check.isAmountValid() == false) {
			System.out.println("The amount " + check.getAmount() + " is not valid.");
		}
		
		//Final print statement to display the object's data
		System.out.println("The check object was created and tested successfully.");
		System.out.println(check.getCheckInfo());
		
		//close the scanner input
		input.close();
		
	}
	
	/**
	 * Builds an address object based on user inputs.
	 * @param userInput - A string to hold user input.
	 */
	public static void buildAddressObject() {
		//This method is called when an application user chooses to build an address
		
		//Create a new scanner object to accept user input
		Scanner input = new Scanner(System.in);
		
		//Create a new address object
		Address address = new Address();
		
		//String to hold the user's input
		String userInput;
		
		//Code to obtain and store the Street1 value
		System.out.print("Enter Address (Street1): ");
		userInput = input.nextLine();
		address.setStreet1(userInput);
		
		//Code to obtain and store the Street2 value
		System.out.print("Enter Address (Street2): ");
		userInput = input.nextLine();
		address.setStreet2(userInput);
		
		//Code to obtain and store the city value
		System.out.print("Enter City: ");
		userInput = input.nextLine();
		address.setCity(userInput);
		
		//Code to obtain and store the state value
		System.out.print("Enter State (Two Characters Only): ");
		userInput = input.nextLine();
		address.setState(userInput);
		
		if(address.isStateValid() == false) {
			System.out.println("The State " + address.getState() + " is not valid.");
		}
		
		//Code to obtain and store the zip code value
		System.out.print("Enter Zip Code (Five Characters Only): ");
		userInput = input.nextLine();
		address.setZipCode(userInput);
		
		if(address.isZipCodeValid() == false) {
			System.out.println("The Zip Code " + address.getZipCode() + " is not valid.");
		}
		
		//Final print statement to display the object's data
		System.out.println("The address object was created and tested successfully.");
		System.out.println(address.getMailingAddress());
		
		//close the scanner input
		input.close();
		
	}
	
	/**
	 * Builds a bank entry object based on user inputs.
	 * @param userInput - A string to hold user input.
	 * @param userIntInput - An int variable to hold user input.
	 * @param userDoubleInput - A double variable to hold user input.
	 */
	public static void buildBankEntryObject() {
		//This method is called when an application user chooses to build a Bank Entry
		
		//Create a new scanner object to accept user input
		Scanner input = new Scanner(System.in);
		
		//Create a new bank entry object
		BankEntry bankEntry = new BankEntry();
		
		//String to hold the user's input
		String userInput;
		int userIntInput;
		double userDoubleInput;
		
		//Code to obtain and store the account ID
		System.out.print("Enter your 10 digit Account ID: ");
		userInput = input.nextLine();
		bankEntry.setAccountId(userInput);
		
		//Code to check the validity of the account id and provide an error if it is incorrect
		if(bankEntry.isAccountIdValid() == false) {
			System.out.println("The account number " + bankEntry.getAccountId() + " is not valid.");
		}
		
		//Code to obtain and store the bank ID
		System.out.print("Enter the 9 digit bank ID: ");
		userInput = input.nextLine();
		bankEntry.setBankId(userInput);
		
		//Code to check the validity of the bank id and provide an error if it is incorrect
		if(bankEntry.isBankIdValid() == false) {
			System.out.println("The bank id " + bankEntry.getBankId() + " is not valid.");
		}
		
		//Code to obtain and store the payee
		System.out.print("Enter the payee: ");
		userInput = input.nextLine();
		bankEntry.setPayee(userInput);
		
		//Code to obtain and store the date
		System.out.print("Enter the date: ");
		userInput = input.nextLine();
		bankEntry.setDate(userInput);
		
		//Code to obtain and store the type of transaction (debit/credit)
		System.out.print("Enter debit or credit: ");
		userInput = input.nextLine();
		bankEntry.setDebitCredit(userInput);
		
		//Code to obtain and store the description
		System.out.print("Enter a description: ");
		userInput = input.nextLine();
		bankEntry.setDescription(userInput);
		
		//Code to obtain and store the check number
		System.out.print("Enter the check number: ");
		userIntInput = input.nextInt();
		bankEntry.setCheckNumber(userIntInput);
		
		//Code to check the validity of the check number
		if(bankEntry.isCheckNumValid() == false) {
			System.out.println("The check number " + bankEntry.getCheckNumber() + " is not valid.");
		}
		
		//Code to obtain and store the amount
		System.out.print("Enter the amount: ");
		userDoubleInput = input.nextDouble();
		bankEntry.setAmount(userDoubleInput);
		
		//Code to obtain and store the current balance
		System.out.print("Enter the current balance: ");
		userDoubleInput = input.nextDouble();
		bankEntry.setCurrentBalance(userDoubleInput);
		
		//Code to obtain and store the fee amount
		System.out.print("Enter the fee amount: ");
		userDoubleInput = input.nextDouble();
		bankEntry.setFee(userDoubleInput);
		
		//Code to check the validity of the fee amount
		if(bankEntry.isFeeValid() == false) {
			System.out.println("The fee amount " + bankEntry.getFee() + " is not valid.");
		}
		
		//Code to obtain and store the interest amount
		System.out.print("Enter the interest amount: ");
		userDoubleInput = input.nextDouble();
		bankEntry.setInterest(userDoubleInput);
		
		//Code to check the validity of the interest rate
		if(bankEntry.isInterestValid() == false) {
			System.out.println("The interest rate " + bankEntry.getInteres() + " is not valid.");
		}
		
		//Code to calculate and store the new balance
		double currentBalance = bankEntry.getCurrentBalance();
		double amount = bankEntry.getAmount();
		double newBalance = currentBalance + amount;
		
		bankEntry.setNewBalance(newBalance);
		
		System.out.print("New balance is: " + bankEntry.getCurrentBalance());

		
		//Final print statement to display the object's data
		System.out.println("The check object was created and tested successfully.");
		System.out.println(bankEntry.getBankEntry());
		
		//close the scanner input
		input.close();
		
	}
	
	/**
	 * Builds a check object based on user inputs.
	 * @param userInput - A string to hold user input.
	 * @param userIntInput - An int variable to hold user input.
	 * @param userDoubleInput - A double variable to hold user input.
	 * @param userBooleanInput - A boolean variable to hold user input.
	 */
	public static void buildUserEntryObject() {
		//This method is called when an application user chooses to build a Bank Entry
		
		//Create a new scanner object to accept user input
		Scanner input = new Scanner(System.in);
		
		//Create a new bank entry object
		UserEntry userEntry = new UserEntry();
		
		//String to hold the user's input
		String userInput;
		int userIntInput;
		double userDoubleInput;
		boolean userBooleanInput;
		
		//Code to obtain and store the account ID
		System.out.print("Enter your 10 digit Account ID: ");
		userInput = input.nextLine();
		userEntry.setAccountId(userInput);
		
		//Code to check the validity of the account id and provide an error if it is incorrect
		if(userEntry.isAccountIdValid() == false) {
			System.out.println("The account number " + userEntry.getAccountId() + " is not valid.");
		}
		
		//Code to obtain and store the bank ID
		System.out.print("Enter the 9 digit bank ID: ");
		userInput = input.nextLine();
		userEntry.setBankId(userInput);
		
		//Code to check the validity of the bank id and provide an error if it is incorrect
		if(userEntry.isBankIdValid() == false) {
			System.out.println("The bank id " + userEntry.getBankId() + " is not valid.");
		}
		
		//Code to obtain and store the payee
		System.out.print("Enter the payee: ");
		userInput = input.nextLine();
		userEntry.setPayee(userInput);
		
		//Code to obtain and store the date
		System.out.print("Enter the date: ");
		userInput = input.nextLine();
		userEntry.setDate(userInput);
		
		//Code to obtain and store the type of transaction (debit/credit)
		System.out.print("Enter debit or credit: ");
		userInput = input.nextLine();
		userEntry.setDebitCredit(userInput);
		
		//Code to obtain and store the description
		System.out.print("Enter a description: ");
		userInput = input.nextLine();
		userEntry.setDescription(userInput);
		
		//Code to obtain and store the check number
		System.out.print("Enter the check number: ");
		userIntInput = input.nextInt();
		userEntry.setCheckNumber(userIntInput);
		
		//Code to check the validity of the check number
		if(userEntry.isCheckNumValid() == false) {
			System.out.println("The check number " + userEntry.getCheckNumber() + " is not valid.");
		}
		
		//Code to obtain and store the amount
		System.out.print("Enter the amount: ");
		userDoubleInput = input.nextDouble();
		userEntry.setAmount(userDoubleInput);
		
		//Code to obtain and store the current balance
		System.out.print("Enter the current balance: ");
		userDoubleInput = input.nextDouble();
		userEntry.setCurrentBalance(userDoubleInput);
		
		//Code to obtain and store the category
		System.out.print("Enter the category: ");
		userInput = input.nextLine();
		userEntry.setCategory(userInput);
		
		//Code to check the validity of the category
		if(userEntry.isCategoryValid() == false) {
			System.out.println("The category " + userEntry.getCategory() + " is not valid.");
		}
		
		//Code to obtain and store the notes
		System.out.print("Enter notes: ");
		userInput = input.nextLine();
		userEntry.setNotes(userInput);
		
		//Code to check the validity of the note
		if(userEntry.isNoteValid() == false) {
			System.out.println("The note " + userEntry.getNotes() + " is not valid.");
		}
		
		//Code to obtain and store if transaction is reconciled
		System.out.print("Is reconciled (true/false): ");
		userBooleanInput = input.hasNextBoolean();
		userEntry.setReconciled(userBooleanInput);
		
		//Code to calculate and store the new balance
		double currentBalance = userEntry.getCurrentBalance();
		double amount = userEntry.getAmount();
		double newBalance = currentBalance + amount;
		
		userEntry.setNewBalance(newBalance);
		
		System.out.print("New balance is: " + userEntry.getCurrentBalance());

		
		//Final print statement to display the object's data
		System.out.println("The check object was created and tested successfully.");
		System.out.println(userEntry.getUserEntry());
		
		//close the scanner input
		input.close();
		
	}

	/**
	 * This is the main method, which prompts users to select what type of object they want to create.
	 * @param userInput - An int variable to hold user input.
	 */
	public static void main(String[] args) {
		
		//Create a new scanner object to accept user input
		Scanner input = new Scanner(System.in);
		int userInput; //to store the user input
		
		//Code to obtain the user's last name and store it in the user object
		System.out.println("What object would you like to create?");
		System.out.println("1 - User : 2 - Bank : 3 - Check : 4 - Address : 5 - BankEntry : 6 - UserEntry");
		userInput = input.nextInt();
		
		//if-else block to evaluate the user in put and build the requested object.
		if(userInput == 1) {
			System.out.println("Let's build a User object!");
			buildUserObject();
		} else if(userInput == 2) {
			System.out.println("Let's build a Bank object!");
			buildBankObject();
		} else if(userInput == 3) {
			System.out.println("Let's build a Check object!");
			buildCheckObject();
		} else if(userInput == 4) {
			System.out.println("Let's build an Address object!");
			buildAddressObject();
		} else if(userInput == 5) {
			System.out.println("Let's build a Bank Entry object!");
			buildBankEntryObject();
		} else if(userInput == 6) {
			System.out.println("Let's build a User Entry object!");
			buildUserEntryObject();
		} else {
			System.out.println("You entered an invalid selection. No object will be created.");
		}
		
		//close the scanner input
		input.close();
		
	}
	
}
