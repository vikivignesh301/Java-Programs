package com.project;

import java.util.Arrays;
import java.util.Collections;

public class Asc_Dce_Array {

	public static void asending() {
		int a[] = { 2, 1, 9, 3, 5, 7, 4, 6, 8, 0, 2, 3 };
		Arrays.sort(a);
		System.out.println("The Ascending of a is : " + Arrays.toString(a));

	}

	public static void decending() {
		Integer a1[] = { 2, 1, 9, 3, 5, 7, 4, 6, 8, 0, 10 };
		Arrays.sort(a1, Collections.reverseOrder());
		System.out.println("The Decending of a1 is : " + Arrays.toString(a1));
	}

	public static void main(String[] args) {
		asending();
		decending();
	}
}