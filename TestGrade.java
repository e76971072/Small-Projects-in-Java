import java.util.Scanner;

import java.util.*;
		
		public class TestGrade {
			public static final Scanner CONSOLE = new Scanner(System.in);

			public static void main ( String [] args ) {
			     System.out.println(" Please enter your grade;  ");
				double grade = CONSOLE.nextDouble();
				
				
				if (grade <= 100) {
					if( grade >90) {
					
					System.out.print(" A");
				}
					
					else {
						System.out.println(" you are not doing great right now");
					

					}
			}
			}
		}
			
		
