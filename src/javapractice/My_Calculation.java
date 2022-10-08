package javapractice;

public class My_Calculation extends Calculation {
	
		public void multiplication(int x, int y) {
			z = x * y;
			System.out.println("The product of the given numbers:" + z);
		}

		public static void main(String args[]) {
			int x = 20, y	 = 10;
			My_Calculation demo = new My_Calculation();
			demo.addition(x, y);
			demo.Subtraction(x, y);
			demo.multiplication(x, y);
		}
	}

