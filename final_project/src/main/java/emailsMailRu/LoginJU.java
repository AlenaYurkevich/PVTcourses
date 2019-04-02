package emailsMailRu;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import emailsMailRu.DBData;
import emailsMailRu.LoginPage;
import emailsMailRu.TestDataPage;

public class LoginJU {
	private static final String URL = "https://www.mail.ru/";

	public TestDataPage loginJU(DBData db, WebDriver driver, TestDataPage testData, LoginPage loginPage) {
		db.fillTestDataWithDataFromDB();
		driver.get(URL);
		testData = db.getTestData();
		loginPage.enterData(testData.getLogin(), testData.getPassword());
		loginPage.clickEnterButton();
		new WebDriverWait(driver, 15).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(loginPage.isLogoutPresent(driver));
		return testData;
	}
}
