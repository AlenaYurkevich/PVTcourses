package core;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MassiveTest2 {

	@BeforeClass
	public void beforeClass() throws Exception {
		System.out.println("Let's run the tests!");
	}

	@AfterClass
	public void afterClass() throws Exception {
		System.out.println("Completed");
	}

	@Test(timeOut = 1000)
	public void testMax() {
		Massive massive = new Massive();
		int[] arrayForMax = { 6, 33, 8 };
		assertEquals(33, massive.getMax(arrayForMax));
	}

	@Test(enabled = false)
	public void testFail() {
		fail("I want it to be ignored");
	}

}
