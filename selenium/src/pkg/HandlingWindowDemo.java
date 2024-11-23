package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindowDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
					
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Open the page Window.html in Browser
		driver.get("file:///G:/DataFiles/Window.html");
		
		// Display Id or Window Handle of First Window
		String window1 = driver.getWindowHandle();
		System.out.println("Window Data Handle on this ID : " + window1);
		
		// Locate the Link on Page
		WebElement webLink = driver.findElement(By.linkText("Google Search"));
		
		// Click on the Link
		webLink.click();
		
		// Set Returns ID's or Retrieving windows handles of all windows open in this browser session
		Set<String> winSet = driver.getWindowHandles();
		
		// Saving window handles in list
		List<String> winList = new ArrayList<String>(winSet);
		
		// Display total Number of windows opened in this browser session
		System.out.println("Total No. of Windows are : " + winList.size());
		
		// Switching to new Window
		String newTab = winList.get(1);
		driver.switchTo().window(newTab);
		
		// display ID of New Tab
		System.out.println("Second window handle is : " + newTab);
		
		// Display the Title of new Tab or Web Page
		// System.out.println("Display Title of WebPage : " + driver.getTitle());
		
		// Come back to Original window
		driver.switchTo().window(window1);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}


/*
 * Browser Commands:
 * 
 * driver.getTitle();
 * To fetch title of current web Page it Returns String Value
 * 
 * driver.getCurrentUrl();
 * this method fetches current URL of the Current web Page
 * 
 * driver.getPageSource();
 * this method returns current HTML Code of Current WebPage
 * 
 * driver.close();
 * Terminate Current Browser Window
 * 
 * driver.quit();
 * Terminate all the Tabs or Windows open by the Driver
 * 
 * Navigation Commands:
 * to()
 * it's used navigate webUrl it Takes as input URL String to be Loaded in the Browser
 * 
 * back()
 * it's emulates browsers back button and takes browser one Level back in it's History
 * 
 * forward()
 * it's emulates forward button of browser it takes browser one level forward in history
 * 
 * refresh()
 * this method will reload the current URL
 * 
 *  
 */
