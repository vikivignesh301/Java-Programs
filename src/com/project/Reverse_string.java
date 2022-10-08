package com.project;

public class Reverse_string {

	public static void main(String[] args) {
		String s = "Welcome to India";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i] + " ");
		}
		//Rev Word
		System.out.println();
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}
		//Method 1  Rev Char
		System.out.println();
		for(int i = s.length() - 1 ; i >= 0 ; i-- ) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//Method 2  Rev Char
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}

}