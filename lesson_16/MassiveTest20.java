package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.AfterClass;

public class MassiveTest20 {
	@Test
	public void testIfZPresent() {
		Massive massive = new Massive();
		String[] letters = { "a", "d", "e", "z" };
		assertFalse(massive.checkIfZPresent(letters));

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Check if a letter Z is present in the array");
	}

	@AfterClass
	public void afterClass() {
	}

}
