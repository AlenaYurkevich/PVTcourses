package core;

import static org.testng.Assert.assertNull;
import org.testng.annotations.Test;

public class MassiveTest15 {
	private Massive massive;

	@Test
	public void testArrayNull() {
		massive = new Massive();
		Integer[] arrayToChange = { 2, 4, 6, 8, 10 };
		assertNull(massive.getArrayWithInterchangedAdjItems(arrayToChange)); // will fail

	}
}
