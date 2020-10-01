package main.ict4315.week7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


/**The AccountPrinter class implements the Printer interface.
 * It is used to print an array of transactions from the Account class
 * @author Brett Larson
 * @version 1.0
 */
public class AccountPrinter implements Printer {

	@Override
	public void print(Object object) {
		
		//New account object to store the account object sent for printing
		Account account = (Account)object;
		
		//File name to create
		String fileName = "Transaction.txt";
		
		//Creating the new file
		File file = new File(fileName);
		
		try {
		
			//If file does not exist, create it and write transactions to it
			if(!file.exists()) {
			
				file.createNewFile();
				
				PrintWriter pw = new PrintWriter(file);
				
				 //Loop through array to print values
				 for (int i = 0; i < account.getTransactionArrayList().size(); i++) {
					 
					 pw.println(account.getTransactionArrayList().get(i).getDate() + " - " +
							 account.getTransactionArrayList().get(i).getTransactionId() + " - " +
							 account.getTransactionArrayList().get(i).getType() + " - " +
							 account.getTransactionArrayList().get(i).getDescription() + " - " +
							 account.getTransactionArrayList().get(i).getAmount());
					 
				 }
				 
				 pw.close();
				 
			} else {
				System.out.println("The file already exists");
			}
			
		} catch (IOException e) {
			System.out.println("There was an error in creating and/or writing to the file");
			e.printStackTrace();
		}
	
	}

}
