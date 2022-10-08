package com.project;

public class Count_of_digit {

	public static void main(String[] args) {
		
		int n = 124934578;
		int tem=n;
		int count=0;
		
		while (n>0) {
			n=n/10;
			count++;
		}
		System.out.println("total count of "+tem+" is " +count);
	}
}
