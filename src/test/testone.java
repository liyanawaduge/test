package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class testone {

	public static void main(String[] args) {
		
		BigDecimal pp = new BigDecimal(7.657);
		BigDecimal ppp = pp.setScale(2, RoundingMode.UP);
	    System.out.println(ppp);
		
		double val = 217.65;
		double percentage = 21.0;
		
		BigDecimal bval = BigDecimal.valueOf(val);
		BigDecimal bpercentage = BigDecimal.valueOf(percentage);
		BigDecimal divicer = new BigDecimal(100);
		
		BigDecimal p1 = (bval.multiply(bpercentage.divide(divicer)));
		BigDecimal p2 = p1.setScale(2);
		System.out.println(p2.doubleValue());
		System.out.println(bval.subtract(p2).doubleValue());

	}

}
