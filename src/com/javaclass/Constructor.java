package com.javaclass;

public class Constructor {
	public Constructor() {
		System.out.println("non parameterized");
	}
	public Constructor(int a) {
		System.out.println("int parameterized");
	}
	public Constructor(String a) {
		System.out.println("string parameterized");
	}
	public Constructor(int a , int b) {
		System.out.println("Int Int parameterized");
	}
	public Constructor(String a,byte b) {
		System.out.println("String byte parameterized");
	}
	public Constructor(byte b,String s) {
		System.out.println("byte String parameterized");
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(23);
		Constructor c2 = new Constructor("function");
		Constructor c3 = new Constructor(122 , 134);
		Constructor c4 = new Constructor("hello",(byte) 16);
		Constructor c5 = new Constructor((byte)16,"hi");
		
	}
}
