package test;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

public class Split {
  public static void main(String[] args) {
	  LocalDate localDate = LocalDate.now();
	
	Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());



	
	System.out.println(date);

	

	
  }
} 