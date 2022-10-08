package javapractice;

public class String_class1 {
	//Immutable String
	
	public static void main(String[] args) {
		
		String s = "Greens";
		String s1 = "Greens";
		String s2 = "Technology";
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		String concat = s.concat(s2);
		System.out.println(concat.hashCode());
		System.out.println(s);
	}

}
