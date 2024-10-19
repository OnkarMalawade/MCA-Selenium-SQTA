package pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement btn = driver.findElement(By.id("alertButton"));
		btn.click();
		Thread.sleep(5000);

		Alert simple_alert = driver.switchTo().alert();
		System.out.println("the alert message is "+ simple_alert.getText());
		simple_alert.accept();
		Thread.sleep(5000);

		WebElement btn2 = driver.findElement(By.id("timerAlertButton")); 
		btn2.click();
		Thread.sleep(5000);
		
		Alert wait_alert = driver.switchTo().alert();
		System.out.println("the wait alert message is "+ wait_alert.getText());
		Thread.sleep(5000);
		wait_alert.accept();
		
		WebElement btn3 = driver.findElement(By.id("confirmButton")); 
		btn3.click();
		Thread.sleep(5000);
		
		Alert confirm_alert = driver.switchTo().alert();
		System.out.println("the wait alert message is "+ confirm_alert.getText());
		Thread.sleep(5000);
		confirm_alert.accept();
		
		WebElement promtBtn = driver.findElement(By.id("promtButton"));
		promtBtn.click();
		Alert promptAlert = driver.switchTo().alert(); 
		
		promptAlert.sendKeys("Onkar");
		Thread.sleep(5000);
		
		promptAlert.accept();
		Thread.sleep(5000);

	}

}
