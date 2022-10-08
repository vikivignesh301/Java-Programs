package com.javaclass;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepetativeWordProgram {

	public static void main(String[] args) {

		String s = "for the people by the people of the people";

		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

		String[] allwords = s.split(" ");

		for (String word : allwords) {
			if (m.containsKey(word)) {
				Integer value = m.get(word);
				m.put(word, value + 1);
			} else {
				m.put(word, 1);
			}
		}
		Set<Entry<String, Integer>> entryset = m.entrySet();

		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}

	}
}
