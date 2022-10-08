package com.javaclass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionsMapInterface {

	public static void main(String[] args) {

		Map m = new HashMap();
		m.put(10, 'A');
		m.put('B', 2.5d);
		m.put(10, "void");
		m.put(1.7f, true);
		m.put(false, "java");
		m.put(1, 100);
		m.put(0, "void");

		System.out.println(m);
		// Map Methods

		System.out.println("======size=====");
		System.out.println(m.size());

		System.out.println("======Contains Key======");
		System.out.println(m.containsKey(10));

		System.out.println("======Contains Value======");
		System.out.println(m.containsValue(2.5d));

		System.out.println("======get=====");
		System.out.println(m.get(false));

		System.out.println("======is empty=======");
		System.out.println(m.isEmpty());

		System.out.println("======keyset=======");
		Set keySet = m.keySet();
		System.out.println(keySet);

		System.out.println("======Values=======");
		Collection values = m.values();
		System.out.println(values);

		System.out.println("======Remove=======");
		m.remove('B');
		System.out.println(m);

		System.out.println("======Replace=======");
		m.replace(1, 1.24f);
		System.out.println(m);

		System.out.println("======Entryset=======");
		Set entrySet = m.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}

		System.out.println("======Clear=======");
		m.clear();
		System.out.println(m);

		System.out.println("======IsEmpty=======");
		boolean empty = m.isEmpty();
		System.out.println(empty);
	}

}
