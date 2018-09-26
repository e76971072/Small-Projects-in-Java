

import java.util.*; 
import java.util.Scanner; 

public class Project1 {

			public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			System.out.print(" Projet 1 written by Nick Pham\n\n");
			
			// declare scanner
			Scanner user = new Scanner ( System.in);
			
			System.out.print(" Please enter your base: ");
			
			int base = user.nextInt();
			
			System.out.print(" Please enter your maximum exponent:  ");
			
			int exponent = user.nextInt();
			
			powertable(base,exponent);
			
			System.out.print(" Please enter your nemerator:  ");
			
			int numerator = user.nextInt();
			System.out.print(" Please enter your denominator:  ");
			int denominator = user.nextInt();
			remaindertable(numerator, denominator);
			}
	

		
			public static void  powertable( int base, int exponent)  {
			
			int sum ;
			
			System.out.print("	\nPower of " +base+"\n " );
			System.out.print("\nx\t\t" + base + "^x\n");
			for ( int i = 0; i <= exponent; i++) {
					
				 sum = (int) Math.pow(base, i);
			
				 System.out.print("\n"+i);
				 System.out.print("\t\t"+sum+ "\n");
		 
			}
			}
			
			public static void remaindertable (int numerator, int denominator) {
				
				
					int answer;
				
			
					System.out.print("\nRemainder table\n");
					System.out.print("n");
					
					
			
					
					System.out.print(" \n");
					// nest loop 
					for ( int i = 1; i <= numerator; i++) {
								
						for ( int j = 1; j <= denominator; j++ ) {
							//answer = i % j;
						
							
							System.out.print ( i + " \t " +  i%j + " \t" );
							
				
				
				
						}
					
						System.out.print("\n");
						
					}
			}
}
	
	
