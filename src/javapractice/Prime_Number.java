package javapractice;

public class Prime_Number {
	
	public static void main (String[] args) {
		
		int n = 10;
		boolean flag = true;
		
		for (int i = 2; i < n; i++) {
			
			if (n%i==0) {
				flag=false;
			}
			
		}
		if (flag==true) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Non Prime Number");
		}
	}
}
