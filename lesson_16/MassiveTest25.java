package core;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MassiveTest25 {
	private Double actual;
	private Double inputForSalary;
	private Double inputForMonths;
	private Massive massive;

	@DataProvider(name = "DataProvider")
	public Iterator<Object[]> createSomeData() {
		return Arrays.asList(new Object[][] { 
			{ new ArrayList<Double>(Arrays.asList(30.0, 900.0, 30.0)) },
			{ new ArrayList<Double>(Arrays.asList(45.16129032258065, 1400.0, 31.0)) },
			{ new ArrayList<Double>(Arrays.asList(40.0, 1120.0, 28.0)) }, }).iterator();
	}

	@Test(dataProvider = "DataProvider")
	public void testSalary(ArrayList<Double> values) {
		massive = new Massive();
		actual = values.get(0);
		inputForSalary = values.get(1);
		inputForMonths = values.get(2);
		assertEquals(actual, massive.getSalaryPerDay(inputForSalary, inputForMonths));
	}

}

