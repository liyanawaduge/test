package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
        // Create a Date object
        Date date = new Date();

        // Create a SimpleDateFormat with the desired format
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");

        // Format the Date object
        String formattedTime = dateFormat.format(date);

        // Print the formatted time
        System.out.println("Formatted Time: " + formattedTime);
    }
}
