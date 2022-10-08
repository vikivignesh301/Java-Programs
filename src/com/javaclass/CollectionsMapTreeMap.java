package com.javaclass;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsMapTreeMap {
	
	public static void main(String[] args) {
		
		Map <Integer,Object> m = new <Integer,Object> TreeMap();
		m.put(10, 'A');
		m.put(10, "void");
		m.put(-1, 100);
		m.put(0, "void");
		
		System.out.println(m);
	}

}
