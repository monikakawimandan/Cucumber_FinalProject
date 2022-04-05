package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SetBackgroungColorPage.SetbackgroungColorPage;
import pages.TestBasePage;

public class StepDefination_Class extends TestBasePage {
	
	SetbackgroungColorPage BGcolor;
	
	@Before
	public void beforeRun() throws InterruptedException {
		initDriver();
		BGcolor = PageFactory.initElements(driver, SetbackgroungColorPage.class);
		Thread.sleep(3000);		
	}
	
	
	@Given("Set SkyBlue Background button exists")
	public void set_SkyBlue_Background_button_exists() throws InterruptedException {
		
		driver.get("https://techfios.com/test/101/");
		BGcolor.verifyingSetSkyblueButtonExist();
		Thread.sleep(3000);
		
	}

	@When("I click on the button")
	public void i_click_on_the_button() throws InterruptedException {
	 
		BGcolor.clickingSetSkyblueBackgroundButton();
		Thread.sleep(2000);
		
		/*
		 * if(SetbackgroungColorPage.hex=="#ffffff") {
		 * 
		 * BGcolor.clickingSetSkyblueBackgroundButton(); } else
		 * if(SetbackgroungColorPage.hex=="#87ceeb"){
		 * BGcolor.clickingSetSkyWhiteBackgroundButton(); }
		 */
	
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
	  
		BGcolor.verifyingbackgroundWithSkyblueColor();
	
	}

	@Given("Set SkyWhite Background button exists")
	public void set_SkyWhite_Background_button_exists() throws InterruptedException {
		
		driver.get("https://techfios.com/test/101/");
		BGcolor.verifyingSetWhiteButtonExist();
		Thread.sleep(3000);
	  
	}

	@When("I click on the Set white button")
	public void i_click_on_the_Set_white_button() {
	  
		BGcolor.clickingSetSkyWhiteBackgroundButton();
	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {
	    
		BGcolor.verifyingbackgroundWithWhiteColor();
	}
	
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
	
	
}
	
		
	
	
	

	
	