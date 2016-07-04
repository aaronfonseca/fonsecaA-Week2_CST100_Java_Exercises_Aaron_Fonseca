/** Program: Exercise 3.26
* File: Exercise3_26.java
* Summary: (Use the &&, || and ^ operators)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

import java.util.Scanner;

public class Exercise3_26 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);

		// Get input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Find true or false
        boolean FiveAndSix = (number % 5 == 0) && (number % 6 == 0);
        boolean FiveOrSix = (number % 5 == 0) || (number % 6 == 0);
        boolean NotBoth = (number % 5 == 0) ^ (number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + FiveAndSix);
        System.out.println("Is " + number + " divisible by 5 or 6? " + FiveOrSix);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + NotBoth);
        
	}
}
	

