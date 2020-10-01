package ict4361.week2;

import java.util.Random;

public class Dice {
	
	private int numberShowing;
	private Random randomNumber;
	
	public int roll() {
		
		Random randomNumber = new Random();
		
		numberShowing = randomNumber.nextInt(6) + 1;
		
		return numberShowing;
		
	}
	
	/**
	 * @return the numberShowing
	 */
	public int getNumberShowing() {
		return numberShowing;
	}

	@Override
	public String toString() {
		return "Dice [numberShowing=" + numberShowing + ", randomNumber=" + randomNumber + "]";
	}
	

	public static void main(String[] args) {
		
		//Number of dice rolls
		int numberOfRolls = 1000;
		
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		//New dice object
		Dice dice = new Dice();
		
		 //Loop through the array
		 for (int i = 0; i <= numberOfRolls; i++) {
			 
			 //Roll the dice
			 dice.roll();
			 
			 if (dice.getNumberShowing() == 1) {
				 one++;
			 }  else if (dice.getNumberShowing() == 2) {
				 two++;
			 }  else if (dice.getNumberShowing() == 3) {
				 three++;
			 }  else if (dice.getNumberShowing() == 4) {
				 four++;
			 }  else if (dice.getNumberShowing() == 5) {
				 five++;
			 }  else if (dice.getNumberShowing() == 6) {
				 six++;
			 } 
			 
			 System.out.println("The dice was rolled " + i + " times.");
			 System.out.println("Number of one values rolled: " + one);
			 System.out.println("Number of two values rolled: " + two);
			 System.out.println("Number of three values rolled: " + three);
			 System.out.println("Number of four values rolled: " + four);
			 System.out.println("Number of five values rolled: " + five);
			 System.out.println("Number of six values rolled: " + six);
			 
			 
		 }
		

	
		//Print 
		System.out.println(dice.getNumberShowing());
		

	}

}
