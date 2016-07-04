/** Program: Exercise 9.07
* File: Exercise9_07.java
* Summary: (The Account class)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

public class Exercise9_07 {

	public static void main(String[] args) {
		
		// Create a new StopWatch Object
		Account testAccount = new Account(1122, 20000);
		
		testAccount.setAnnualInterestRate(4.5);
		
		testAccount.withdraw(2500);
		
		testAccount.deposit(3000);
			
		// Get Balance
		double dollars = testAccount.getBalance();
		double monthlyInterest = testAccount.getMonthlyInterest();
		
		// Conver Balance to US Dollar Sting
		String usDollars = java.text.NumberFormat.getCurrencyInstance().format(dollars);
		String usDollarsInterenst = java.text.NumberFormat.getCurrencyInstance().format(monthlyInterest);
		
		System.out.printf("The balance is " + usDollars + "\n");
		System.out.printf("The monthly interest " + usDollarsInterenst + "\n");	
		System.out.printf("The date the account was created is " + testAccount.getDateCreated());		
	}
}