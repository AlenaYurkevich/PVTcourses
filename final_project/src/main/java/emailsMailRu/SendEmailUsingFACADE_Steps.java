package emailsMailRu;

import emailsMailRu.Facade;
import org.apache.log4j.Logger;
import cucumber.api.java.en.When;

public class SendEmailUsingFACADE_Steps {
	private static final Logger LOGGER = Logger.getLogger(SendEmailUsingFACADE_Steps.class);
	private Facade facade;

	@When("^I enter addressees, subject, text and click Send$")
	public void sendEmailToSeveralAdressees() {
		facade = new Facade();
		facade.sendEmail();
		LOGGER.info("The email has been sent");
	}

}
