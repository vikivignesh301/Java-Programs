package com.project;


public class Print_1_to_100_NoLoop {
	
	public static void printNum(int num) {
		
		if (num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	public static void main(String[] args) {
		printNum(1);
	}
}
