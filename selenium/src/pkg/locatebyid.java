package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatebyid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// driver setup
		driver.get("https://demo.guru99.com/test/login.html");
		
		// Find Element By ID
		WebElement emailAddress = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		WebElement sign_button = driver.findElement(By.name("SubmitLogin"));
		
		// enter data in it
		emailAddress.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		
		// submit that code
		sign_button.submit();
		
		// driver close
		driver.quit();
		
	}

}
