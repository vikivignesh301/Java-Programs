package com.project;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class All_Programs {

	public static void swap_2_Numbers() {

		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("===============");
	}

	public static void swap_2_String() {

		String s = "java";
		String s1 = "selenium";

		s = s + s1;
		s1 = s.substring(0, s.length() - s1.length());
		s = s.substring(s1.length());

		System.out.println("s : " + s);
		System.out.println("s1 : " + s1);
		System.out.println("===============");
	}

	public static void reverse_String() {

		String s = "java with selenium";
		String[] sp = s.split(" ");

		for (int i = sp.length - 1; i >= 0; i--) {
			System.out.print(sp[i] + " ");
		}
		System.out.println();
		System.out.println("===============");
	}

	public static void reverse_char() {

		String s = "hello world java";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("===============");
	}

	public static void dupicate_in_array() {

		int[] a = { 2, 4, 3, 7, 9, 2, 4, 6, 1, 6, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[j] + ",");
				}
			}
		}
		System.out.println();
		System.out.println("===============");
	}

	public static void print_Only_Char() {

		String s = "selenium123";
		String re = s.replaceAll("[^a-zA-Z]", " ");
		System.out.println(re);
		System.out.println("===============");
	}

	public static void anagram() {

		String s = "train";
		String s1 = "inatr";

		s = s.toLowerCase();
		s1 = s1.toLowerCase();

		if (s.length() == s1.length()) {
			char[] ca = s.toCharArray();
			char[] ca1 = s1.toCharArray();

			Arrays.sort(ca);
			Arrays.sort(ca1);

			if (Arrays.equals(ca, ca1)) {
				System.out.println("s and s1 is Anagram");
			} else {
				System.out.println("s and s1 is not a Anagram");
			}
		}
		System.out.println("===============");
	}

	public static void fibonasis() {

		int a = 0;
		int b = 1;

		System.out.print(a + "," + b + ",");

		for (int i = 1; i <= 5; i++) {

			int c = a + b;
			System.out.print(c + ",");

			a = b;
			b = c;
		}
		System.out.println();
		System.out.println("===============");
	}

	public static void duplicate_Char() {

		String s = "selenium with java";
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j]);
				}
			}
		}
		System.out.println();
		System.out.println("===============");
	}

	public static void reverse_Triangle() {

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("===============");
	}

	public static void array_Ascending() {

		int[] a = { 1, 9, 4, 6, 7, 2, 5, 8, 1, 95, 4, 32 };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("===============");
	}

	public static void array_Descending() {

		Integer[] a = { 1, 9, 4, 6, 7, 2, 5, 8, 1, 95, 4, 32 };

		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		System.out.println("===============");
	}

	public static void find_Upper_Lower_Case() {

		String s = "SelENiUm WitH JaVa";
		int upper = 0;
		int lower = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper++;
			} else {
				lower++;
			}
		}
		System.out.println("uppercase : " + upper);
		System.out.println("lowercase : " + lower);
		System.out.println("===============");
	}

	public static void count_The_Digit() {

		int a = 14356;
		int temp = a;
		int count = 0;

		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println(count);
		System.out.println("===============");
	}

	public static void Sum_of_digit() {

		int a = 14356;
		int temp = a;
		int sum = 0;

		while (a > 0) {
			int rem = a % 10;
			sum = rem + sum;
			a = a / 10;
		}
		System.out.println(sum);
		System.out.println("===============");
	}

	public static void reverse_of_Number() {

		int a = 14356;
		int temp = a;
		int sum = 0;

		while (a > 0) {
			int rem = a % 10;
			sum = (sum * 10) + rem;
			a = a / 10;
		}
		System.out.println(sum);
		System.out.println("===============");
	}

	public static void repetative_Word() {

		String s = "for the people by the people of the people";
		String[] allword = s.split(" ");
		Map<String, Integer> m = new HashMap<>();

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
		System.out.println();
		System.out.println("===============");
	}

	public static void prime_Number() {

		int n = 4;
		boolean flag = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
		System.out.println("===============");
	}

	public static void print1_to_100_NoLoop(int num) {

		if (num <= 100) {
			System.out.print(num + ",");
			num++;
			print1_to_100_NoLoop(num);
		}

	}

	public static void armStrong() {
		System.out.println();
		System.out.println("===============");

		int a = 153;
		int temp = a;
		int sum = 0;

		while (a > 0) {

			int rem = a % 10;
			sum = (rem * rem * rem) + sum;
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println("ArmStrong");
		} else {
			System.out.println("Not a ArmStrong");
		}
		System.out.println("===============");
	}

	public static void palindrom() {

		int a = 12121;
		int temp = a;
		int sum = 0;

		while (a > 0) {

			int rem = a % 10;
			sum = (sum * 10) + rem;
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		System.out.println("===============");
	}

	public static void Factorial() {

		int n = 7;
		int temp = n;
		int sum = 1;

		for (int i = 1; i <= n; i++) {

			sum = i * sum;
		}
		System.out.println(sum);
		System.out.println("===============");
	}

	public static void star_Pattern() {

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===============");
	}

	public static void TimeStamp() {

		Timestamp time = new Timestamp(System.currentTimeMillis());
		Date d = new Date(time.getTime());
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(s.format(d));
		
		System.out.println("===============");
	}
	
	public static void first_Letter_Caps() {
		String s = "my name is java";
		String[] sp = s.split(" ");
		
		for (int i = 0; i < sp.length; i++) {
			String[] sp1 = sp[i].split("");
			for (int j = 0; j < sp1.length; j++) {
				if (j==0) {
					String uc = sp1[j].toUpperCase();
					System.out.print(uc);
				}else {
					System.out.print(sp1[j]);
				}
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		swap_2_Numbers();
		swap_2_String();
		reverse_String();
		reverse_char();
		dupicate_in_array();
		print_Only_Char();
		anagram();
		fibonasis();
		duplicate_Char();
		reverse_Triangle();
		array_Ascending();
		array_Descending();
		find_Upper_Lower_Case();
		count_The_Digit();
		Sum_of_digit();
		reverse_of_Number();
		repetative_Word();
		prime_Number();
		print1_to_100_NoLoop(1);
		armStrong();
		palindrom();
		Factorial();
		star_Pattern();
		TimeStamp();
		first_Letter_Caps();
	}

}
