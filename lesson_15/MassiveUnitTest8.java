package core;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class MassiveUnitTest8 {
	private int actual;
	private int inputForMethod;
	private Massive massive;

	@Parameters
	public static Collection<Object[]> setOfParams() {
		return Arrays.asList(new Object[][] { { 16, 4 }, { 0, 0 }, { 4, -2 }, { 49, 7 } });
	}

	@Before
	public void setUp() {
		massive = new Massive();
	}

	@After
	public void tearDown() {
	}

	public MassiveUnitTest8(int actual, int inputForMethod) {
		this.actual = actual;
		this.inputForMethod = inputForMethod;
	}

	@Test
	public void testSecondPower() {

		assertEquals(actual, massive.getSecondPower(inputForMethod));
	}

}
