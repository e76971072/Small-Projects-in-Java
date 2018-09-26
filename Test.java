				
import java.util.*;
				
				
		public class Test {
				public static void main ( String [] args) {
					/*boolean flag = true;
					int a = (int) (1+6*Math.random());
					System.out.println(" a:" +a );
					while(a>2) {
						System.out.println("Hello ");
						a = (int) (1+6*Math.random());
						if (a==8) flag = true;
					}
				}
		}
            */

           
					     
			double years = 5.5;
			double prin = 1000; // Money deposit
			double r = 0.05;   // rate
			for ( int i = 0; i <= years; i ++){
				prin = prin*( 1+r);
				System.out.println("Year" + i + " $" + prin);
			}
				}
		}
			
				
			
 
     