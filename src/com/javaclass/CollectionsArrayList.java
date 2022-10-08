package com.javaclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//Arraylist and vector

public class CollectionsArrayList {
	
	public static void main(String[] args) {
		
		List li = new LinkedList();
		li.add(10);
		li.add("java");
		li.add(1.2f);
		li.add('A');
		li.add(10);
		
		System.out.println("====LinkedList====");
		System.out.println(li);
		
		List li1 = new Vector();
		li1.add(10);
		li1.add("java");
		li1.add(1.2f);
		li1.add('A');
		li1.add(10);
		
		System.out.println("====VectorList====");
		System.out.println(li1);
		
		
		List li2 = new ArrayList();
		li2.add('A');
		li2.add("function");
		li2.add("java");
		li2.add(100);
		
		System.out.println("====ArrayList====");
		System.out.println(li2);
		
		System.out.println("======Adding li2 to li======");
		li.addAll(li2);
		System.out.println(li);
		
		System.out.println(li.containsAll(li2));
		
	    li.removeAll(li2);
		System.out.println(li);
		
		li.retainAll(li2);
		System.out.println(li);
	}

}
