package com.project;

import java.util.Arrays;

public class Anagram_Program {

	public static void main(String[] args) {

		String str1 = "Tracet";
		String str2 = "ceartt";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {

			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		}
	}
}
