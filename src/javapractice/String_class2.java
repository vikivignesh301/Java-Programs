package javapractice;

public class String_class2 {

	// Mutable String

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Greens");
		StringBuffer sb1 = new StringBuffer("Greens");
		StringBuffer sb2 = new StringBuffer("Technology");
		
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		
		StringBuffer append = sb.append(sb2);
		System.out.println(sb);
		System.out.println(append.hashCode());
	}
}
