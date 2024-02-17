package test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class TimeOverlap {

	public static void main(String[] args) {
		
		List<TimeSlotTest> timeSlotTestList = new ArrayList<>();
		
		TimeSlotTest timeSlotTest1 = new TimeSlotTest();
		timeSlotTest1.setStartTime("07.00");
		timeSlotTest1.setStartTime("08.00");
		timeSlotTestList.add(timeSlotTest1);
		
		TimeSlotTest timeSlotTest2 = new TimeSlotTest();
		timeSlotTest2.setStartTime("08.00");
		timeSlotTest2.setStartTime("09.00");
		timeSlotTestList.add(timeSlotTest2);
		
		TimeSlotTest timeSlotTest3 = new TimeSlotTest();
		timeSlotTest3.setStartTime("07.00");
		timeSlotTest3.setStartTime("07.50");
		timeSlotTestList.add(timeSlotTest3);
		
		timeSlotTestList.forEach(null);
		
		LocalTime startA = LocalTime.of( 07 , 00 );
		LocalTime stopA = LocalTime.of( 10 , 30 );

		LocalTime startB = LocalTime.of( 06 , 00 );
		LocalTime stopB = LocalTime.of( 07 , 01 );
		
		Boolean overlaps = ( 
			    ( startA.isBefore( stopB ) ) 
			    && 
			    ( stopA.isAfter( startB ) ) 
			) ;
		System.out.println(overlaps);
	}

}

class TimeSlotTest {
	
	private String startTime;
	private String endTime;
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
