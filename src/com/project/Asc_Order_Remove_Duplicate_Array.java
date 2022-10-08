package com.project;

import java.util.Set;
import java.util.TreeSet;

public class Asc_Order_Remove_Duplicate_Array {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 2, 9, 3, 1, 6, 8, 7 , 4, 5, 1, 9 };
		Set<Integer> s = new TreeSet<>();
		for (int i : arr) {
			s.add(i);
		}
		System.out.println(s);

	}
}
