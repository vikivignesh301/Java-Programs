package javapractice;

public class Return_Type {

	private static int add(int a, int b) {
		return a + b;
	}

	private static int sub(int a, int b) {
		return a - b;
	}

	private static int multi(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		System.out.println(add(50, 30));
		System.out.println(multi(50, 30));
		System.out.println(sub(50, 30));

	}
}
