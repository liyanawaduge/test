package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);

		String dateInString = "09-11-2023";
		Date date = formatter.parse(dateInString);
		System.out.println(date);
		
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		System.out.println(calender.getTime());
		
		System.out.println(getDateWithoutTimeUsingCalendar(new Date()));

	}
	
	public static Date getDateWithoutTimeUsingCalendar(Date d) {
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(d);
	    calendar.set(Calendar.HOUR_OF_DAY, 0);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.MILLISECOND, 0);

	    return calendar.getTime();
	}

}
