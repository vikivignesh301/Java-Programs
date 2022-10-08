package javapractice;

public class Convert_Datatype {

	public static void main(String[] args) {

		String s = "12345";

		// String to int
		int int1 = Integer.parseInt(s);
		System.out.println(int1);

		// int to String
		String s1 = String.valueOf(int1);
		System.out.println(s1);

		// String to Integer
		Integer int2 = Integer.valueOf(s);
		System.out.println(int2);

	}

}
