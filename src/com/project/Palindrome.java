package com.project;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int n=12321;//1232 123 12 1
		int tem =n;
		int sum=0;//1 12 123 1232 12321
		
		while (n>0) {
			int rem = n%10;//1 2 3 2 1
			sum=(sum*10)+rem;
			n=n/10; //1232 123 12 1
		}
		if (tem==sum) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
