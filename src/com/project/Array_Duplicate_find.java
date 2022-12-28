package com.project;

public class Array_Duplicate_find {

	public static void main(String[] args) {

		int arr[] = { 4, 6, 2, 9, 3, 1, 6, 8, 4, 5, 1, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate found is : " + arr[j]);

				}
			}
		}

	}
}
