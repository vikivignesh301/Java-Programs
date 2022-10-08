//import java.io.*;
package com.javaclass;

public class ThrowThrows {
	
	public static void main(String[] args) throws AgeNotValidException {
		int age = 10;
		if(age>18) 
		{
			System.out.println("Elligible");
		}
		
		else 
		{
			throw new AgeNotValidException();
		}
	}
}



