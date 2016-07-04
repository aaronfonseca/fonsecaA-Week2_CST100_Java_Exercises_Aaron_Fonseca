/** Program: Exercise 3.18
* File: Exercise3_18.java
* Summary: (Cost of shipping)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

import java.util.Scanner;

public class Exercise3_18 {

	public static void main(String[] args) {
			
		// Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Enter Weight
        System.out.println("Enter the weight of the package: ");
        double weight = input.nextDouble();
        
        // Get Cost from function
        String cost = getCost(weight);
        System.out.println(cost);
        
	}
        
        public static String getCost(double weight) {

        	String costString = "";
        	if((weight > 0) && (weight <= 1)){costString = " The cost of shipping is 3.5";}
        	else if((weight > 1) && (weight <= 3)){costString = "The cost of shipping is 5.5";}
        	else if((weight > 3) && (weight <= 10)){costString = "The cost of shipping is 8.5";}
        	else if((weight > 10) && (weight <= 50)){costString = "The cost of shipping is 10.5";}
        	else if(weight > 50){costString = "the package cannot be shipped.";}
       
    	return costString;
        }
        

		
	}
	

