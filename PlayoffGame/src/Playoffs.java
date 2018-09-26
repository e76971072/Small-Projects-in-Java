
import java.util.Random;
import java.util.Scanner;


public class Playoffs {
	
	/**
	 * this method will determine which team will win in a single game
	 * 
	 * @param percentage	percent that team 1 will win the game
	 * @param rand			rand object that we use to generate the random number
	 * @return	true if team 1 wins
	 * 			false if team 2 wins
	 */
	public static boolean singleGame(int percentage, Random rand) { 
		// create random number using rand object
		int randomNumber = rand.nextInt(100);
		//determine which team will win
		if (randomNumber < percentage) return true;
		return false;
	}
	
	/** 
	 * this method will determine which team wins in a playoff
	 * a team will win playoffs if it reaches 4 wins first
	     percentage	the percentage that team 1 will win a game
	       rand			random onject that we use to create random number
	       	true if team 1 wins
	 			false if team 2 wins
	 */		
	public static boolean playoffsOne(int percentage, Random rand) {    // method best of 7 playoffs, single game
		// variables that I use to sore the wins for 
		int countTeam1 = 0;
		int countTeam2 = 0;
		
		//loop until one team wins 4 games
		while ((countTeam1 < 4) && (countTeam2 < 4)) { 
			
			// team 1 wins
			if (singleGame(percentage, rand)) { 
				countTeam1++;
			} 
			// team 2 wins
			else { 
				countTeam2++;
			}
		}
		
		//return the result
		if (countTeam1 == 4) return true;
		return false;
	}
	
	/** 
	 * this will determine which team will win 10 playoffs first
	 * 
	 * @param percentage	the percent that team 1 wins a game
	 * @param rand			random object that creates the random numbers
	 
	*/
	public static void playoffsTwo(int percentage, Random rand)  {     // 10 playoffs games
		// variables that I use to store the number of wins for each team
		int countTeam1 = 0;
		int countTeam2 = 0;
		
		// initialize output object
		

		// loop until one team wins 10 playoffs
		while ((countTeam1 <10) && (countTeam2 < 10)) { 
			
			// team 1 wins playoff
			if (playoffsOne(percentage, rand)) { 
				countTeam1++;
				System.out.println("1");
			} 
			// team 2 wins playoff
			else { 
				countTeam2++;
				System.out.println("2");
			}
		}
		
		// Print out the result
		if (countTeam1 == 10) { 
			System.out.println("Team 1 wins!");
		} else { 
			System.out.println("Team 2 wins!");
		}
	}
	
	public static void main(String[] args)  {
		
		System.out.println(" Lab 6 Written by An Tri Bao Nguyen\n"); 
		// intializes the default value for percentage
		int percentage = -1; // return -1 which out the range of 0 and not greater than 100
		
		// construct a random object
		Random rand = new Random();
		@SuppressWarnings("resource")
		
		// construct input console
		Scanner input = new Scanner(System.in);

		//prompt user to enter the percentage and save the result in percentage variable
		//keep asking user to enter the percentage again if its not between 0 and 100
		while ((percentage < 0) || (percentage > 100)) { // either negative number or greater than 100 to keep the while loop stop asking user input
			System.out.print("Enter the win percentage of team 1: ");
			percentage = input.nextInt();
		}
		
		// call the playoffTwo method
		playoffsTwo(percentage, rand);
	}

}