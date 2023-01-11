package strings;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String(s2);
		
		System.out.println(s1 == s3);
		System.out.println(s3.equals(s1));
	}

}
