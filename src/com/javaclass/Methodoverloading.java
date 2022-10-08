package com.javaclass;

public class Methodoverloading {
	
	public void Sample (int a, int a1 ) {
		System.out.println("int int");
	}
	public void Sample (byte b, int b1) {
		System.out.println("byte int");
	}
	public void Sample (double d, int b) {
		System.out.println("double int");
	}
	public void Sample (float a, int b) {
		System.out.println("float int");
	}
	public void sample (double a, float b) {
		System.out.println("double float");
	}
	public static void main(String[] args) {
		Methodoverloading mo = new Methodoverloading();
		mo.Sample(10, 20);
		mo.Sample((byte) 30, 10);
		mo.Sample(1.2, 50);
		mo.Sample(1.5f, 60);
		mo.sample(1.1, 1.2f);
	}

}
