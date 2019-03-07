package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListOfHotelsPage {

	@FindBy(xpath = "(.//a[@class =\"hotel_name_link url\"])[1]")
	private WebElement linkToFirstHotel;

	@FindBy(xpath = ".//a[@data-category=\"review_score_and_price\"]")
	private WebElement excellentRateAndPrice;

	public ListOfHotelsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isHotelLinkPresent(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(linkToFirstHotel));
		return linkToFirstHotel.isDisplayed();
	}

	public void clickExcellentRateAndPrice() {
		excellentRateAndPrice.click();
	}
}
