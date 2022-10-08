package com.javaclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Linked list
public class Collections {

	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add("java");
		li.add(1.2f);
		li.add('A');
		li.add(10);
		li.add("java");
		
		System.out.println(li);
				
		//add
		System.out.println("=====add=====");
		System.out.println(li);
		
		//size
		System.out.println("=====size=====");
		System.out.println(li.size());
		
		//get
		System.out.println("=====get=====");
		System.out.println(li.get(4));
		
		//contains
		System.out.println("=====contains=====");
		System.out.println(li.contains('A'));
		
		//indexof
		System.out.println("=====indexof=====");
		System.out.println(li.indexOf(1.2f));
		
		//lastindexof
		System.out.println("=====lastindexof=====");
		System.out.println(li.lastIndexOf(10));
		
		//indexbasedadd
		li.add(3,"system");
		System.out.println("=====indexbasedadd=====");
		System.out.println(li);
		
		//remove
		System.out.println("=====remove=====");
		li.remove(5);
		System.out.println(li);
				
		//sublist
		System.out.println("====sublist====");
		System.out.println(li.subList(1, 4));
		
		//clear
		System.out.println("====clear====");
		li.clear();
		System.out.println(li);
		
		//isempty
		System.out.println("====isempty====");
		System.out.println(li.isEmpty());
		
	}
}
