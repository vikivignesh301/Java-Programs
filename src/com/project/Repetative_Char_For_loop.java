package com.project;

import java.util.Iterator;

public class Repetative_Char_For_loop {

	public static void main(String[] args) {

		String str = "functiontobeused";

		char[] letter = str.toCharArray();

		int count;

		for (int i = 0; i < letter.length; i++) {
			count = 1;
			for (int j = i + 1; j < letter.length; j++) {
				if (letter[i] == letter[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(letter[i]);
			}
		}
	}
}
