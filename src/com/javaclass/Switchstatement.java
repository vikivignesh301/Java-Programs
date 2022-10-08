package com.javaclass;

import java.util.Scanner;

public class Switchstatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 10:
			System.out.println("switch function 1");
			break;
		case 20:
			System.out.println("switch function 2");
			break;
		case 30:
			System.out.println("switch function 3");
			break;
		case 40:
			System.out.println("switch function 4");
			break;
		case 50:
			System.out.println("switch function 5");
			break;
		default:
			System.out.println("Default");
			break;

		}
	}

}
