package main.ict4315.week9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;


/**The CheckPrinter class implements the Printer interface.
 * It is used to print an a check object from the check class
 * @author Brett Larson
 * @version 1.0
 */
public class CheckPrinter implements Printer, Serializable {

	//Required for implementation of Serializable
	private static final long serialVersionUID = 1L;
	

	@Override
	public void print(Object object) {
		
		//New check object to store the check object sent for printing
		Check check = (Check)object;
		
		//File name to create
		String fileName = "Check.txt";
		
		//Creating the new file
		File file = new File(fileName);
		
		try {
			
			//If file does not exist, create it and write check details to it
			if(!file.exists()) {
			
				file.createNewFile();
				
				PrintWriter pw = new PrintWriter(file);
				
				pw.println("Check Number: " + check.getCheckNumber() + "  Date:  " + check.getDate());
				pw.println("Payee: " + check.getPayee() + "  Amount: " + check.getAmount());
				pw.println("Memo:           Signature:  ");
				pw.println(check.getAccountId() + " || " + check.getBankId());
				 
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
