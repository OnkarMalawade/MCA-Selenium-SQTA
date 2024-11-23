package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Open Web Page
		driver.get("file:///G:/DataFiles/Sortable.html");
		
		// locate element 3 2
		WebElement three = driver.findElement(By.name("three"));
		WebElement two = driver.findElement(By.name("two"));
		
		// Instantiate
		Actions builder = new Actions(driver);
		
		//clickAndHold
	
		// Move tile3 to position of tile2
		builder.clickAndHold(three).moveByOffset(120, 0).release().perform();
		
		Thread.sleep(2000);
		
		// release on web element
		builder.clickAndHold(three).release(two).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
