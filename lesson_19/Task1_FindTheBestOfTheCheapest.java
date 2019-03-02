package core;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_FindTheBestOfTheCheapest {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void FindTheBestHotelOfTheCheapest() throws InterruptedException {
		// find hotels in Paris, current date + 3 days, for 7 nights, for 2 adults
		driver.get("https://www.booking.com/index.ru.html?lang=ru");
		WebElement searchFieldDestination = driver
				.findElement(By.xpath(".//input[@data-component=\"search/destination/input-placeholder\"]"));
		searchFieldDestination.clear();
		searchFieldDestination.sendKeys("Париж");
		Thread.sleep(2000);

		WebElement checkInDateSpan = driver.findElement(By.xpath(
				"(.//span[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"])[1]"));
		checkInDateSpan.click();
		WebElement selectedCheckInDate = driver.findElement(By.xpath(".//td[@data-date=\"2019-03-03\"]"));
		selectedCheckInDate.click();
		WebElement selectedCheckOutDate = driver.findElement(By.xpath(".//td[@data-date=\"2019-03-10\"]"));
		selectedCheckOutDate.click();

		WebElement searchButton = driver.findElement(By.xpath(".//button[@class=\"sb-searchbox__button  \"]"));
		searchButton.submit();
		Thread.sleep(2000);

		// check the checkbox "from 0 to 120 BYN"
		WebElement lowestPriceCheckbox = driver.findElement(By.xpath(".//a[@data-id=\"pri-1\"]"));
		lowestPriceCheckbox.click();

		// verify that there are such hotels
		WebElement linkToHotel = driver.findElement(By.xpath("(.//a[@class =\"hotel_name_link url\"])[1]"));
		assertTrue(linkToHotel.isDisplayed());
		Thread.sleep(1000);

		// check the checkbox "Rate 9+"
		WebElement ninePlusRateCheckbox = driver.findElement(By.xpath(".//a[@data-id=\"review_score-90\"]"));
		ninePlusRateCheckbox.click();
		Thread.sleep(2000);

		// get the price and compare with maxPossiblePriceFor7nights
		WebElement price = driver.findElement(
				By.xpath("//*[@id=\"hotellist_inner\"]/div[3]/div[2]/div[2]/div/table/tbody/tr/td[2]/div/strong/b"));
		Thread.sleep(2000);
		String priceWithCurrency = price.getText();
		String priceWithoutCurrency = priceWithCurrency.substring(4);
		int priceInt = Integer.parseInt(priceWithoutCurrency);
		int maxPossiblePriceFor7nights = 120 * 7;
		assertTrue(maxPossiblePriceFor7nights >= priceInt);

	}

}
