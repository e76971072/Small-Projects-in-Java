	import java.util.*;
	
	
	public class RandG {
		
		public static boolean debug = true;
		public static void main ( String [] args) {
		Scanner keyb = new Scanner ( System.in)	;
		Random joe = new Random(); 
		System.out.println(" Enter game pct");
		int a = keyb.nextInt();
		if (playoff(51,joe)==1)
		 System.out.println( " team 1 wins ");
		else
		 System.out.println(" team 2 wins ");
	}
		
	
		
	
	
	
	    public static int playoff( int x, Random Ralph) {
	    	
	    	int team1 =  0 ;
	    	int team2 = 0;
	    	
	    	while (( team1<4) && (team2<4)){
	    		if (x>(1+ Ralph.nextInt (100))){
	    			team1 ++;
	    			}
	    			else 
	    				team2++;
	    			if(debug)
	    				System.out.println( " Team 1 "+ team1 + " Team 2 " + team2);
	    			}
	    			if ( team1 ==4 )
	    				return 0;
	    			else 
	    				return 1;
	    	}
	    }
	    			
	    		
	    	
	
	    
	    				
	    			
	 
