package com.project;

import java.util.Arrays;

public class Anagram_Program {

	public static void main(String[] args) {

		String s1 = "Tracet";
		String s2 = "ceartt";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() == s2.length()) {
			
			char[] ca1 = s1.toCharArray();
			char[] ca2 = s2.toCharArray();

			Arrays.sort(ca1);
			Arrays.sort(ca2);

			if (Arrays.equals(ca1, ca2)) {
				System.out.println(s1 + " and " + s2 + " are anagram.");
			} else {
				System.out.println(s1 + " and " + s2 + " are not anagram.");
			}
		}
	}
}
