package com.javaclass;

public class Methodoverriding1 extends Methodoverriding {

	@Override
	public void insertname() {
		// TODO Auto-generated method stub
		super.insertname();
	}
	@Override
	public void animalname() {
		// TODO Auto-generated method stub
		super.animalname();
	}
	public void birdname() {
		System.out.println("peacock");
	}

	public static void main(String[] args) {

		Methodoverriding1 m1 = new Methodoverriding1();
		m1.animalname();
		m1.birdname();
		m1.insertname();
	}

}
