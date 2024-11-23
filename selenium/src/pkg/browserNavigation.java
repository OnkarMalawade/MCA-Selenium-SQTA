package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
				
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// navigate to google.com
		driver.get("https://www.google.com/");
		
		// Display Title of WebPage
		System.out.println("Current Web Page Title : " + driver.getTitle());
		
		// navigate to Wikipedia Paris
		driver.navigate().to("https://en.wikipedia.org/wiki/Paris");
		System.out.println("Now Current Page title is " + driver.getTitle());
		Thread.sleep(2000);
		
		// navigate to go back to google.com
		driver.navigate().back();
		System.out.println("Now Current Page title is " + driver.getTitle());
		Thread.sleep(2000);
		
		// go forward one page
		driver.navigate().forward();
		System.out.println("Now Current Page title is " + driver.getTitle());
		Thread.sleep(2000);
		
		// Refresh the Page
		driver.navigate().refresh();
		
		driver.quit();
	}

}
