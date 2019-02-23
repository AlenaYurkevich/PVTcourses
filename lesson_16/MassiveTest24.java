package core;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class MassiveTest24 {
	@Test
	public void testArrayAssertTrue() {
		Massive massive = new Massive();
		int[] arrayForMin = { 2, 4, 6, 8, 10 };
		assertTrue(2 == massive.getMin(arrayForMin));
	}
}
