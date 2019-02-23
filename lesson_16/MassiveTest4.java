package core;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class MassiveTest4 {
	private Massive massive;

	@BeforeGroups
	public static void beforeGroups() throws Exception {
	}

	@AfterGroups
	public static void afterGroups() throws Exception {
	}

	@Test
	public void testProductOfArrayItems() {
		massive = new Massive();
		int[] arrayToMultiply = { 2, 3, 4 };
		assertEquals(24, massive.getProductOfArrayItems(arrayToMultiply));
	}
}
