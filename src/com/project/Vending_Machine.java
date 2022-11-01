package com.project;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Vending_Machine {

	public static int price1;

	public static void main(String[] args) {

		Map<Integer, String> m = new LinkedHashMap<>();// List of Item
		m.put(1, "Biscuit");
		m.put(2, "Chocolate");
		m.put(3, "Chips");
		m.put(4, "Juice");
		m.put(5, "Ice Cream");
		m.put(6, "Coffee");
		Map<Integer, Integer> m1 = new LinkedHashMap<>();// Price of Item
		m1.put(1, 5);
		m1.put(2, 23);
		m1.put(3, 25);
		m1.put(4, 66);
		m1.put(5, 100);
		m1.put(6, 51);
		Map<Integer, Integer> m2 = new LinkedHashMap<>();// Total Count Of Item
		m2.put(1, 10);
		m2.put(2, 10);
		m2.put(3, 10);
		m2.put(4, 10);
		m2.put(5, 10);
		m2.put(6, 10);
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println("Enter The Tray Number");
		Scanner s = new Scanner(System.in);
		int tray_no = s.nextInt();

		if ((tray_no <= 6)&&(tray_no != 0)) {
			if (tray_no == 1) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 2) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 3) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 4) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 5) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 6) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			}
			System.out.println("Proceed With Transaction : Y/N");
			String proceed = s.next();
			if (proceed.equalsIgnoreCase("Y")) {
				System.out.println("Accepted Denominations Are 1 5 10 100");
			} else if (proceed.equalsIgnoreCase("N")) {
				System.err.println("Transaction Cancelled");
				System.err.println("Thank You For Showing Intrest On US");
			}
			System.out.println("Proceed With Payment : Y/N");
			String proceed_payment = s.next();
			if (proceed_payment.equalsIgnoreCase("Y")) {
				System.out.println("Enter The Denomination");
				int denomination = s.nextInt();
				if (denomination == 1 || denomination == 5 || denomination == 10 || denomination == 100) {
					System.out.println("Enter The No Of Note");
					int no_of_note = s.nextInt();
					int price = denomination * no_of_note;
					if (price != m1.get(tray_no)) {
						System.out.println("Enter The Denomination");
						int denomination1 = s.nextInt();
						System.out.println("Enter The No Of Note");
						int no_of_note1 = s.nextInt();
						price1 = denomination1 * no_of_note1;
					}
					System.out.println("Comfirm Payment : Y/N");
					String confirm_denomination = s.next();
					if (confirm_denomination.equalsIgnoreCase("Y")) {
						int total_price = price + price1;
						if (total_price == m1.get(tray_no)) {
							System.out.println("Item Is Dispensing");
							Integer value = m2.get(tray_no);
							m2.put(tray_no, value - 1);

						} else {
							System.err.println("Product Price Does Not Match");
						}
					} else {
						System.err.println("Transaction Cancelled");
						System.err.println("Thank You For Showing Intrest On US");
					}
				}else {
					System.err.println("Wrong Denomination");
				}

				} else if (proceed_payment.equalsIgnoreCase("N")) {
					System.err.println("Transaction Cancelled");
					System.err.println("Thank You For Showing Intrest On US");
				}
				Set<Entry<Integer, Integer>> product_count = m2.entrySet();
				System.out.println("Balance Count Of Product");
				for (Entry<Integer, Integer> entry : product_count) {
					System.out.println(entry);
				}

			} else {
				System.err.println("Tray No Is Out Of Bound");
			}

		}
	
}
