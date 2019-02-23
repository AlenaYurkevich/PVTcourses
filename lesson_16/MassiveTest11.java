package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertSame;

import org.testng.annotations.AfterClass;

public class MassiveTest11 {
	
	@Test(timeOut=2000)
	public void testSecondPowerWithAssertSame() {
		int a = 65;
		Massive massive = new Massive();
		assertSame(a, massive.getSecondPower(8));
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("YOU SHALL NOT PASS!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Told ya");
	}

}
