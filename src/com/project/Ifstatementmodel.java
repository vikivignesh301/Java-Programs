package com.project;

public class Ifstatementmodel {
	public static void main(String[] args) {
		int i;
		for(i=0;i<=100;i++) {
			if(i%2==0 && (i%6==0 || i%3==0)) {
				System.out.println("divided by 2,6 or 3 " +i);
		}
	}
	}
}
