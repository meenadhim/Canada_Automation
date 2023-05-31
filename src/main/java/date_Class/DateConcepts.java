package date_Class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import org.joda.time.LocalDate;

public class DateConcepts {

	public static void main(String[] args) {
		
		//we will have to create new Date Object representing the current date and time
		
		Date currentDate = new Date();
		System.out.println("The current date is :  "   + currentDate);
		
		
		//how to get the epoch time?    January 1, 1970  00:00:00 GMT
		long inMiliSeconds = currentDate.getTime();
		System.out.println("Mili Seconds since epoch time  is :  "  +  inMiliSeconds);
		System.out.println("Seconds since epoch time is : " + (inMiliSeconds/1000));
		
		//how to get the year, month, day, hour - components of date
		
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();
		int month = localDate.getMonthOfYear();
		int day = localDate.getDayOfMonth();
		System.out.println("Year is :  " + year  + "------->" + " Month is :  "   +  month +  " Day is : " + day);
		
		//how to create a local time Object representing the current time
		
		LocalTime localtime  = LocalTime.now();
		int hour = localtime.getHour();
		int minute = localtime.getMinute();
		int second = localtime.getSecond();
		System.out.println("Hour is :  " + hour  + "------->" + " Minute is :  "   +  minute +  " Second is : " + second);
		
		//Past Date
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date myDate = new Date(System.currentTimeMillis());
		Date oneDayBefore = new Date(myDate.getTime() - 8600000);
		String dateStr =dateFormat.format(oneDayBefore);
		System.out.println("past date result is : " + dateStr);
		
		//How to covert date Object into String
		Date date1 = new Date();
		System.out.println(date1);
		String actualDate = date1.toString().replace(" ", "_").replace(":" , "_");
		System.out.println(actualDate);
		
	

	}

}
