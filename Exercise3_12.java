/** Program: Exercise 3.12
* File: Exercise3_12.java
* Summary: (Palindrome number)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

import java.util.Scanner;

public class Exercise3_12 {

	public static void main(String[] args) {
		
		// Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Get 3-digit integer
        System.out.println("Enter a three-digit integer:");
        int Number = input.nextInt();
        
        // Check length of integer
        int length = Integer.toString(Number).length();
        if (length == 3){
        	String s1 = Integer.toString(Number);
        	StringBuffer s2 = new StringBuffer(s1);
        	s2.reverse();
        	if(s1.equals(s2.toString())){
        		System.out.println(s1 + " is a palindrome");
        	} else {
        		System.out.println(s1 + " is not a palindrome");
        	}
        }
        else {
        	System.out.println("Invalid not a three-digit integer!");
        }
	}
}
