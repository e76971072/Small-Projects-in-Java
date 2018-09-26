
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = " This is a test ";
		char c = 't';
		int hits = 0;
		//int myvar = s1.length();
		for ( int i = 0; i< s1.length(); i++) {
			char x = s1.charAt(i);
			if (c==x )
				hits++;
		}
		System.out.println(hits);
		

	}

}
