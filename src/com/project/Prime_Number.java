package com.project;

public class Prime_Number {

	public static void main(String[] args) {

		int n = 6;
		boolean flag = true;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}

	}
}
