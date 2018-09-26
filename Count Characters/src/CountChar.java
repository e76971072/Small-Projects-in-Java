import java.util.*;				
import java.util.Scanner;
				
				public class CountChar {
				
					 static Scanner CONSOLE = new Scanner ( System.in);
					
					public static void main ( String [] args) {
						System.out.println(" Extra Credit Written by An Tri Bao Nguyen\n");
						
						System.out.println(" Please enter your character: ");
						char c = CONSOLE.next().charAt(0);;   // Input a specific character. 
						
						char ch;
				        int uppercase=0;     // Input variables equal to 0
				        	int	lowercase=0;    
						//for( int i = 0; i < c; i++) {    // Set a loop goes from 0 to the length of this string
							if (Character.isUpperCase(c)){   // Check if it has any uppercase letters
								uppercase++;
							}
								 if (Character.isLowerCase(c)) {   // Check if they have lowercase letters
									 lowercase++;
								 }
					
					
					System.out.println(" The number of your lowercase is "+ lowercase+ " and the number of your uppercase is " +  uppercase);
				}
				}
						
	
					
			
							
							
					
						
						
						
					
								
								
							
				                   
				
				
				
				
				
							
						
					
						
						
				
				
						
						
						
					
				
