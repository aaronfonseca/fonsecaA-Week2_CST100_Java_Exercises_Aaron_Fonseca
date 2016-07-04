/** Program: Exercise 3.33
* File: Exercise3_33.java
* Summary: (Financial: compare costs)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

import java.util.Scanner;

public class Exercise3_33 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in); 	

		// Enter Package weight and height
		System.out.print("Enter weight and price for package 1: ");
		double package1Weight = input.nextDouble();
		double package1Price = input.nextDouble(); 
		double package1Sum = package1Weight/package1Price;

		// Enter Package weight and height
		System.out.print("Enter weight and price for package 2: ");
		double package2Weight = input.nextDouble();
		double package2Price = input.nextDouble(); 
		double package2Sum = package2Weight/package2Price;
		
		if(package1Sum == package2Sum)
		{
			System.out.print("The packages have the same price.");
		}
		else if(package1Sum < package2Sum)
		{
			System.out.print("Package 1 has a better price.");
		} else {
			System.out.print("Package 2 has a better price.");
		}
       
	}
}
	