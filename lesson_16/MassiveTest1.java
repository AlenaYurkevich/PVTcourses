package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MassiveTest1 {
	// testing the expected exception

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestNG. Print it before the method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestNG. Print it after the method");
	}

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void testException() {
		Massive massive = new Massive();
		int[] arrayForException = { 4, 5, 6 };
		massive.getInexistentIndex(arrayForException);
	}

}
