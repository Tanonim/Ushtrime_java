package ushtrime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ushtrimi8 {
	  public static void main(String[] args) {
		  
	        Date now = new Date();
	 
	      /*  SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
	        System.out.println(simpleDateformat.format(now));*/
	 
	        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
	        System.out.println(simpleDateformat.format(now));
	 
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(now);
	        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format*/
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Venods nr e diteve");
	        int n = sc.nextInt();
	        int futureday = (n + calendar.get(Calendar.DAY_OF_WEEK) )%7;
			System.out.print(" and the future day is ");
			switch (futureday)
			{
				case 0: System.out.println("Sunday"); break;
				case 1: System.out.println("Monday"); break;
				case 2: System.out.println("Tuesday"); break;
				case 3: System.out.println("Wednesday"); break;
				case 4: System.out.println("Thursday"); break;
				case 5: System.out.println("Friday"); break;
				case 6: System.out.println("Saturday");
			}
		}
	
	 
	    }
	
