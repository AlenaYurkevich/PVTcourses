package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MassiveUnitTest5 {

	@Before
	public void setUp() throws Exception {
		System.out.println("Test starts");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test ends");
	}

	@Test
	public void testDescrNotSame() {
		Massive massive = new Massive(); // option where objects are created inside methods
		assertNotSame("something", massive.getDescr());
	}

	@Test
	@Ignore
	public void testDescrSame() {
		Massive massive = new Massive();
		assertSame("something", massive.getDescr());
	}

	@Test
	public void testAmountSame() {
		Massive massive = new Massive();
		assertSame("There are some array methods below", massive.getDescr());
	}

}
