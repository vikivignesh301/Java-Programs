package javapractice;

public class Poly_load {
	
	public void candidate(String s) {
		System.out.println("candidate name is " + s);
	}
	public void candidate(int id) {
		System.out.println("candidate id is " + id);
	}
	private void candidate(float f) {
		System.out.println("candidate cgpa is " + f);
	}
	public static void main(String[] args) {
		Poly_load p = new Poly_load();
		p.candidate("viki");
		p.candidate(24);
		p.candidate(6.6f);
	}

}
