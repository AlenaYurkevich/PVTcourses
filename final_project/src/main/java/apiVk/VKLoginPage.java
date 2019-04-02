package apiVk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import emailsMailRu.DBData;
import emailsMailRu.TestDataPage;


public class VKLoginPage {

	@FindBy(xpath = ".//input[@id='index_email']")
	private WebElement loginField;

	@FindBy(xpath = ".//input[@id='index_pass']")
	private WebElement passwordField;

	@FindBy(xpath = ".//button[@id=\"index_login_button\"]")
	private WebElement loginButton;

	@FindBy(xpath = ".//div[@class='top_profile_name']")
	private WebElement logoutField;

	public VKLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public TestDataPage login(DBData db, WebDriver driver) {
		db.fillTestDataWithDataFromDB();
		TestDataPage testData = new TestDataPage();
		testData = db.getTestData();
		loginField.clear();
		loginField.sendKeys(testData.getTelNumber());
		passwordField.clear();
		passwordField.sendKeys(testData.getVkpassword());
		loginButton.click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(logoutField));
		return testData;
	}
}
