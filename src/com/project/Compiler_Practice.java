package com.project;

import java.util.Iterator;

public class Compiler_Practice {

	public static void swapString() {
		
		String s = "java";
		String s1 ="selenium";
		
		s = s + s1;
		s1 = s.substring(0,s.length()-s1.length());
		s = s.substring(s1.length());
		
		System.out.println(s);
		System.out.println(s1);
	}
	
	public static void swapInt() {
		
		int a = 10;
		int b = 20;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void print_1_to_100(int num) {
		
		if (num<=100) {
			System.out.println(num);
			num++;
			print_1_to_100(num);
			
		}
	}
	
	public static void print_alpabetic_only() {
		
		String s  = "selenium123";
		
		String alpha = s.replaceAll("[^A-Za-z]", " ");
		
		System.out.println(alpha);
	}
	
	public static void star_pattern() {
		
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		swapString();
//		swapInt();
//		print_1_to_100(1);
//		print_alpabetic_only();
		star_pattern();
	}
}