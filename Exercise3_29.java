/** Program: Exercise 3.29
* File: Exercise3_29.java
* Summary: (Geometry: two circles)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

import java.util.Scanner;

public class Exercise3_29 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in); 	

		// Get the center coordinates and radii
		System.out.print("Enter circleOne's center x-coordinates, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble(); 
		double r1 = input.nextDouble();
		
		System.out.print("Enter circleTwo's center x-coordinates, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble(); 
		double r2 = input.nextDouble(); 

		if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= Math.abs(r1 - r2))
			{
			System.out.println("circle2 is inside circle1");
			}
		else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= r1 + r2)
		{
			System.out.println("circle2 overlaps circle1");
		}
		else
		{
			System.out.println("circle2 does not overlap circle1");
		}       
	}
}
	

