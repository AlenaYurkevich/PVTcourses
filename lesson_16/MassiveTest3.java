package core;

import static org.testng.Assert.assertEqualsNoOrder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MassiveTest3 {

	@BeforeTest
	public void befTest() throws Exception {
		System.out.println("The test will pass because the order isn't taken into account");
	}

	@AfterTest
	public void aftTest() throws Exception {
	}

	@Test
	public void testIfArraysEqual() {
		Massive massive = new Massive();
		Integer[] array = { 5, 8, 9 };
		Integer[] arrayReverseOrder = massive.getArrayReverseOrder(array);
		assertEqualsNoOrder(array, arrayReverseOrder); // will pass because the order isn't taken into account
	}

}