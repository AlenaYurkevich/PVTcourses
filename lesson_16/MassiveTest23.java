package core;

import static org.testng.Assert.assertNotNull;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MassiveTest23 {
	private Massive massive;

	@Test
	public void testArrayNotNull() {
		massive = new Massive();
		int[] arrayForMin = { 2, 4, 6, 8, 10 };
		assertNotNull(massive.getMin(arrayForMin));
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Passed successfully");
	}
}
