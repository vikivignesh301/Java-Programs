package com.project;

public class Repetative_Word_For_loop {

	public static void main(String[] args) {

		String str = "for the people by the people of the people";

		String[] split = str.split(" ");
		
		int count;
				
		for (int i = 0; i < split.length; i++) {
			count=1;
			for (int j = i+1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					count++;
					split[j]="0";
				}
			}
			if (count > 1 && split[i] != "0") {
				System.out.println(split[i]);
			}
		}
	}

}
