package core;

import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2and3_FindTheCheapestOfTheMostExpensive {
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
	public void findTheCheapestOfTheMostExpensive() throws InterruptedException {
		// find hotels in Paris, current date + 3 days, for 7 nights
		driver.get("https://www.booking.com/index.ru.html?lang=ru");
		WebElement searchFieldDestination = driver
				.findElement(By.xpath(".//input[@data-component=\"search/destination/input-placeholder\"]"));
		searchFieldDestination.clear();
		searchFieldDestination.sendKeys("Париж");
		Thread.sleep(2000);

		WebElement checkInDateSpan = driver.findElement(By.xpath(
				"(.//span[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"])[1]"));
		checkInDateSpan.click();
		WebElement selectedCheckInDate = driver.findElement(By.xpath(".//td[@data-date=\"2019-03-04\"]"));
		selectedCheckInDate.click();
		WebElement selectedCheckOutDate = driver.findElement(By.xpath(".//td[@data-date=\"2019-03-11\"]"));
		selectedCheckOutDate.click();

		// for 4 adults, in 2 rooms
		WebElement guestsToggle = driver.findElement(By.xpath(".//label[@id=\"xp__guests__toggle\"]"));
		guestsToggle.click();
		WebElement addAdultButton = driver.findElement(By.xpath(
				"//div[@class=\"sb-group__field sb-group__field-adults\"]/descendant::button[@class=\"bui-button bui-button--secondary bui-stepper__add-button\"]"));
		addAdultButton.click();
		addAdultButton.click();
		Thread.sleep(1000);
		WebElement addRoomButton = driver.findElement(By.xpath(
				"//div[@class=\"sb-group__field sb-group__field-rooms\"]/descendant::button[@class=\"bui-button bui-button--secondary bui-stepper__add-button\"]"));
		addRoomButton.click();
		Thread.sleep(1000);

		WebElement searchButton = driver.findElement(By.xpath(".//button[@class=\"sb-searchbox__button  \"]"));
		searchButton.submit();
		Thread.sleep(2000);

		// check the checkbox "970 BYN +"
		WebElement highestPriceCheckbox = driver.findElement(By.xpath(".//a[@data-id=\"pri-5\"]"));
		highestPriceCheckbox.click();
		Thread.sleep(2000);

		// sort by the lowest price among the highest ones
		WebElement lowestPriceFirstTab = driver.findElement(By.xpath(".//li[@class=\" sort_category   sort_price \"]"));
		lowestPriceFirstTab.click();
		Thread.sleep(2000);

		// get the price and verify it's not lower than 970 BYN a night
		WebElement price = driver
				.findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[2]/div/div[2]/div"));
		Thread.sleep(2000);
		String priceWithCurrency = price.getText();
		String priceWithoutCurrencyPart = (priceWithCurrency.substring(35, 36)).trim();
		String priceWithoutCurrencyPart2 = priceWithCurrency.substring(37, 40);
		String priceWithoutCurrency = priceWithoutCurrencyPart + priceWithoutCurrencyPart2;
		int priceInt = Integer.parseInt(priceWithoutCurrency);
		int minPossiblePriceFor7nights = 970 * 7;
		assertTrue(minPossiblePriceFor7nights <= priceInt);

		// click "Book"
		WebElement primaryBookingButton = driver
				.findElement(By.xpath("(.//a[@class=\"b-button b-button_primary sr_cta_button\"])[1]"));
		primaryBookingButton.click();
		Thread.sleep(2000);

		// switch to another tab
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}

		// click "Book"
		WebElement bookingButton = driver.findElement(By.xpath("(.//button[@id=\"hp_book_now_button\"])[1]"));
		bookingButton.click();
		Thread.sleep(2000);

		// select a room and click "I book"
		WebElement bookingDropdown = driver
				.findElement(By.xpath("(.//select[@data-component=\"hotel/new-rooms-table/select-rooms\"])[1]"));
		Select select = new Select(bookingDropdown);
		select.selectByIndex(1);
		Thread.sleep(2000);
		WebElement ibookButton = driver
				.findElement(By.xpath(".//div[@data-component=\"hotel/new-rooms-table/reservation-cta\"]"));
		ibookButton.click();
		Thread.sleep(2000);

		// switch to another tab
		Set<String> moreWindows = driver.getWindowHandles();
		for (String winHandle : moreWindows) {
			driver.switchTo().window(winHandle);
		}

		// fill in guest personal details
		WebElement titleDropdown = driver.findElement(By.xpath(".//select[@id=\"booker_title\"]"));
		Select selectTitle = new Select(titleDropdown);
		selectTitle.selectByIndex(2);

		WebElement firstname = driver.findElement(By.xpath(".//input[@name=\"firstname\"]"));
		firstname.sendKeys("Alena");
		Thread.sleep(1000);

		WebElement lastname = driver.findElement(By.xpath(".//input[@name=\"lastname\"]"));
		lastname.sendKeys("Yurkevich");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.xpath(".//input[@name=\"email\"]"));
		email.sendKeys("alena.n.yurkevich@mail.ru");
		Thread.sleep(1000);

		WebElement emailConfirm = driver.findElement(By.xpath(".//input[@name=\"email_confirm\"]"));
		emailConfirm.sendKeys("alena.n.yurkevich@mail.ru");
		Thread.sleep(1000);

		WebElement iStayRadiobutton = driver.findElement(By.xpath(".//input[@id=\"notstayer_false\"]"));
		iStayRadiobutton.click();
		Thread.sleep(1000);

		WebElement book = driver.findElement(By.xpath(".//button[@name=\"book\"]"));
		book.click();
		Thread.sleep(2000);

		// switch to another tab
		Set<String> evenmoreWindows = driver.getWindowHandles();
		for (String winHandle : evenmoreWindows) {
			driver.switchTo().window(winHandle);
		}

		// fill in address and phone
		WebElement address = driver.findElement(By.xpath(".//input[@name=\"address1\"]"));
		address.sendKeys("Test 1, 1");
		Thread.sleep(1000);

		WebElement city = driver.findElement(By.xpath(".//input[@name=\"city\"]"));
		city.sendKeys("Minsk");
		Thread.sleep(1000);

		WebElement phone = driver.findElement(By.xpath(".//input[@name=\"phone\"]"));
		phone.sendKeys("295868539");
		Thread.sleep(1000);

		// fill in credit card details
		WebElement cardTypeDropdown = driver.findElement(By.xpath(".//select[@name=\"cc_type\"]"));
		Select selectCardType = new Select(cardTypeDropdown);
		selectCardType.selectByIndex(2);
		Thread.sleep(1000);

		WebElement cardNumber = driver.findElement(By.xpath(".//input[@name=\"cc_number\"]"));
		cardNumber.sendKeys("5242424242424242");
		Thread.sleep(1000);

		WebElement cardDetailsArea = driver.findElement(By.xpath(".//fieldset[@id=\"book_credit_card\"]"));
		cardDetailsArea.click();
		Thread.sleep(1000);

		WebElement incorrectCardNumberMessage = driver.findElement(By.xpath(
				".//div[@class=\"pay-form--field bp_form__field bp_form__field--cc_number bp_form__field--error\"]/descendant::p[@class=\"bp_form__field__msg\"]"));
		assertTrue(incorrectCardNumberMessage.isDisplayed());
		Thread.sleep(1000);

	}

}
