package com.javaclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Threadsleep {
	//File not found Exception
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Hello Function");
		
		//Pause Timing
		Thread.sleep(4000);
		
		System.out.println("String Function");
		FileInputStream fs = new FileInputStream("E://String.xex");
	}
	

}
