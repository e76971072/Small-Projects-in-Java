import java.util.Scanner;

public class Squareroot {
	public static void main ( String[] args) {
	Scanner console = new Scanner(System.in);
	boolean continueLoop = true;
	double num = -1;  // need to declare num outside the loop
	System.out.print("Enter a nonnegative number: ");
	while (continueLoop) {
	    if (console.hasNextDouble( )) {
	        num = console.nextDouble( );
	        if (num >= 0) {
	            continueLoop = false;
	        }
	    } else {
	        String trash = console.next( );
	    }
	}
	double root = Math.sqrt(num);
	System.out.print("The square root of " + num + " is " + root);

}
}
