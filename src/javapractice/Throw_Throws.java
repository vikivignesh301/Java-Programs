package javapractice;

public class Throw_Throws {
	
	public static void ArithmeticExceptions() throws Exception {
		
		int i = 10;
		
		try {
			System.out.println(i/0);
		} catch (Exception e) {
			throw new Exception();
		}finally {
			System.out.println("Exception Handled");
		}
	}
	public static void main(String[] args) throws Exception {
		
		ArithmeticExceptions();
	}

}
