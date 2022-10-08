package com.project;

public class Reverse_of_number {

	public static void main(String[] args) {

		int n = 345689;
		int tem = n;
		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		System.out.println("the reverse of "+tem+" is "+sum);
	}
}
