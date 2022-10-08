package com.project;

import java.util.Scanner;

public class Switchstatementmodel {
	public static void main(String[] args) {
		System.out.println("Enter your Grade");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		switch (c) {
		case 'S':
			System.out.println("the mark is 90 to 100");
			break;
		case 'A':
			System.out.println("the mark is 80 to 90");
			break;
		case 'B':
			System.out.println("the mark is 70 to 80");
			break;
		case 'C':
			System.out.println("the mark is 60 to 70");
			break;
		case 'D':
			System.out.println("the mark is 50 to 60");
			break;
		case 'E':
			System.out.println("you are fail");
			break;
		default:
			System.out.println("your mark is pending");

		}
	}

}
