package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingAssertion {
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		
		String actual = driver.getTitle();
		
		String expected = "Google";
		
		Assert.assertEquals(actual, expected,"Title is Not Expected");
  }
}
