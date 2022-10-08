package javapractice;

public class User_exception {
	
	public static void arithmeticcalculation() throws UserException {
		
		int i = 10;
		
		try {
			System.out.println(i/0);
		} catch (Exception e) {
			throw new UserException("CAN NOT DIVIDE BY ZERO");
		}
	}
	public static void main(String[] args) throws Exception {
		arithmeticcalculation();
	}
}
