package com.javaclass;

public class Interfacebankinfo implements Interfacebank{

	
	public static void main(String[] args) {
		
		Interfacebankinfo ib = new Interfacebankinfo();
		ib.tata();
		ib.maruthi();
		ib.hyundai();
	}

	@Override
	public void maruthi() {
		// TODO Auto-generated method stub
		System.out.println("share is 10000");
	}

	@Override
	public void hyundai() {
		// TODO Auto-generated method stub
		System.out.println("share is 9000");
	}

	@Override
	public void tata() {
		// TODO Auto-generated method stub
		System.out.println("share is 8000");
	}

	
}
