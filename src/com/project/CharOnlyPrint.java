package com.project;

public class CharOnlyPrint {

	public static void method1() {

		String s = "selenium123";

		String replace = s.replaceAll("[^A-Za-z]", " ");

		System.out.println(replace);
	}

	public static void method2() {

		String s = "selenium123";

		String[] sp = s.split("");
		
		for (int i = 0; i < sp.length; i++) {
			if (sp[i]) {
				
			}
			
			System.out.println(sp[i]);
		}
	}
	public static void main(String[] args) {
		method2();
	}

}
