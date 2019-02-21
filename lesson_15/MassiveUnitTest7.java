package core;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class MassiveUnitTest7 {
	private Massive massive;

	@Test
	public void testMin() {
		massive = new Massive();
		int[] arrayForMin = { 100, -2, 0 };
		assertThat(0, is(massive.getMin(arrayForMin))); // will fail
	}

}
