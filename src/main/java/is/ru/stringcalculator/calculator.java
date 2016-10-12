package is.ru.stringcalculator;

import java.util.ArrayList;

public class Calculator {


	public static int add(String text) {
		if(text.equals("")){
			return 0;
		}
		else if(text.startsWith("//")){
			String delimiter = ",|\n";
			int delimiterIndex = text.indexOf("//") + 2; 
			delimiter = delimiter + "|" + text.substring(delimiterIndex, delimiterIndex + 1); 
			text = text.substring(delimiterIndex + 2); 
			
		}
    	int total = 0;
    	String[] numbersArray = text.split(",|\\n|//|;|[a-zA-Z]+");
    	ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();
    	for(String number : numbersArray) {
    		int n = toInt(number);
            	if(n < 0) {
                	negativeNumbers.add(n);
            	}
            	if(n <= 1000) {
            		total += n;
            	}
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
