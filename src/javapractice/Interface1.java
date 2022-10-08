package javapractice;

public class Interface1 implements Interface {

	@Override
	public void javacourse() {
		System.out.println("course fees is 20000");
	}

	@Override
	public void pythoncourse() {
		System.out.println("course fees is 18000");
	}

	@Override
	public void cloudcourse() {
		System.out.println("course fees is 25000");
	}
	public static void main(String[] args) {
		Interface1 i = new Interface1();
		i.cloudcourse();
		i.javacourse();
		i.pythoncourse();
	}
	
}
