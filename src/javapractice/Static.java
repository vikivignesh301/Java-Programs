package javapractice;

public class Static {
	
	 static char c;
	 static boolean b;
	
	public static void add() {
		System.out.println("add method");
	}
	public static void sub() {
		System.out.println("sub method");
	}
	public static void div() {
		System.out.println("div method");
	}
	public static void main(String[] args) {
	//	Static s = new Static();
		add();
		sub();
		div();
		System.out.println(c);
		System.out.println(b);
	}
}
