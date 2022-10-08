package javapractice;

public class Prime_Number1TO100 {

	public static void main(String[] args) {

		int count = 0;
		for (int n = 2; n <= 100; n++) {
			boolean flag = true;
			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					flag = false;
				}

			}
			if (flag == true) {
				System.out.println(n+ " is Prime Number");
				count++;
			} 
		}
		System.out.println("total no of prime number is " +count);
	}
}
