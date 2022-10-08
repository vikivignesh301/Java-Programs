package com.javaclass;

public class Arrayclass {

	public static void main(String[] args) {

		// single dimension
		// literal vertical

		int arr[] = new int[5];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;

		System.out.println(arr[2]);

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		// non literal horizontal
		int arr1[] = { 100, 200, 300, 400, 500, 600, 700, 800 };

		// to find length
		System.out.println(arr1.length);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("multi dimensional");
		// multiple dimension
		// literal
		// matrix type

		int multi[][] = new int[3][3];

		multi[0][0] = 1;
		multi[0][1] = 2;
		multi[0][2] = 3;
		multi[1][0] = 4;
		multi[1][1] = 5;
		multi[1][2] = 6;
		multi[2][0] = 7;
		multi[2][1] = 8;
		multi[2][2] = 9;

		// non literal
		int multi1[][] = {{100,200,300,400},{500,600,700,800},{900,100,110,120},{300,400,500,600} };

		// to find length
		System.out.println(multi.length);

		System.out.println(multi[1][0]);

		System.out.println(multi1.length);

		System.out.println(multi1[1].length);

		System.out.println(multi1[3][2]);

		for (int i = 0; i < multi1.length; i++) {
			for (int j = 0; j < multi1[1].length; j++) {
				System.out.print(multi1[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
