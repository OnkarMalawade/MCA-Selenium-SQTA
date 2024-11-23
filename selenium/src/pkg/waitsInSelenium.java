package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Implicit Timeout is common
// explicit Timeout is for particular element on web

public class waitsInSelenium {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
							
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
				
		// Open WebPage
		driver.get("https://demo.guru99.com/test/guru99home/");	
		
		// configuring implicit wait time of 10 seconds
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// print title
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
