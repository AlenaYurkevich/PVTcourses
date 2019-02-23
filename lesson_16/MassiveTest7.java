package core;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MassiveTest7 {
	private Massive massive;

	@Test
	public void testMin() {
		massive = new Massive();
		int[] arrayForMin = { 100, -2, 0 };
		assertTrue(0 == massive.getMin(arrayForMin)); // will fail
	}

}
