package apiVk;

import apiVk.VKLoginPage;
import apiVk.VKUserPage;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import adapterJSONtoXMLforVK.JSONObject;
import adapterJSONtoXMLforVK.JSONResponse;
import adapterJSONtoXMLforVK.XMLResponse;
import adapterJSONtoXMLforVK.XMLResponseAdapter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.WebdriverSingleton;
import emailsMailRu.DBData;
import emailsMailRu.TestDataPage;
import screenshotMaker.Screenshot;

public class VKWallPostEditCommentDelete_Steps {
	private static final Logger LOGGER = Logger.getLogger(VKWallPostEditCommentDelete_Steps.class);
	private VKLoginPage vKloginPage;
	private VKUserPage vKUserPage;
	private HttpClient client;
	private WebDriver driver = WebdriverSingleton.getDriver();
	private URIBuilder builder;
	private HttpGet request;
	private DBData db;
	private HttpResponse response;
	private static String postText = "Lena's text";
	private static String editedPostText = "Lena's EDITED text";
	private static String postId;
	private static String responseCode;
	private static String forAdapter;

	public String getForAdapter() {
		return forAdapter;
	}

	@Given("^I'm on Denis' vk test page$")
	public void goToVKPage() {
		client = HttpClientBuilder.create().build();
		db = new DBData(new TestDataPage());
		vKloginPage = new VKLoginPage(driver);
		vKUserPage = new VKUserPage(driver);
		driver.get("https://vk.com/");
		vKloginPage.login(db, driver);
		driver.navigate().to("https://vk.com/id536083852");
		LOGGER.info("Denis' VK page is opened");

	}

	@When("^I post message on the wall$")
	public void postOnTheWall() throws ClientProtocolException, IOException, URISyntaxException {
		builder = new URIBuilder("https://api.vk.com/method/wall.post?");
		builder.setParameter("access_token",
				"2007d5e92f8e4e5ca15823cb1fae848a68ac534dd03c205308c33916bdab61c5818bf732f162d7d36297f")
				.setParameter("owner_id", "536083852").setParameter("message", postText)
				.setParameter("attachments", "photo15919970_456239031").setParameter("v", "5.92");
		request = new HttpGet(builder.build());
		response = client.execute(request);
		postId = (EntityUtils.toString(response.getEntity())).replaceAll("[^0-9]", "");
	}
	
	@When("^I make screenshot$")
	public void makeScreenshot() throws IOException {
		Screenshot.makeScreenShot(driver);
		LOGGER.info("Screenshot has been taken");
	} 
	
	@Then("^Message is posted$")
	public void checkIsPostPresent( ) {
		Assert.assertTrue(vKUserPage.isPostPresent(driver));
		LOGGER.info("A message has been posted on the wall");
		WebdriverSingleton.closeWebBrowser();
	}

	@When("^I edit the message I've left on the wall$")
	public void editPostOnTheWall() throws ClientProtocolException, IOException, URISyntaxException {
		builder = new URIBuilder("https://api.vk.com/method/wall.edit?");
		builder.setParameter("access_token",
				"2007d5e92f8e4e5ca15823cb1fae848a68ac534dd03c205308c33916bdab61c5818bf732f162d7d36297f")
				.setParameter("owner_id", "536083852").setParameter("post_id", postId)
				.setParameter("message", editedPostText).setParameter("attachments", "photo15919970_377416426")
				.setParameter("v", "5.92");
		request = new HttpGet(builder.build());
		response = client.execute(request);
		// !!for Adapter pattern: to compare JSON with XML!!
		forAdapter = EntityUtils.toString(response.getEntity());
		JSONResponse jsonResponse = new JSONResponse(new JSONObject(forAdapter));
		XMLResponse xMLResponse = new XMLResponse();
		XMLResponseAdapter xmlResponseAdapter = new XMLResponseAdapter(xMLResponse.getXMLObject());
		System.out.println(forAdapter);
		Assert.assertTrue(jsonResponse.isJSONEqual(xmlResponseAdapter.getJSONObject()));
	}
	
	@Then("^Message is edited$")
	public void checkIsPostEdited( ) {
		Assert.assertTrue(vKUserPage.isPostEdited(driver));
		LOGGER.info("The message has been edited");
		WebdriverSingleton.closeWebBrowser();
	}
	
	@When("^I leave a comment under the previously added post$")
	public void leaveComment() throws ClientProtocolException, IOException, URISyntaxException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.createComment?");
		builder.setParameter("access_token",
				"2007d5e92f8e4e5ca15823cb1fae848a68ac534dd03c205308c33916bdab61c5818bf732f162d7d36297f")
				.setParameter("owner_id", "536083852").setParameter("post_id", postId)
				.setParameter("message", "Lena's comment").setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		System.out.println(EntityUtils.toString(response.getEntity()));
	}
	
	@Then("^Comment is added$")
	public void checkIsCommentAdded( ) {
		Assert.assertTrue(vKUserPage.isCommentPresent(driver));
		LOGGER.info("A comment has been added");
		WebdriverSingleton.closeWebBrowser();
	}

	@When("^I delete my message from the wall$")
	public void deletePost() throws ClientProtocolException, IOException, URISyntaxException {
		builder = new URIBuilder("https://api.vk.com/method/wall.delete?");
		builder.setParameter("access_token",
				"2007d5e92f8e4e5ca15823cb1fae848a68ac534dd03c205308c33916bdab61c5818bf732f162d7d36297f")
				.setParameter("owner_id", "536083852").setParameter("post_id", postId).setParameter("v", "5.92");
		request = new HttpGet(builder.build());
		response = client.execute(request);
		responseCode = (EntityUtils.toString(response.getEntity())).replaceAll("[^0-9]", "");
		Assert.assertEquals(Integer.parseInt(responseCode), 1);
	}
	
	@Then("^Message is deleted$")
	public void checkIsPostDeleted( ) {
		Assert.assertTrue(vKUserPage.isPostEdited(driver));
		LOGGER.info("The message has been deleted");
		WebdriverSingleton.closeWebBrowser();
	}

}
