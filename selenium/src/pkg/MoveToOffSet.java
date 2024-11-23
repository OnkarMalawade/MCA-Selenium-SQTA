package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToOffSet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
							
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
				
		// Open WebPage
		driver.get("file:///G:/DataFiles/Selectable.html");	
		
		// locate elements 2,4,5,7,10,12
		WebElement three = driver.findElement(By.name("three"));
		WebElement eleven = driver.findElement(By.name("eleven"));
		
		// Create an Actions object
        Actions actions = new Actions(driver);

        // Move to tile 3 using moveByOffset
        actions.moveToElement(three).clickAndHold().perform(); // Click and hold on tile 3
        actions.moveByOffset(0, 0).release().perform(); // Move by offset to keep it in the same position

        Thread.sleep(5000);
        // Now select tile 11 using click method
        eleven.click();
        
        Thread.sleep(3900);
		
		driver.quit();
		
	}

}
