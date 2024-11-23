package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightDouble {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Navigate to the URL
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        // Locate the double-click element
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform double click
        actions.doubleClick(doubleClickButton).perform();
        
        Thread.sleep(5000);

        // Wait for the alert to appear and accept it
        driver.switchTo().alert().accept();

        // Locate the right-click element
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

        // Perform right click
        actions.contextClick(rightClickButton).perform();
        
        Thread.sleep(5000);

        // Close the driver
        driver.quit();
	}

}
