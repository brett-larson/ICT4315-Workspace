package main.ict4315.week1;

public class Check {
	
	//Class variables
	public String accountId;
	public String bankId;
	public String payee;
	public String date;
	public int checkNumber;
	public double amount;
	
	public String getCheckInfo() {
		
		//Variable to hold the completed/returned string
		String checkInfo = "";
		
		//Build the checkInfo string
		checkInfo = checkNumber + " - " + payee + " - " + amount + " - " + date;
		
		//Return the checkInfo string
		return checkInfo;
		
	}

}
