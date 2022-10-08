package com.project;

import java.util.Arrays;

public class Sort_Array {
	
	public static void main(String[] args) {
		
		int a[] = {4,6,2,9,3,1,6,8,4,5,1,9};
		
		Arrays.sort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
