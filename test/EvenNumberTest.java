import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvenNumberTest {

	
	@Test
	public void test() {
		
		EvenNumbers x = new EvenNumbers();
		boolean actualOutput = x.isEven(2);
		assertEquals(true, actualOutput);
		
	}

}
