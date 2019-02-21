package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MassiveUnitTest1 {
	// testing the expected exception

	@Before
	public void setUp() throws Exception {
		System.out.println("Print it before the method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Print it after the method");
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testException() {
		Massive massive = new Massive();
		int[] arrayForException = { 4, 5, 6 };
		massive.getInexistentIndex(arrayForException);
	}

}
