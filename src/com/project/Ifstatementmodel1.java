package com.project;

public class Ifstatementmodel1 {
	public void Five() {
		int i;
		for(i=0;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i+ " is divided by 5");
			}
		}
	}
public static void main(String[] args) {
	Ifstatementmodel1 fl = new Ifstatementmodel1();
	fl.Five();
	int i;
	for(i=0;i<=100;i++) {
		if(i%5==0 && i%10==0) {
			System.out.println(i+ " is divided by 5 and 10");
		}
	}
}
}
