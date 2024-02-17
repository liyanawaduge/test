package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeSlot {

	public static void main(String[] args) throws ParseException {
		
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String dateStr = simpleDateFormat.format(new Date());
		Date date = simpleDateFormat.parse(dateStr);
		
		Date date1 = getDate(date, 10, 30);
		Date date2 = getDate(date, 11, 30);
		Date date3 = getDate(date, 10, 30);
		Date date4 = getDate(date, 11, 30);
		
		System.out.println(isOverlapping(date1,date2,date3,date4));

	}
	
	static Date getDate(Date date, int hourOfDay, int minute) {
	    Calendar working = Calendar.getInstance();
	    working.setTime(date);
	    working.set(Calendar.HOUR_OF_DAY, hourOfDay);
	    working.set(Calendar.MINUTE, minute);
	    working.set(Calendar.MILLISECOND, 0); 
	    return working.getTime();
	}
	
	public static boolean isOverlapping(Date start1, Date end1, Date start2, Date end2) {
	    return start1.before(end2) && start2.before(end1);
	}

}
