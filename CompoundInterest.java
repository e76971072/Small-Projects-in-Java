

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p = 1000;
		double r = 0.05;
		double y = 5;
		
		for ( int i = 1; i<=5; i++) {
		p = p*(1+r);
		
		
		System.out.println(" THis your statement for each year "+i+ " is " + p);
		
	     
		}
	}
}


