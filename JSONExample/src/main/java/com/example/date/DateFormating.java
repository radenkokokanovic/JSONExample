package com.example.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormating {
	
	public static void main(String[] args) throws ParseException {
		
		//Example 1
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date()); 
		System.out.println(date); //15/11/2018
		
		
		//Example 2 
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		String datum = sdf2.format(new Date());
		System.out.println(datum);
		
		
		//Example 3
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		Date date2 = sdf3.parse(dateInString);
		System.out.println(date2); //Tue Aug 31 10:20:56 SGT 1982
		
		
		//Example 4
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy MMM dd");	
		
		Calendar calendar = new GregorianCalendar(2013,10,28);	
		System.out.println("Date : " + sdf4.format(calendar.getTime()));

		//add one month
		calendar.add(Calendar.MONTH, 1);
		System.out.println("Date : " + sdf4.format(calendar.getTime()));
			
		//subtract 10 days
		calendar.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Date : " + sdf4.format(calendar.getTime()));
		
	}

}
