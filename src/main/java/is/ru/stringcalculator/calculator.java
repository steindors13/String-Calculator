package is.ru.stringcalculator;

import java.util.ArrayList;

public class Calculator {


	public static int add(String text) {
		if(text.equals("")){
			return 0;
		}
    	int total = 0;
    	String[] numbersArray = text.split(",|\\n");
    	ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();
    	for(String number : numbersArray) {
    		int n = toInt(number);
            	if(n < 0) {
                	negativeNumbers.add(n);
            	}
            total += n;
        	}
    	if(negativeNumbers.size() > 0) {
        	throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
    	}
    	return total;   

	}
	public static int toInt(String number){
		return Integer.parseInt(number);
		}

     
}
