package javapractice;

public class String_Class {

	public static void main(String[] args) {
			
		String s = "greens technology";
		System.out.println(s.hashCode());
		System.out.println(s);
		String replace = s.replace("technology","tech");
		System.out.println(replace.hashCode());
		System.out.println(replace);
	}
}
