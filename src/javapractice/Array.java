package javapractice;

public class Array {
	
	public static void main(String[] args) {
		
		char[] c = {'A','B','C','D'};
		System.out.println(c[2]);
		for (char str : c) {
			System.out.println(str);
		}
		
		String[] s = new String[5];
		s[0] = "viki";
		s[1] = "vinith";
		s[2] = "naveen";
		s[3] = "shyam";
		s[4] = "logesh";
				
		System.out.println(s[3]);
		for (String str : s) {
			System.out.println(str);
		}
	}
	
}
