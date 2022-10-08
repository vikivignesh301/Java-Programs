package com.javaclass;

public class Samplepoint {
	public static void sample() {
		int a = 40;
		byte b = 56;
		char c = 'A';
		float f = 1.2f;
		double d = 1.34;
		System.out.println("int value is = " + a);
		System.out.println("byte value is = " + b);
		System.out.println("char value is = " + c);
		System.out.println("float value is = " + f);
		System.out.println("double value is = " + d);
	}

	public static void main(String[] args) {
		System.out.println("sample");
		System.out.println("function");
		Samplepoint sc = new Samplepoint();
		sc.sample();

	}
}
