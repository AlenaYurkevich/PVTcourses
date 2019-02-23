package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertNull;

import org.testng.annotations.AfterTest;

public class MassiveTest17 {
	private Massive massive;

	@Test(enabled = false)
	public void testArrayNull() {
		massive = new Massive();
		Integer[] arrayToBeChanged = { 2, 4, 6, 8, 10 };
		assertNull(massive.getArrayWithInterchangedFirstLast(arrayToBeChanged));

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This test is ignored on purpose");
	}

	@AfterTest
	public void afterTest() {
	}

}
