/** Program: Exercise 3.17
* File: Exercise3_17.java
* Summary: (Game: scissor, rock, paper)
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

import java.util.Scanner;
import java.util.Random;

public class Exercise3_17 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		//Computer Selection
		int Computer = 0;
		Computer = random.nextInt(3); // 0 to 2
		
		// Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Player Choice Rock, Paper, Scissor
        System.out.println("scissor (0), rock (1), paper (2): ");
        int Player = input.nextInt();
        
        // Get String from function
        String computerString = getChoice(Computer);
        String playerString = getChoice(Player);
        
        // Get Results of Game
        String gameResults = getResults(Computer, Player);
        System.out.println("The computer is " + computerString + ". You are " + playerString + ". " + gameResults + ".");
        
	}
        
        public static String getChoice(int choice) {

        	String choiceString = "";

        	switch (choice) {
            case 0: choiceString = "scissor"; 
            	break;
            case 1: choiceString = "rock"; 
            	break;
            case 2: choiceString = "paper"; 
            	break;
            default:
            	choiceString = null;
        }
        
    	return choiceString;
        }
        
        public static String getResults(int computer, int player) {
        	if (computer == player)
        		{ 
        			return "It's a draw";
        		}

        	String result = "";
            switch (player) {
                case 0: result = (computer != 1) ? "You won" : "You lost"; 
                	break;
                case 1: result = (computer != 2) ? "You won" : "You lost"; 
                	break;
                case 2: result = (computer != 0) ? "You won" : "You lost"; 
                	break;
            	}
    	return result;
        }
		
	}
	

