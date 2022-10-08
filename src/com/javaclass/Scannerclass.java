package com.javaclass;

import java.util.Scanner;

//scanner next()   scanner nextLine()

public class Scannerclass {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		System.out.println(i);

		System.out.println("Enter the number");
		byte b = sc.nextByte();
		System.out.println(b);

		System.out.println("Enter the Boolean");
	    boolean c = sc.nextBoolean();
		System.out.println(c);
		
		System.out.println("Enter the number");
		double d = sc.nextDouble();
		System.out.println(d);
		
		System.out.println("Enter the number");
		float f = sc.nextFloat();
		System.out.println(f);
		
		System.out.println("Enter the String");
		String line = sc.nextLine();
		System.out.println(line);
		
		System.out.println("Enter the number");
		long l = sc.nextLong();
		System.out.println(l);
		
		System.out.println("Enter the number");
		short s = sc.nextShort();
		System.out.println(s);
		
		System.out.println("Enter the number");
		boolean e = sc.hasNext();
		System.out.println(e);
		
		
		/*
		 * System.out.println("Enter the number"); int a = sc.nextInt();
		 * System.out.println(a);
		 * 
		 * System.out.println("Enter the number"); String s1 = sc.nextLine();
		 * System.out.println(s1);
		 */
		

	}

}
