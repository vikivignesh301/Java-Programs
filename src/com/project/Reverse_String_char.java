package com.project;

public class Reverse_String_char {

	public static void main(String[] args) {
		String s = "Incrideble India";
		System.out.println(s);
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
