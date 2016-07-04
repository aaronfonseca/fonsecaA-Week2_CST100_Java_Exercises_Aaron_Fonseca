import java.util.Scanner;

/** Program: Exercise 3.3
* File: Exercise3_03.java
* Summary: (Algebra: solve 2 * 2 linear equations)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

public class Exercise3_03 {

	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f:");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double ad_minus_bc = (a * b) - (b * c);
		
		if (ad_minus_bc <= 0){
			System.out.println("The equation has no solution");
		} else {
			double x = ((e*d)-(b*f))/((a*d)-(b*c));
			double y = ((a*f)-(e*c))/((a*d)-(b*c));
			System.out.println("x = " + x + "and y = " + y);
		}
		
		
		
		

	}

}