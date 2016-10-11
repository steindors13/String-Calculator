package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }


	@Test
    public void testMultipleNumbers1(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void testMultipleNumbers2(){
    	assertEquals(25, Calculator.add("1\n2,3,7\n8\n4"));
    }

}