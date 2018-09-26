
public class Review {
	
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 30;
		int minimum;
		minimum = method(i, j, k);
		System.out.println("minimum is = " + minimum);

		}
		public static int method(int i, int j, int k) {
		int min = (Math.min(Math.min(i, j), k));
		return min;
		}

		}
