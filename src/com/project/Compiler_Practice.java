package com.project;

public class Compiler_Practice {

	public static void main(String args[]) {
		int a = 123;
		int temp = a;
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			sum = (rem * rem * rem) + sum;
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println("is armstrong");
		} else {
			System.out.println("not a armstrong");
		}

	}
}
