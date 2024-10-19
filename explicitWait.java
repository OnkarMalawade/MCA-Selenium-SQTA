package pkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
							
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
				
		// Open WebPage
		driver.get("https://demoqa.com/alerts");
		
		WebElement AlertBtn = driver.findElement(By.id("timerAlertButton"));
		AlertBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// create condition wait
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		
		// switch to Alert
		driver.switchTo().alert();
		
		// click on ok
		myAlert.accept();
		
		System.out.println("Alert Accepted");
		
		driver.quit();
	}

}
