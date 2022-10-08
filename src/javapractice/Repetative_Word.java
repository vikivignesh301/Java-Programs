package javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_Word {

	public static void main(String[] args) {

		String s = "we few we happy few we band of brothers happy";

		String[] allwords = s.split(" ");

		Map<String, Integer> m = new HashMap<>();

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
