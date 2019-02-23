package core;

import static org.testng.Assert.assertNotEquals;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class MassiveTest5 {
	private Massive massive;

	@BeforeGroups
	public void BeforeGroups() throws Exception {
	}

	@AfterGroups
	public void AfterGroups() throws Exception {
	}

	@Test
	public void testProductOfAnotherArrayItems() {
		massive = new Massive();
		int[] array = { 5, 5, 2 };
		assertNotEquals(50, massive.getProductOfArrayItems(array), "Product doesn't match"); // will fail
	}

}
