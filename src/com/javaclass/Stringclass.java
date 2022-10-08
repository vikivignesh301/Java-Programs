package com.javaclass;

//string meathods

public class Stringclass {

	public static void main(String[] args) {

		String s = "western ghats";
		// length
		System.out.println("Length");
		System.out.println(s.length());

		// charAt
		System.out.println("charAt");
		System.out.println(s.charAt(4));

		// indexof
		System.out.println("Index of");
		System.out.println(s.indexOf('t'));

		// lastindexof
		System.out.println("Last Index of");
		System.out.println(s.lastIndexOf('t'));

		// indexof to find same character in another string value
		System.out.println("Index of");
		System.out.println(s.indexOf('t', 4));

		// to upper case
		System.out.println(" to Upper Case");
		System.out.println(s.toUpperCase());

		// Lower case
		System.out.println("Lower Case");
		System.out.println(s.toLowerCase());

		// contains
		System.out.println("Contains");
		System.out.println(s.contains("st"));

		// equal
		System.out.println("Equals");
		System.out.println(s.equals("western ghats"));

		// equal ignore case
		System.out.println("Equal ignore case");
		System.out.println(s.equalsIgnoreCase("WesTerN GhAts"));

		// concat
		System.out.println("Concat");
		System.out.println(s.concat(" beautiful "));

		// Starts with
		System.out.println("Starts with");
		System.out.println(s.startsWith("west"));

		// Endswith
		System.out.println("Ends With");
		boolean endswith = s.endsWith("ats");
		System.out.println(endswith);

		// isempty
		System.out.println("Is Empty");
		System.out.println(s.isEmpty());

		// Replace
		System.out.println("Replace");
		System.out.println(s.replace("e", "aaa"));

		// Replace first
		System.out.println("Replace First");
		System.out.println(s.replaceFirst("e", "fun"));

		// Split
		System.out.println("split");
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
		}

		// Trim
		System.out.println("Trim");
		System.out.println(s.trim());

		// substring
		System.out.println("Substring");
		String substring = s.substring(5);
		System.out.println(substring);

		// substring
		System.out.println("substring");
		String substring1 = s.substring(5, 10);
		System.out.println(substring1);

		// tochararray
		System.out.println("tochary");
		char[] cs = s.toCharArray();
		for (char d : cs) {
			System.out.println(d);
		}
		
		
		// Reverse
		System.out.println("Reverse");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
		}
	}