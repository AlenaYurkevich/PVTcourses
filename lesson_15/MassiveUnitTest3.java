package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MassiveUnitTest3 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIfArraysEqual() {
		Massive massive = new Massive();
		int[] array = { 5, 8, 9 };
		int[] arrayReverseOrder = massive.getArrayReverseOrder(array);
		assertArrayEquals("Not equal arrays", array, arrayReverseOrder); // will fail
	}

}
