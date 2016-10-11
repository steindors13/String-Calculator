package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){

		if(text.contains(",") || text.contains("\\n")) {

			String[] number = text.split(",|\\n");
			return sum(number);
		}
		else
			return 0;
		
	}


	private static int toInt(String number){
		return Integer.parseInt(number);
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }



}