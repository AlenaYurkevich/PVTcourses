package core;

import static org.testng.Assert.assertNotNull;
import org.testng.annotations.Test;

public class MassiveTest21 {
	@Test
	public void testProductIfNull() {
		Massive massive = new Massive();
		int[] arrayToMultiply = { 2, 4, 6 };
		assertNotNull(massive.getProductOfArrayItems(arrayToMultiply));
	}
}
