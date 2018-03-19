package division;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DividerTest {
	
	@Test
	public void testDivide() {
		Divider divider = new Divider();
		assertEquals(divider.divide(4, 2), 2.0);
	}
}
