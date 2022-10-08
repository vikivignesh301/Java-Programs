package com.project;

public class Prime_Number {

	public static void main(String[] args) {

		int n = 10;
		float f = 0.0f;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				f = 0.1f;
			}
		}
		if (f == 0.0f) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}

	}
}
