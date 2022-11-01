package com.project;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepetativeWordProgram {

	public static void main(String[] args) {

		String s = "for the people by the people of the people";

		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

		String[] allword = s.split(" ");

		for (String word : allword) {
			if (m.containsKey(word)) {
				Integer value = m.get(word);
				m.put(word, value + 1);
			} else {

				m.put(word, 1);
			}
		}
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}

	}
}
