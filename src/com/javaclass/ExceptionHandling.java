package com.javaclass;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			System.out.println(5 % 0);
			System.out.println("exception handling");
			} 
		catch (ArithmeticException e) {
			throw  new NullPointerException();
		}
	}

}
/*
 * try { System.out.println(6%0); System.out.println("Java"); } catch(Exception
 * a) { System.out.println(a.getLocalizedMessage());
 * System.out.println("Error is Occuring"); }
 */