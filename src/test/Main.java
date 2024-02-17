package test;

import java.text.DecimalFormat;

public class Main {
	/*
	 * public static void main(String[] args) { String aa = "fsdfgsdgsg ghhsdh"
	 * +System.lineSeparator()+ "" + "czxczxczxczxczc" +System.lineSeparator()+ "" +
	 * "fsdfsdfsdfsdfgsfsdfsf"; System.out.println(aa); }
	 */
	
	public static void main(String[] args) {
		String num = "123.5";
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedNumber = df.format(Double.parseDouble(num));
        System.out.println(formattedNumber);
    }

}
