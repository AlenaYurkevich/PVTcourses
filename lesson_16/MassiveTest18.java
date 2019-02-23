package core;

import static org.testng.Assert.assertEqualsNoOrder;
import org.testng.annotations.Test;

public class MassiveTest18 {
	private Massive massive;

	@Test
	public void testOrderedFromMinToMax() {
		massive = new Massive();
		String[] text = { "ghhgh", "dd", "bbb", "hdbvfdsvfs" };
		assertEqualsNoOrder(text, massive.getOrderedFromMinToMax(text));

	}
}
