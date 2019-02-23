package core;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MassiveTest9 {
	private Integer actual;
	private Integer inputForMethod;
	private Massive massive;

	@DataProvider(name = "DataProvider")
	public Iterator<Object[]> createSomeData() {
		return Arrays.asList(new Object[][] { { new ArrayList<Integer>(Arrays.asList(16, 4)) },
				{ new ArrayList<Integer>(Arrays.asList(0, 0)) }, { new ArrayList<Integer>(Arrays.asList(4, -2)) },
				{ new ArrayList<Integer>(Arrays.asList(49, 7)) }, }).iterator();
	}

	@Test(dataProvider = "DataProvider")
	public void testSecondPower(ArrayList<Integer> values) {
		massive = new Massive();
		actual = values.get(0);
		inputForMethod = values.get(1);
		assertEquals(actual, massive.getSecondPower(inputForMethod));
	}

}
