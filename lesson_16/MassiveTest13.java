package core;

import static org.testng.Assert.assertNotSame;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MassiveTest13 {

	@Test(timeOut = 500)
	public void testTimeout() throws InterruptedException {
		Thread.sleep(800);
		int a = 85;
		Massive massive = new Massive();
		assertNotSame(a, massive.getSecondPower(9));
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Will fail because of timeout");
	}

	@AfterMethod
	public void afterMethod() {
	}
}
