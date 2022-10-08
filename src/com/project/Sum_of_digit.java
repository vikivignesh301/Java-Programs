package com.project;

public class Sum_of_digit {

	public static void main(String[] args) {

		int n = 345689;
		int tem = n;
		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("the sum of digit for " + tem + " is " + sum);
	}
}
