package core;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class MassiveUnitTest10 {

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After Class");
	}

	@Test
	public void testSecondPowerWithAssertThat() {
		Massive massive = new Massive();
		assertThat(64, is(massive.getSecondPower(8)));
	}

	@Test
	public void testSecondPowerWithAssertThatNot() {
		Massive massive = new Massive();
		assertThat(67, is(not(massive.getSecondPower(8))));
	}

}
