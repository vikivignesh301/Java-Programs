package com.javaclass;

public class PojoClass1 {

	public static void main(String[] args) {

		PojoClass pc = new PojoClass();
		pc.setAge(12);
		pc.setName("jishnu");
		pc.setAddress("Chennai");

		System.out.println("Age : " + pc.getAge());
		System.out.println("Name : " + pc.getName());
		System.out.println("Address : " + pc.getAddress());
	}
}
