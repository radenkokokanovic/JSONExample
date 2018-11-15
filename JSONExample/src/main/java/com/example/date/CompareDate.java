package com.example.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDate {
	public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2009-12-31");
        Date date2 = sdf.parse("2010-01-31");
        
        Date date3 = sdf.parse("2011-02-22");
        Date date4 = sdf.parse("2014-11-25");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
        } else {
            System.out.println("How to get here?");
        }
        
        if (date3.compareTo(date4) > 0) {
            System.out.println("Date3 is after Date4");
        } else if (date3.compareTo(date4) < 0) {
            System.out.println("Date3 is before Date4");
        } else if (date3.compareTo(date4) == 0) {
            System.out.println("Date3 is equal to Date4");
        } else {
            System.out.println("How to get here?");
        }
        
        
        

    }

}
