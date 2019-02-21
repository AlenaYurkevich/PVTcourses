package core;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MassiveUnitTest2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Let's run the tests!");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Completed");
	}

	@Test(timeout = 1000)
	public void testMax() {
		Massive massive = new Massive();
		int[] arrayForMax = { 6, 33, 8 };
		assertEquals(33, massive.getMax(arrayForMax));
	}

	@Ignore
	@Test
	public void testFail() {
		fail("I want it to be ignored");
	}

}
