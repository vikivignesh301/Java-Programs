package com.project;

public class Forlooptask {
	public void Five() {
		int i;
		for(i=0;i<=100;i++) 
		{
			if(i%5==0) 
			{
				System.out.println(i+ " is Divisible by 5");
			}}
	}
	public static void main(String[] args) {
		Forlooptask fl = new Forlooptask();
		fl.Five();
	
		int i;
		for(i=0;i<=100;i++) 
		{
			if(i%10==0) 
			{
				System.out.println(i+ " is Divisible by 10");
			}
		}
	}}
	
	