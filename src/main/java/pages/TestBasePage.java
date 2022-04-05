package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasePage {

	
	public static WebDriver driver;
	
	public static void initDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monik\\eclipse-workspace\\Cucumber_FinalProject\\Cucumber_FinalProject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/test/101/");	
		
	}
}
