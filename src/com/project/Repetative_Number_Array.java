package com.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Repetative_Number_Array {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 2, 3, 6 };
		TreeMap<Integer, Integer> m = new TreeMap<>();
		TreeMap<Integer, Integer> m1= new TreeMap<>();

		for (int i : a) {
			if (m.containsKey(i)) {
				Integer value = m.get(i);
				m.put(i, value + 1);
			} else {
				m.put(i, 1);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = m.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				m1.put(entry.getKey(),entry.getValue());
			}
	
		}
		System.out.println(m1);
	}
}
