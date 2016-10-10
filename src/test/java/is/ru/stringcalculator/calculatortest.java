package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatortest{

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
}