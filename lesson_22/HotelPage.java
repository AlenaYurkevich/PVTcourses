package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage {
	WebDriver driver = new ChromeDriver();

	@FindBy(xpath = "(.//div[@class=\"bui-review-score__badge\"])[1]")
	private WebElement hotelRate;

	@FindBy(xpath = "(.//a[@class=\"hotel_name_link url\"])[1]")
	private WebElement firstHotel;

	public HotelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickFirstHotel() throws InterruptedException {
		Thread.sleep(3000);
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
