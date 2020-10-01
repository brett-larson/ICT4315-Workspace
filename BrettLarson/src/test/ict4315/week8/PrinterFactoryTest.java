package test.ict4315.week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ict4315.week8.AccountPrinter;
import main.ict4315.week8.CheckPrinter;
import main.ict4315.week8.Printer;
import main.ict4315.week8.PrinterFactory;

class PrinterFactoryTest {

	@Test
	void getCheckPrinterPass() {
		
		//Create a new print factory
		PrinterFactory pf = new PrinterFactory();
		
		//Get the printer for checks
		Printer actualPrinter = pf.getPrinter("Check");
		
		//Check that the printer received from the factory is an instance of the check printer
		assertTrue(actualPrinter instanceof CheckPrinter);
		
	}
	
	@Test
	void getCheckPrinterFail() {
		
		//Create a new print factory
		PrinterFactory pf = new PrinterFactory();
		
		//Attempt to get a printer with an invalid string
		Printer actualPrinter = pf.getPrinter("NoPrinter");
		
		//Confirm that null is received from the factory
		assertNull(actualPrinter);

	}
	
	@Test
	void getAccountPrinterPass() {
		
		//Create a new print factory
		PrinterFactory pf = new PrinterFactory();
		
		//Get an account printer object
		Printer actualPrinter = pf.getPrinter("Account");
		
		//Check that the printer received from the factory is an instance of the account printer
		assertTrue(actualPrinter instanceof AccountPrinter);
		
	}

}
