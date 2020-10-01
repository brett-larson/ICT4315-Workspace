package main.ict4315.week3;

import java.util.Scanner;

public class MainStart {
	
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


	public static void main(String[] args) {
		
		//Create a new scanner object to accept user input
		Scanner input = new Scanner(System.in);
		int userInput; //to store the user input
		
		//Code to obtain the user's last name and store it in the user object
		System.out.println("What object would you like to create?");
		System.out.print("1 - User : 2 - Bank : 3 - Check : 4 - Address: ");
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
		} else {
			System.out.println("You entered an invalid selection. No object will be created.");
		}
		
		//close the scanner input
		input.close();
		
	}
	
}
