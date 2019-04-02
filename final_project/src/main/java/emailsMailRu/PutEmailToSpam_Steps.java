package emailsMailRu;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import emailsMailRu.LoginJU;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.WebdriverSingleton;
import emailsMailRu.DBData;
import emailsMailRu.EmailsListPage;
import emailsMailRu.LoginPage;
import emailsMailRu.TestDataPage;
import screenshotMaker.Screenshot;

public class PutEmailToSpam_Steps {
	private static final Logger LOGGER = Logger.getLogger(PutEmailToSpam_Steps.class);
	private WebDriver driver = WebdriverSingleton.getDriver();
	private LoginPage loginPage;
	private EmailsListPage pageWithEmails;
	private DBData db;
	private TestDataPage testData;
	private LoginJU loginJU;

	@When("^I log in the account$")
	public void login() {
		loginPage = new LoginPage(driver);
		pageWithEmails = new EmailsListPage(driver);
		db = new DBData(new TestDataPage());
		loginJU = new LoginJU();
		loginJU.loginJU(db, driver, testData, loginPage);
		LOGGER.info("We have successfully logged in");
	}

	@When("^I check the first email checkbox and click the Spam button$")
	public void putEmailToSpam() {
		pageWithEmails.checkFirstEmailCheckbox();
		pageWithEmails.clickSpamButton();
	}
	
	@When("^I make the screenshot$")
	public void makeScreenshot() throws IOException {
		Screenshot.makeScreenShot(driver);
		LOGGER.info("Screenshot has been taken");
	}

	@Then("^Notification about successful moving to Spam is displayed$")
	public void isNotificationDisplayed() {
		assertTrue(pageWithEmails.isNotificationPresent(driver));
		LOGGER.info("We have moved an email to Spam");
		WebdriverSingleton.closeWebBrowser();
	}
}