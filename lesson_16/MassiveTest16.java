package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertNotNull;
import org.testng.annotations.AfterTest;

public class MassiveTest16 {
	private Massive massive;

	@Test
	public void testArrayNotNull() {
		massive = new Massive();
		Integer[] arrayToBeChanged = { 2, 4, 6, 8, 10 };
		assertNotNull(massive.getArrayWithInterchangedFirstLast(arrayToBeChanged)); 

	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Passed successfully");
	}

}
