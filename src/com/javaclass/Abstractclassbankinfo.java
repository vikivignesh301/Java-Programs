package com.javaclass;

public class Abstractclassbankinfo extends Abstractclassbank {

	@Override
	public void tata() {

		System.out.println("share is  200");
	}

	@Override
	public void hyundai() {

		System.out.println("share is 500");
	}

	public static void main(String[] args) {

		Abstractclassbankinfo bi = new Abstractclassbankinfo();
		bi.hyundai();
		bi.maruthi();
		bi.reliance();
		bi.tata();
		bi.mahendra();
	}

	@Override
	public void maruthi() {

		System.out.println("share is 700");

	}

	@Override
	public void mahendra() {

		System.out.println("share is 800");
	}

}
