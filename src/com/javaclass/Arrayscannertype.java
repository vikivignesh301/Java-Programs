package com.javaclass;

import java.util.Scanner;

public class Arrayscannertype {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0;i<5;i++) 
		{
			//int nextInt = sc.nextInt();
			 a[i] = sc.nextInt();
			//a[i] = nextInt;
		}
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
