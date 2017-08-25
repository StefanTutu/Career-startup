package com.cgm.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSXXX");
		Date date = new Date();
		
		System.out.println("Today "+ dateFormat.format(date));
		calcDate(date);
	}
	
	public static void calcDate(Date date){
		
			Date before;
			Date after;
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSXXX");
			
			after = new Date(date.getTime() + (1000 * 60 * 60 * 24*3));
			before = new Date(date.getTime() - (1000 * 60 * 60 * 24*3));
			
			System.out.println("After 3 day  "+ dateFormat.format(after));
			System.out.println("Before 3 day "+ dateFormat.format(before));
	}

}
