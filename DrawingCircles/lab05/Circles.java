

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * This program will take input from user
 * about 3 circles (x_location, y_location, radius) 
 * , draw 3 circles on a JPanel, 
 * and print out the information about these 3 circles
 * such as comparing them, checking intersecting, and
 * checking its boundary in the window. 
 * 
 * @author An Tri Bao Nguyen
 *
 */
public class Circles {
	// declare two constant values: 
	// WIDTH AND HEIGHT
	// of the window
	
	
	// 400x300
	
	private static final int WIDTH = 300;
	private static final int HEIGHT = 400;
	
	private static final Color COLOR1 = Color.green;   // Set color for each circle
	private static final Color COLOR2 = Color.red;
	private static final Color COLOR3 = Color.blue;
	/**
	 * This method will compare two circles
	 * 
	 * @param 	r1 radius of the 1st circle
	 * @param 	r2 radius of the 2nd circle
	 * @return 	-1 if 1st is smaller than 2nd circle
	 * 			0 if two circles are equal
	 * 			1 if 1st circle is bigger than 2nd circle
	 */
	public static int compareTwoCircles(int r1, int r2) { 
		if (r1 < r2) { 
			return -1;
		} if (r1 == r2) { 
			return 0;
		} else { 
			return 1;
		}		
	}

	/**
	 * This method will checking if 2 circles intersect each other
	 * 
	 * @param x1	x_location of 1st circle
	 * @param y1	y_location of 1st circle
	 * @param r1	radius of 1st circle
	 * @param x2	x_location of 2nd circle
	 * @param y2	y_location of 2nd circle
	 * @param r2	radius of 2nd circle
	 * @return	true	if they intersect
	 * 			false	if they don't intersect
	 */
	public static boolean intersect(int x1, int y1, int r1, int x2, int y2, int r2) { 
		double distance;
		// calcualte the distance between two origins
		// using the formula
		// square root of (x1 - x2)^2 + (y1 - y2)^2
		distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		//compare distance to sum of two radius
		if (distance <= (r1 + r2)) { 
			return true;
		} else return false;
	}
	
	/**
	 * This method check if the circle is 
	 * completely inside, or completely outside
	 * or partially inside the window (300x400)
	 * 
	 * @param x	x_location of the circle
	 * @param y	y_location of the circle
	 * @param r radius of the circle
	 * @return	1 	if the circle is completely inside the window
	 * 			-1	if completely outside the circle
	 * 			0	if partially inside the circle
	 */
	public static int inside(int x, int y, int r) { 
		if ((x+r<=WIDTH) && (y+r<=HEIGHT) && (x-r>=0) && (y-r>=0)) { 
			return 1;
		} else if ((x+r<0) || (x-r>WIDTH) ||  (y+r<0) || (y-r>HEIGHT)) { 
			return -1;
		} else { 
			return 0;
		}	
	}
	
