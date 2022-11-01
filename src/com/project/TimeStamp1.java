package com.project;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp1 {

	public static void main(String[] args) {
			
		Timestamp time = new Timestamp(System.currentTimeMillis());
		Date  d = new Date(time.getTime());
		System.out.println(d);
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		System.out.println(s.format(d));
	
	}
}
