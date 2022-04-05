package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SetBackgroungColorPage {
	



public static class SetbackgroungColorPage {

	WebDriver driver;
	String BGcolor;
	public static String hex;

	public SetbackgroungColorPage(WebDriver driver) {
		this.driver = driver;

	}

//	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]") WebElement SET_SKYBLUE_BACKGROUND_BUTTON;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]") WebElement SET_WHITE_BACKGROUND_BUTTON;
//	@FindBy(how = How.XPATH, using = "/html/body") WebElement BACKGROUND_BLUEBODY_ELEMENT;
//	@FindBy(how = How.XPATH, using = "/html/body") WebElement BACKGROUND_WHITEBODY_ELEMENT;
	
	
	@FindBy(how = How.CSS, using = "button[onclick=\"myFunctionSky()\"]") WebElement SET_SKYBLUE_BACKGROUND_BUTTON;
	@FindBy(how = How.CSS, using = "button[onclick=\"myFunctionWhite()\"]") WebElement SET_WHITE_BACKGROUND_BUTTON;
	@FindBy(how = How.CSS, using = "body[style=\"background-color: skyblue;\"]") WebElement BACKGROUND_BLUEBODY_ELEMENT;
	@FindBy(how = How.CSS, using = "body[style=\"background-color: white;\"]") WebElement BACKGROUND_WHITEBODY_ELEMENT;
	

	public void verifyingSetSkyblueButtonExist() {

		assert SET_SKYBLUE_BACKGROUND_BUTTON.getText().equals("Set SkyBlue Background");
		System.out.println("Set SkyBlue Background Button is available on the page...Verified!!");

	}

	public void clickingSetSkyblueBackgroundButton() {

		SET_SKYBLUE_BACKGROUND_BUTTON.click();

	}

	public void verifyingbackgroundWithSkyblueColor() {
		
		BGcolor = BACKGROUND_BLUEBODY_ELEMENT.getCssValue("background-color");
		System.out.println("Background color is " + BGcolor);

		hex = Color.fromString(BGcolor).asHex();
		System.out.println("Background color changed to hexa:  " + hex);

		assert hex.equals("#87ceeb");
		System.out.println("Background color is mached and verified!!");
		
	}


	public void verifyingSetWhiteButtonExist() {

		assert SET_WHITE_BACKGROUND_BUTTON.getText().equals("Set White Background");
		System.out.println("Set White Background Button is available on the page...Verified!");

	}

	public void clickingSetSkyWhiteBackgroundButton() {

		SET_WHITE_BACKGROUND_BUTTON.click();
	}
	
	public void verifyingbackgroundWithWhiteColor() {

		BGcolor = BACKGROUND_WHITEBODY_ELEMENT.getCssValue("background-color");
		System.out.println("Background color is " + BGcolor);

		hex = Color.fromString(BGcolor).asHex();
		System.out.println("Background color changed to hexa:  " + hex);

		assert hex.equals("#ffffff");
		System.out.println("Background color is mached and verified!");

	}

}


}
	
	
	
	
	

