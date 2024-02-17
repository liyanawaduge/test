package test;

import java.util.Date;

public class AgeCalculatorExample1 {
	public static void main(String args[]) {
		Date dob = new Date(487909432000l);
		System.out.println(getAge(dob));
	}
	
	public static int getAge(Date dob) {
		Date now = new Date();
		if (dob != null && (now.getTime() > dob.getTime())) {
			long timeBetween = now.getTime() - dob.getTime();
			double yearsBetween = timeBetween / 3.15576e+10;
			return (int) Math.floor(yearsBetween);
		}
		return 0;
	}
}