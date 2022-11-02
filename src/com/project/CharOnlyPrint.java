package com.project;

public class CharOnlyPrint {

	public static void method1() {

		String s = "selenium123";

		String replace = s.replaceAll("[^A-Za-z]", " ");

		System.out.println(replace);
	}


	public static void main(String[] args) {
		method1();
	}

}
