package javapractice;

public class UserException extends Exception {
	
	public UserException() {
		System.out.println("can not divide by zero");
	}

	public UserException(String str) {
		System.out.println(str);
	}
}
