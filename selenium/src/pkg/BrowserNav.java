package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNav {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		 // Navigate to the ToolsQA Selenium Training website
        driver.get("https://www.toolsqa.com/selenium-training/");
        
        // Display Title of WebPage
     	System.out.println("Current Web Page Title : " + driver.getCurrentUrl());
     	
        // Click on the Registration button link
        driver.findElement(By.className("btn-primary-shadow")).click();
     		
     	// navigate 
     	driver.navigate().to(driver.getCurrentUrl()+"");
     	System.out.println("Now Current Page title is " + driver.getCurrentUrl());
        
        // Wait for a few seconds to see the registration page
        Thread.sleep(2000);

        // Come back to Home page using 'Back' command
        driver.navigate().back();
        
        // Wait for a few seconds to see the home page
        Thread.sleep(2000);
        
        // Again go back to Registration page using 'Forward' command
        driver.navigate().forward();
        
        // Wait for a few seconds to see the home page
        Thread.sleep(2000);

        // Refresh the Browser
        driver.navigate().refresh();

	}

}