	/**
	 * Main method of the program
	 * 
	 * @param args	NOT USED
	 * @throws FileNotFoundException
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		// declare variables that will store information
		// about the circles
		int x1,y1,r1;
		int x2,y2,r2;
		int x3,y3,r3;
		
		// declare and initialize input and output stream
		// for the program
		Scanner input = new Scanner(System.in);
		//PrintStream output = new PrintStream(new FileOutputStream("CirclesOutput.txt"));
		
		// Print out the introduction
		System.out.println("Lab 5 written by An Tri Bao Nguyen");

		// construct a new panel
		// and add a graphic element into the panel
		DrawingPanel panel = new DrawingPanel(WIDTH, HEIGHT);
		Graphics g = panel.getGraphics();
		
		// prompt user to enter information for the 1st circle
		System.out.println("\nEnter information for the first circle: ");
		System.out.print("x = ");
		x1 = input.nextInt();
		System.out.print("y = ");
		y1 = input.nextInt();
		System.out.print("r = ");
		r1 = input.nextInt();
		
		// calculate the parameters for fillOval
		int x,y,r;
		x = x1 - r1;
		y = y1 - r1;
		r = r1 * 2;
		
		// draw the first circle
		// and fill the color inside the circle
		g.setColor(COLOR1);
		g.drawOval(x, y, r, r);
		g.fillOval(x, y, r, r);  // Lab 5 require to have g.fillOval
		
		// prompt user to enter information for the 2nd circle
		System.out.println("\nEnter information for the second circle: ");
		System.out.print("x = ");
		x2 = input.nextInt();
		System.out.print("y = ");
		y2 = input.nextInt();
		System.out.print("r = ");
		r2 = input.nextInt();
		
		// calculate the parameters for fillOval
		x = x2 - r2;
		y = y2 - r2;
		r = r2 * 2;
				
		// draw the second circle
		// and fill the color inside the circle
		g.setColor(COLOR2);
		g.drawOval(x, y, r, r);
		g.fillOval(x, y, r, r);
		
		// prompt user to enter information for the 3rd circle
		System.out.println("\nEnter information for the third circle: ");
		System.out.print("x = ");
		x3 = input.nextInt();
		System.out.print("y = ");
		y3 = input.nextInt();
		System.out.print("r = ");
		r3 = input.nextInt();
		
		// calculate the parameters for fillOval
		x = x3 - r3;
		y = y3 - r3;
		r = r3 * 2;
		
		// draw the third circle 
		// and fill the color inside the circle
		g.setColor(COLOR3);
		g.drawOval(x, y, r, r);
		g.fillOval(x, y, r, r);
		
		// call the method compareTwoCircles to compare 2 circles
		// and save the return value into compare variable
		// then output the result for the 1st and 2nd circle
		// into CirclesOutput.txt
		int compare = compareTwoCircles(r1, r2); 	
		if (compare == -1) { 
			System.out.println("The green circle is smaller than the red circle");
		} else if (compare == 0) {
			System.out.println("The green circle is equal to the red circle");
		} else { 
			System.out.println("The green circle is bigger than the red circle");
		}
		
		// call the method compareTwoCircles to compare 2 circles
		// and save the return value into compare variable
		// then output the result for the 1st and 3rd circle
		// into CirclesOutput.txt		
		compare = compareTwoCircles(r1, r3); 
		if (compare == -1) { 
			System.out.println("The green circle is smaller than the blue circle");
		} else if (compare == 0) {
			System.out.println("The green circle is equal to the blue circle");
		} else { 
			System.out.println("The green circle is bigger than the blue circle");
		}
		
		// call the method compareTwoCircles to compare 2 circles
		// and save the return value into compare variable
		// then output the result for the 2nd and 3rd circle
		// into CirclesOutput.txt		
		compare = compareTwoCircles(r2,r3);
		if (compare == -1) { 
			System.out.println("The red circle is smaller than the blue circle");
		} else if (compare == 0) {
			System.out.println("The red circle is equal to the blue circle");
		} else { 
			System.out.println("The red circle is bigger than the blue circle");
		}
		
		// check intersect of circle 1 and 2
		// output the result into CirclesOutput.txt
		boolean intersect = intersect(x1,y1,r1,x2,y2,r2);
		if (intersect) { 
			System.out.println("The green circle intersects with the red circle");
		} else { 
			System.out.println("The green circle does not intersect with the red circle");
		}
		
		// check intersect of circle 1 and 3
		// output the result into CirclesOutput.txt
		intersect = intersect(x1,y1,r1,x3,y3,r3);
		if (intersect) { 
			System.out.println("The green circle intersects with the blue circle");
		} else { 
			System.out.println("The green circle does not intersect with the blue circle");
		}

		// check intersect of circle 2 and 3
		// output the result into CirclesOutput.txt
		intersect = intersect(x2,y2,r2,x3,y3,r3);
		if (intersect) { 
			System.out.println("The red circle intersects with the blue circle");
		} else { 
			System.out.println("The red circle does not intersect with the blue circle");
		}
		
		// Check the boudary of the 1st circle and
		// output the result into CirclesOutput.txt
		int inside = inside(x1,y1,r1);
		if (inside == 1) { 
			System.out.println("The green circle is completely inside the window");
		} else if(inside == 0) { 
			System.out.println("The green circle is partially inside the window");
		} else { 
			System.out.println("The green circle is completely outside the window");
		}
		
		// Check the boudary of the 1st circle and
		// output the result into CirclesOutput.txt
		inside = inside(x2,y2,r2);
		if (inside == 1) { 
			System.out.println("The red circle is completely inside the window");
		} else if(inside == 0) { 
			System.out.println("The red circle is partially inside the window");
		} else { 
			System.out.println("The red circle is completely outside the window");
		}
		
		// Check the boudary of the 1st circle and
		// output the result into CirclesOutput.txt
		inside = inside(x3,y3,r3);
		if (inside == 1) { 
			System.out.println("The blue circle is completely inside the window");
		} else if(inside == 0) { 
			System.out.println("The blue circle is partially inside the window");
		} else { 
			System.out.println("The blue circle is completely outside the window");
		}
		
		

	}
}
