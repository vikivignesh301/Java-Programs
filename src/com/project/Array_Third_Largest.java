package com.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Third_Largest {

	private static void method1() {
		int a[] = { 1, 5, 9, 3, 6, 7, 4 };
		Arrays.sort(a);
		System.out.println(a[2]);
	}

	private static void method2() {
		Integer a[] = { 1, 5, 9, 3, 6, 7, 4 };
		List<Integer> list = Arrays.asList(a);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(a[2]);
	}

	private static void method3() {
		int a[] = { 1, 5, 9, 3, 6, 7, 4 };
		int target = 10;
		int sum ;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0 + 1; j < a.length; j++) {
				sum = a[i] + a[j];
				if (sum == target) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

	public static void main(String[] args) {
		method1();
		method2();
//		method3();
	}
}
