/** Program: Exercise 9.06
* File: Exercise9_06.java
* Summary: (StopWatch)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

public class Exercise9_06 {

	public static void main(String[] args) {
		
		// Create a new StopWatch Object
		StopWatch time = new StopWatch();
		
		// Create array
		int[] numberArray = getArray();
		
		// Start the stopWatch
		time.start();
		
		// Sort the 100,000 numbers
		arraySort(numberArray);
		
		// Stop the time
		time.stop();
		
		System.out.println("The execution time of sorting 100,000 numbers using selection sort is " + time.getElapsedTime() + " milliseconds");
		
	}
		// Get an array with 100000 numbers
		public static int[] getArray() 
		{
			int[] array = new int[100000];
			for (int i = 0; i < array.length; i++) 
			{
				array[i] = (int)(Math.random() * 100000);
			}
			return array;
		}
		
		// Sort the array 
		public static void arraySort(int[] numberArray)
		{
			for (int i = 0; i < numberArray.length; i++) 
			{
				int smallestValue = numberArray[i];
				int smallestIndex = i;
				
				for (int j = i+1; j < numberArray.length; j++) 
				{
					if(smallestValue > numberArray[j])
					{
						smallestValue = numberArray[j];
						smallestIndex = j;
					}
				}
				numberArray[smallestIndex] = numberArray[i];
				numberArray[i] = smallestValue;
			}
			
		}
		
		
		
		
	
	}

	