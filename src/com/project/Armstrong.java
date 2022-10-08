package com.project;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int n=153;
		int tem =n;
		int sum = 0;//27 152 153
		
		while (n>0) {
			
			int rem = n%10;//3 5 1
			sum=(rem*rem*rem)+sum;
			
			n=n/10;
		}
		if (tem==sum) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}
}
