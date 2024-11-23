package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// Implicit Timeout is common
// explicit Timeout is for particular element on web

public class implicitDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
							
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Open WebPage
		driver.get("https://demoqa.com/alerts");

		// configuring implicit wait time of 10 seconds
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		// Finding and clicking the alert button
        WebElement AlertBtn = driver.findElement(By.id("timerAlertButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AlertBtn);

        Thread.sleep(7000);

        // Switch to alert and accept it
        Alert myAlert = driver.switchTo().alert();
     		
        myAlert.accept();
        System.out.println("Alert Accepted");
		
		driver.quit();
	}

}
