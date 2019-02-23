package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEqualsNoOrder;
import org.testng.annotations.AfterClass;

public class MassiveTest14 {
	private Massive massive;

	@Test
	public void testArrayWithInterchangedAdjItems() {
		massive = new Massive();
		Integer[] arrayToChange = { 2, 4, 6, 8, 10 };
		assertEqualsNoOrder(arrayToChange, massive.getArrayWithInterchangedAdjItems(arrayToChange));

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Arrays will be treated equal");
	}

	@AfterClass
	public void afterClass() {
	}

}
