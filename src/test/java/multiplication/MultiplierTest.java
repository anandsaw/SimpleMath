package multiplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplierTest {

	@Test
	public void testMultiply() {
		Multiplier multi = new Multiplier();
		assertEquals(multi.multiply(3, 2), 6);
	}

	@Test
	public void testMultiplyByZero() {
		Multiplier multi = new Multiplier();
		assertEquals(multi.multiply(3, 0), 0);
	}

}
