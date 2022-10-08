package com.javaclass;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Iteratorfunction {
	public static void main(String[] args) {

		List li = new LinkedList();
		li.add(10);
		li.add("Java");
		li.add(1.5f);
		li.add('A');
		li.add(10);
		li.add("Java");

		// forloop
		System.out.println("For loop");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("For each loop");
		for (Object object : li) {
			System.out.println(object);
		}

		System.out.println("-------------iterator -----------");
		java.util.Iterator iterator = li.iterator();
		while (iterator.hasNext()) {
			// System.out.println(iterator.hasNext());
			System.out.println(iterator.next());
		}

		System.out.println("-------------Listiterator -----------");
		ListIterator listiterator = li.listIterator();
		while (listiterator.hasNext()) {

			System.out.println(listiterator.next());
		}

		System.out.println(listiterator.hasPrevious());
		while (listiterator.hasPrevious()) {

			System.out.println(listiterator.previous());
		}

	}

}
