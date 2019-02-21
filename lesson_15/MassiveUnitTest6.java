package core;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class MassiveUnitTest6 {
	private Massive massive;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testProductOfArrayItems() {
		massive = new Massive();
		int[] arrayToMultiply = { 2, 3, 4 };
		assertThat(24, is(massive.getProductOfArrayItems(arrayToMultiply)));
	}

	@Test
	public void testProductOfAnotherArrayItems() {
		massive = new Massive();
		int[] array = { 5, 5, 2 };
		assertThat(49, is(not(massive.getProductOfArrayItems(array))));
	}

}
