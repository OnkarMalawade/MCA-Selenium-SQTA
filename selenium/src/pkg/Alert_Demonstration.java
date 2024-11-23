package pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Demonstration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// open web page
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		
		// Click the button to trigger the alert
        WebElement btnAlert1 = driver.findElement(By.cssSelector("input[value = 'Show Me Alert']"));

        // Click on Alert 1
        btnAlert1.click();
        
        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Wait 
        Thread.sleep(5000);
        
        // Get and print the alert text
        System.out.println("Alert text: " + alert.getText());

        // Accept the alert (click OK)
        alert.accept();

        // Wait 
        Thread.sleep(5000);
        
        // Close the browser
        driver.quit();
    }
}