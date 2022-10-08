package com.javaclass;

public class Stringliteral {
	
	//string literal and non literal
	
	public static void main(String[] args) {
		
		System.out.println("String literal");
		String s = "function";
		String s1 = "function";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.concat("system").hashCode());
		System.out.println(s1.concat("synchor").hashCode());
		System.out.println(s);
		System.out.println(s1);
		System.out.println("============================");
		
		System.out.println("String NonLiteral");
		System.out.println("   Buffer   ");
		StringBuffer sb = new StringBuffer("function");
		StringBuffer sb1 = new StringBuffer("function");
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(sb.append(" buffer").hashCode());
		System.out.println(sb1.append(" buffer1").hashCode());
		System.out.println(sb);
		System.out.println(sb1);
		
		System.out.println("   Builder   ");
		StringBuilder sbb = new StringBuilder("function");
		StringBuilder sbb1 = new StringBuilder("function");
		System.out.println(sbb.hashCode());
		System.out.println(sbb1.hashCode());
		System.out.println(sbb.append(" calling").hashCode());
		System.out.println(sbb1.append(" calling1").hashCode());
		System.out.println(sbb);
		System.out.println(sbb1);
		
	}

}
