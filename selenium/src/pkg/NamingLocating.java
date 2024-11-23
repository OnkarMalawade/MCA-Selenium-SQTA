package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NamingLocating {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium_Setup\\geckodriver.exe");
		
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		driver.get("https://demo.guru99.com/test/login.html");
		
		WebElement userNm = driver.findElement(By.name("email"));
		userNm.sendKeys("Onkar");
		
		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("Onkar");
		
		 // Wait for the Flight Finder page to load
        Thread.sleep(5000);

        // Submit the flight search
        WebElement Button = driver.findElement(By.name("SubmitLogin"));
        Button.click();
        
        // Wait for the flight results page to load
        Thread.sleep(5000);
	}

}
