package emailsMailRu;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import emailsMailRu.LoginJU;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.WebdriverSingleton;
import emailsMailRu.DBData;
import emailsMailRu.EmailsListPage;
import emailsMailRu.LoginPage;
import emailsMailRu.TestDataPage;
import screenshotMaker.Screenshot;

public class MarkWithFlagsAndRemoveThem_Steps {
	private static final Logger LOGGER = Logger.getLogger(MarkWithFlagsAndRemoveThem_Steps.class);
	private WebDriver driver = WebdriverSingleton.getDriver();
	private LoginPage loginPage;
	private EmailsListPage pageWithEmails;
	private DBData db;
	private TestDataPage testData;
	private LoginJU loginJU;

	@When("^I log into mail.ru$")
	public void login() {
		loginPage = new LoginPage(driver);
		pageWithEmails = new EmailsListPage(driver);
		db = new DBData(new TestDataPage());
		loginJU = new LoginJU();
		loginJU.loginJU(db, driver, testData, loginPage);
		LOGGER.info("We have successfully logged in");
	}

	@When("^I mark three emails with flags$")
	public void markWithFlags() {
		for (int i = 1; i <= 3; i++) {
			pageWithEmails.markFlags(driver, i);
		}
	}

	@Then("^the emails are flagged$")
	public void checkIfEmailsFlagged() {
		for (int i = 1; i <= 3; i++) {
			assertTrue(pageWithEmails.isRemoveFlagHoverDisplayed(driver, i));
		}
		LOGGER.info("We have marked emails with flags");
	}

	@When("^I remove flags$")
	public void removeFlags() {
		pageWithEmails.selectFlagged(driver);
		pageWithEmails.removeFlags(driver);
	}
	
	@When("^I make one screenshot$")
	public void makeScreenshot() throws IOException {
		Screenshot.makeScreenShot(driver);
		LOGGER.info("Screenshot has been taken");
	}

	@Then("^the emails are not flagged$")
	public void checkIfEmailsUnflagged() {
		for (int i = 1; i <= 3; i++) {
			assertTrue(pageWithEmails.isNoFlagHoverDisplayed(driver, i));
		}
		LOGGER.info("We have removed flags from emails");
		WebdriverSingleton.closeWebBrowser();
	}
}
