package actions;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ComposeEmailPage;
import pages.TestDataPage;

public class ComposeEmail {

	@Test
	public void composeEmail(ComposeEmailPage composeEmailPage, TestDataPage testData, WebDriver driver) {
		composeEmailPage.clickComposeEmailButton();
		composeEmailPage.enterAdressee(testData.getEmail());
		composeEmailPage.enterSubject(testData.getEmailSubject());
		composeEmailPage.enterEmailText(driver, testData.getEmailText());
		composeEmailPage.clickSendEmailButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Письмо отправлено"));
		assertTrue(composeEmailPage.isEmailSentMessagePresent(driver));
	}

}
