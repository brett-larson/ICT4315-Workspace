import java.util.Scanner;

public class StockOutput {

	public static void main(String[] args) {

		String name;
		String stockSymbol;
		double numOfShares;
		double purchasePrice;
		double currentPrice;
		
		//Create a new scanner object to accept user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter the stock symbol: ");
		stockSymbol = input.nextLine();
		
		System.out.print("Enter the number of shares: ");
		numOfShares = input.nextDouble();
		
		System.out.print("Enter the purchase price: ");
		purchasePrice = input.nextDouble();
		
		System.out.print("Enter the current price: ");
		currentPrice = input.nextDouble();
		
		input.close();
		
		double totalPurchasePrice = purchasePrice * numOfShares;
		double totalCurrentPrice = currentPrice * numOfShares;
		double earningLoss = totalCurrentPrice - totalPurchasePrice;
		
		System.out.println("Stock ownership information for " + name);
		System.out.println("-------------");
		System.out.println(stockSymbol + " | " + numOfShares);
		System.out.println("Purchased Price per Share: " + purchasePrice);
		System.out.println("Current Price per Share: " + currentPrice);
		System.out.println("Earnings/Losses: " + earningLoss);
		

	}

}
