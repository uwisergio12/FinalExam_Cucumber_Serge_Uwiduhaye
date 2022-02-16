package steps;

import org.openqa.selenium.support.PageFactory;

import backgroundColorPage.BackgroundColorPage;
import backgroundColorPage.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundColorStepDefinitions extends TestBase {

	BackgroundColorPage BgColorPage;

	@Before
	public void beforeRun() {
		initDriver();
		BgColorPage = PageFactory.initElements(driver, BackgroundColorPage.class);
	}

	@Given("Set SkyBlue Background button exists")
	public void set_skyblue_background_button_exists() throws InterruptedException {
		BgColorPage.validateSkyBlueBackgroundButton();
		Thread.sleep(3000);
	}

	@Given("Set White Background button exists")
	public void set_white_background_button_exists() throws InterruptedException {
		BgColorPage.validateWhiteBackgroundButton();
		Thread.sleep(3000);
	}

	@When("I click on the \"([^\\\"]*)\" button")
	public void i_click_on_the_button(String button) throws InterruptedException {
		switch (button) {
		case "Set SkyBlue Background":
			BgColorPage.clickSetSkyBlueBackgroundButton();
			Thread.sleep(3000);
			break;
		case "Set White Background":
			BgColorPage.clickSetWhiteBackgroundButton();
			Thread.sleep(3000);
			break;
		default:
			break;
		}
	}

	@Then("the background color will change to skyblue")
	public void the_background_color_will_change_to_skyblue() {
		BgColorPage.validateSkyBlueBackgroundColor();
	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {
		BgColorPage.validateWhiteBackgroundColor();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
