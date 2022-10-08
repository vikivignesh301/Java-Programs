package com.javaclass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSetInterface {
	
	public static void main(String[] args) {
		//Random order
		
		Set se = new HashSet();
		se.add(10);
		se.add("System");
		se.add("java");
		se.add(1.2f);
		se.add('A');
		se.add("java");
		se.add(10);
		se.add(null);
				
		System.out.println("====HashSet====");
		System.out.println(se);
		
		Set  se1 = new LinkedHashSet();
		//Insertion order
		
		se1.add(10);
		se1.add("System");
		se1.add("java");
		se1.add(1.2f);
		se1.add('A');
		se1.add("java");
		se1.add(10);
		se1.add(null);
		
		System.out.println("====LinkedHashSet====");
		System.out.println(se1);
		
	//	Set <WrapperClass> refName = new TypesOfSet <WrapperClass> ();
		
		Set <String> se2 = new TreeSet <String> ();
		//Ascending order
		
		se2.add("function");
		se2.add("system");
		se2.add("sunday");
		se2.add("function");
		se2.add("monday");
		se2.add("sunday");
		se2.add("friday");
				
		System.out.println("====TreeSet====");
		System.out.println(se2);
	}

}
