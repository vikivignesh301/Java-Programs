package com.project;

public class UpperCase_LowerCase {
	
	public static void main(String[] args) {
		
		String s = "JaVa SeLeNiem TestInG";
		int lower = 0;
		int upper = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>=65 && ch<=90) {
				upper++;
			}else {
				lower++;
			}
		}
		System.out.println(lower);
		System.out.println(upper);
	}

}
