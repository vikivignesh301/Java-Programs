package com.project;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int n=12321;
		int tem =n;
		int sum=0;
		
		while (n>0) {
			int rem = n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if (tem==sum) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
