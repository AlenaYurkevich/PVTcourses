package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.AfterMethod;

public class MassiveTest8 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This one will pass");
	}

	@AfterMethod
	public void afterMethod() {
	}

	@Test
	public void testMin() {
		Massive massive = new Massive();
		int[] arrayForMin = { 100, -2, 0 };
		assertFalse(0 == massive.getMin(arrayForMin));
	}

}
