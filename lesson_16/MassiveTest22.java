package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.AfterMethod;

public class MassiveTest22 {
	private Massive massive;

	@Test
	public void testProductIfFalse() { 
		int[] arrayToMultiply = { 2, 4, 6 };
		assertFalse(11 == massive.getProductOfArrayItems(arrayToMultiply));
	}

	@BeforeMethod
	public void beforeMethod() {
		massive = new Massive();
	}

	@AfterMethod
	public void afterMethod() {
	}

}
