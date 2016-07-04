/** Program: Exercise 3.5
* File: Exercise3_05.java
* Summary: (Find future dates)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

import java.util.Scanner;

public class Exercise3_05 {

	public static void main(String[] args) {
		
		// Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Get todays date
        System.out.println("Enter today's day (Sunday is 0, Monday is 1, and Saturday is 6):");
        int todaysDay = input.nextInt();
        
        // Get Elapsed date
        System.out.println("Enter the number of days elapsed since today");
        int elapsedDays = input.nextInt();
        
        // Get future date
        int futureDay = (todaysDay + elapsedDays) % 7;
        
        // Run getDate function to find day from date
        String todayDayString = getDate(todaysDay);
        String futureDayString = getDate(futureDay);

        System.out.println("Today is " + todayDayString + " and the future day is " + futureDayString);
	}
        
        public static String getDate(int date) {

            String dayString;

            switch (date) {
                case 0:
                	dayString = "Sunday";
                    break;
                case 1:
                	dayString = "Monday";
                    break;
                case 2:
                	dayString = "Tuesday";
                    break;
                case 3:
                	dayString = "Wednesday";
                    break;
                case 4:
                	dayString = "Thursday";
                    break;
                case 5:
                	dayString = "Friday";
                    break;
                case 6:
                	dayString = "Saturday";
                    break;
                default:
                	dayString = "A invalid day was entered";
            }
            return dayString;
        }
		
	}
