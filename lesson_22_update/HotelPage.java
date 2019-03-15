package junitcucumber;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelPage {

	@FindBy(xpath = "(.//div[@class=\"bui-review-score__badge\"])[1]")
	private WebElement hotelRate;

	@FindBy(xpath = "(.//a[@class=\"hotel_name_link url\"])[1]")
	private WebElement firstHotel;

	public HotelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void waitForAjax(WebDriver driver) {
		ExpectedCondition<Boolean> jQueryLoad = dr -> ((Long) ((JavascriptExecutor) driver)
				.executeScript("return jQuery.active") == 0);
		boolean jqueryReady = (Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
		if (!jqueryReady) {
			new WebDriverWait(driver, 5).until(jQueryLoad);
		}
	}

	public void clickFirstHotel(WebDriver driver) {
		waitForAjax(driver);
		firstHotel.click();
	}

	public int getHotelRate() {
		String rate = hotelRate.getText();
		char second = rate.charAt(1);
		if (second == ',') {
			String rateAsDouble = rate.replace(',', '.');
			double rating = Double.parseDouble(rateAsDouble);
			int hotelRating = (int) rating;
			return hotelRating;
		} else
			return Integer.parseInt(rate);

	}
}
