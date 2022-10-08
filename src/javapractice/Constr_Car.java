package javapractice;

public class Constr_Car {

	public Constr_Car() {
		System.out.println("hyundai");
	}
	public Constr_Car(String s) {
		System.out.println("maruthi");
	}
	public Constr_Car (int i) {
		System.out.println("BMW");
	}
	public static void main(String[] args) {
		Constr_Car c = new Constr_Car();
		Constr_Car c1 = new Constr_Car("baleno");
		Constr_Car c2 = new Constr_Car(650); 
	}
}
