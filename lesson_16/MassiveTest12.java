package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertSame;
import org.testng.annotations.AfterMethod;

public class MassiveTest12 {
	@Test(timeOut = 2000)
	public void testSecondPowerWithAssertSame() {
		int a = 81;
		Massive massive = new Massive();
		assertSame(a, massive.getSecondPower(9));
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("will pass");
	}

	@AfterMethod
	public void afterMethod() {
	}

}
