package emailsMailRu;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import emailsMailRu.ComposeEmailPage;
import emailsMailRu.TestDataPage;

public class ComposeEmail {

	public void composeEmail(ComposeEmailPage composeEmailPage, TestDataPage testData, WebDriver driver) {
		composeEmailPage.clickComposeEmailButton();
		composeEmailPage.enterAdressee(testData.getEmail());
		composeEmailPage.enterSubject(testData.getEmailSubject());
		composeEmailPage.enterEmailText(driver, testData.getEmailText());
		composeEmailPage.clickSendEmailButton();
	}
	
	public void isEmailSent(ComposeEmailPage composeEmailPage, WebDriver driver) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Письмо отправлено"));
		assertTrue(composeEmailPage.isEmailSentMessagePresent(driver));
	}

}
