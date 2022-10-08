package com.javaclass;

public class Ifelseifstatement {
	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("Divided by 3 " + i);
				}
				else if (i % 4 == 0) {
				System.out.println("Divided by 4 " + i);
				} 
				else if (i % 5 == 0) {
				System.out.println("Divided by 5 " + i);
				} 
				else {
				System.out.println("00000000 " + i);
				}
			}
		}
	}
