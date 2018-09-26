import java.util.Scanner;




public class StarWarsName{

	public final static Scanner in = new Scanner(System.in);
	public static void main ( String [] args) {
		
		     
		
		
		     System.out.println( "Lab 4 written by An Tri Bao Nguyen");
		         String first,last,mother,city,car, newfirstname, newlastname, starwarplanet;

		         // I changed from CONSOLE.nextLine to String input  = PrompString (); method
		         
		         
		         first= prompString( "\nPlease state your first name, please: ") ;
		         System.out.println(" You entered as " + first);   // User input firstname
		         
		        
		         last=prompString( "\nPlease state your Last name, please:  " ) ;
		         System.out.println("\nYou entered as " + last); // user input lastname
		         
		       

		          // user input mother maiden's name
		         mother=prompString( "\nPlease state your mother's maiden name, please: ") ;
		         System.out.println("\nYou entered as " + mother);
		    
		         city = prompString( "\nPlease state the city you were born in, please: ") ;
		         System.out.println("\nYou entered as "  + city); // user input city name
		         
		    
		         car = prompString( "\nPlease state your first car you drove, please ") ;
		         System.out.println("\nyou entered as " + car); // user input first car he or she drove
		         
		         
		         newfirstname = first.substring(0,3) + last.substring(0,2);  // Set firstname method  of the output
		         newlastname = mother.substring(0,2) + city.substring(0,3); // Set lastname method of the output
		         starwarplanet = last.substring(Math.max(last.length() - 2, 0)) + car; // Set starwarsplanet name of the output
		         
		       
                 String Starwarname = newfirstname.toUpperCase() + " " + newlastname.toUpperCase() + " of " + starwarplanet.toUpperCase(); // The output print out should be capitalize
		      

		         System.out.println("\nyou are " + Starwarname );
		         
		         
		     }
		

	  
		// TODO Auto-generated method stub
		


	public static String prompString( String input) {

		   
		
		   String name;
		    System.out.println(input); // PROMP USER INPUT
		    name = in.nextLine(); //accept user input
		    name = name.trim(); //remove leading and trailing whitespace
		    return name.toUpperCase(); //CONVERT TO UPPERCASE & RETURN 
		  }
		  

		  
		}



		
	