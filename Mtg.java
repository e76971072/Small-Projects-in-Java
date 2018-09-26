

import java.util.*;
public class Mtg {
	public static void main (String [] args) {
		System.out.println( Payment(150000,0.00416,360));
	}
		public static double Payment ( double p, double i, double n) {
			// P = principle, 
			double x1= p*i;
			double x2 = 1+i;
			double x3 = Math.pow(x2, n);
			double x4 = x1*x3;
			double x5 = x3 -1;
			double m = x4/x5;
			return m; 
		}
}


	
