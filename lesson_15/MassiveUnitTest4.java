package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MassiveUnitTest4 {
	private Massive massive;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
		massive = new Massive();
		System.out.println("Before method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After method");
	}

	@Test
	public void testAmountNotNull() {
		assertNotNull(massive.getAmount());
	}

	@Test
	public void testDescrNotNull() {
		assertNotNull(massive.getDescr());
	}

	@Test
	@Ignore
	public void testDescrNull() {
		assertNull(massive.getDescr());
	}
}
