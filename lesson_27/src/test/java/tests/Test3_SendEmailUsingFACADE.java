package tests;

import actions.Facade;
import org.junit.Test;

public class Test3_SendEmailUsingFACADE {

	private Facade facade;

	@Test
	public void sendEmailToSeveralAdressees() {
		facade = new Facade();
		facade.sendEmail();
	}

}
