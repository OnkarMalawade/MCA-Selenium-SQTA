package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinearScriptingTest {
  @Test
  public void loginTest() {
	  System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
	  // load web page
	  driver.get("https://demo.guru99.com/test/newtours");
	  
	  WebElement username = driver.findElement(By.name("userName"));
	  username.sendKeys("mercury");
	  
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("mercury");
	  
	  // Validate Login Success
	  String expectedTitle = "Login: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  
	  if(actualTitle.equals(expectedTitle)) {
		  System.out.println("Login Test Passed");
	  }else {
		  System.out.println("Login Test Failed");
	  }
	  
	  driver.quit();
  }
}
