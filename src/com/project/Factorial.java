package com.project;

public class Factorial {

	public static void main(String[] args) {

		int n = 6;
		int sum = 1;

		for (int i = 1; i <= n; i++) {
			
			sum=sum*i;
		}
		System.out.println("the factorial of "+n+" is "+sum);
	}
}
