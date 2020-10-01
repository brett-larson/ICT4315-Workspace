package main.ict4315.week9;


/**The PrinterFactory class provides the right printer object
 * based on the input it receives.
 * @author Brett Larson
 * @version 1.0
 */
public class PrinterFactory {
	
	public Printer getPrinter(String printerType) {
		
		if (printerType.equalsIgnoreCase("check")) {
			return new CheckPrinter();
		} else if (printerType.equalsIgnoreCase("account")) {
			return new AccountPrinter();
		}
		
		return null;
		
	}

}
