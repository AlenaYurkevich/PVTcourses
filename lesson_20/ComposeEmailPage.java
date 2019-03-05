package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComposeEmailPage {

	@FindBy(xpath = "(.//a[@data-name=\"compose\"])[1]")
	private WebElement composeEmailButton;

	@FindBy(xpath = "(.//textarea[@class=\"js-input compose__labels__input\"])[1]")
	private WebElement adresseeField;

	@FindBy(xpath = ".//div[@class=\"compose__editor\"]")
	private WebElement composeEditor;

	@FindBy(xpath = ".//input[@name=\"Subject\"]")
	private WebElement subjectField;

	@FindBy(xpath = ".//body[@id=\"tinymce\"]")
	private WebElement textAreaOfIframe;

	@FindBy(xpath = "(.//div[@data-name=\"send\"])[1]")
	private WebElement sendEmailButton;

	@FindBy(xpath = ".//div[@class=\"message-sent__title\"]")
	private WebElement messageEmailSent;

	public ComposeEmailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickComposeEmailButton() {
		composeEmailButton.click();
	}

	public void enterAdressee(String adressee) {
		adresseeField.sendKeys(adressee);
		composeEditor.click();
	}

	public void enterSubject(String subject) {
		subjectField.sendKeys(subject);
	}

	public void enterEmailText(WebDriver driver, String text) {
		WebElement iframe = driver.findElement(By.xpath(".//iframe[@title=\"{#aria.rich_text_area}\"]"));
		driver.switchTo().frame(iframe);
		textAreaOfIframe.click();
		textAreaOfIframe.clear();
		textAreaOfIframe.sendKeys(text);
		driver.switchTo().defaultContent();
	}

	public void clickSendEmailButton() {
		sendEmailButton.click();
	}

	public boolean isEmailSentMessagePresent(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(composeEmailButton));
		return messageEmailSent.isDisplayed();
	}

}
