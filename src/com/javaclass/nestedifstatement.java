package com.javaclass;

public class nestedifstatement {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println(i + " Divisible by 3");
				if (i % 7 == 0) {
					System.out.println(i + " Divisible by 3 and 7 ");
				}
				if (i % 8 == 0) {
					System.out.println(i + " Divisible by 8 ");

				}

			}
		}
	}
}
