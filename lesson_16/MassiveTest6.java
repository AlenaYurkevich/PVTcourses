package core;

import static org.testng.Assert.assertNotEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MassiveTest6 {
	private Massive massive;

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This case will pass");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Yay!");
	}

	@Test
	public void testProductOfAnotherArrayItems() {
		massive = new Massive();
		int[] array = { 5, 5, 2 };
		assertNotEquals(51, massive.getProductOfArrayItems(array)); // will pass
	}

}