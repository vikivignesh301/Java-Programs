package com.project;

import java.util.Arrays;

public class Array_3large {

	public static void main(String[] args) {

		int a[] = { 60, 10, 20, 80, 40, 30, 70, 50 };
		Arrays.sort(a);
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}

}
