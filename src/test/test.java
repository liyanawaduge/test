package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3);
	    String result = intList.stream()
	      .map(n -> String.valueOf(n))
	      .collect(Collectors.joining("-", "{", "}"));
	 
	    System.out.println(result);
	    
	    List<String> list = Arrays.asList("aa","bb","cc");
	    String result1 = list.stream()
	      .collect(Collectors.joining("_"));
	 
	    System.out.println(result1);

	}
	
	

}
