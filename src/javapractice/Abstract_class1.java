package javapractice;

public class Abstract_class1 extends Abstract_class {

	@Override
	public void cloudcourse() {
		System.out.println("course fees is 25000");
	}
	public static void main(String[] args) {
		Abstract_class1 a = new Abstract_class1();
		a.cloudcourse();
		a.javacourse();
		a.pythoncourse();
	}
}
