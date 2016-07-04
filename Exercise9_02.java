/** Program: Exercise 9.02
* File: Exercise9_02.java
* Summary: (The Stock class)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

import java.util.Scanner;

public class Exercise9_02 {

	public static void main(String[] args) {
		
		// Create a new Stock object, symbol ORCL, name Oracle Corporation
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;

		// Display the price-change percentage
		System.out.println("Stock name: " + stock.name);
		System.out.println("Stock symbol: " + stock.symbol);
		System.out.printf("Price-change percentage: %.2f", stock.getChangePercent());
	}
}
	