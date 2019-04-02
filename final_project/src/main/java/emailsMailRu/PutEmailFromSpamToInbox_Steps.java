package emailsMailRu;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emailsMailRu.LoginJU;
import driver.WebdriverSingleton;
import emailsMailRu.DBData;
import emailsMailRu.EmailsListPage;
import emailsMailRu.LoginPage;
import emailsMailRu.TestDataPage;
import screenshotMaker.Screenshot;

public class PutEmailFromSpamToInbox_Steps {
	private static final Logger LOGGER = Logger.getLogger(PutEmailFromSpamToInbox_Steps.class);
	private WebDriver driver = WebdriverSingleton.getDriver();
	private LoginPage loginPage;
	private EmailsListPage pageWithEmails;
	private DBData db;
	private TestDataPage testData;
	private LoginJU loginJU;

	@When("^I log in my email$")
	public void login() {
		loginPage = new LoginPage(driver);
		pageWithEmails = new EmailsListPage(driver);
		db = new DBData(new TestDataPage());
		loginJU = new LoginJU();
		loginJU.loginJU(db, driver, testData, loginPage);
		LOGGER.info("We have successfully logged in");
	}

	@When("^I go to Spam$")
	public void goToSpam() {
		pageWithEmails.clickSpamLink();
		assertTrue(pageWithEmails.isNotSpamButtonPresent(driver));
		LOGGER.info("Spam section is opened");
	}

	@When("^I return an email back to Inbox$")
	public void returnEmailToInbox() {
		pageWithEmails.checkFirstSpamEmailCheckbox();
		pageWithEmails.clickNotSpamButton();
	}
	
	@When("^I make another screenshot$")
	public void makeScreenshot() throws IOException {
		Screenshot.makeScreenShot(driver);
		LOGGER.info("Screenshot has been taken");
	}

	@Then("^Notification about successful moving to Inbox is displayed$")
	public void isNotificationPresent() {
		assertTrue(pageWithEmails.isNotificationPresent(driver));
		LOGGER.info("We have returned an email to Inbox");
		WebdriverSingleton.closeWebBrowser();
	}

}
