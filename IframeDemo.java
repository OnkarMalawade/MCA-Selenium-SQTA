package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// open train_reservation page
		driver.get("file:///G:/Flight_Reservation/flight_reservation.html");
		
		// switch to iFrame - 1
		driver.switchTo().frame(0);
		
		// Locate Heading in iFrame One 
		WebElement headingInIfrm1 = driver.findElement(By.id("heading1"));
		
		// Display Heading in iFrame One
		System.out.println("Heading inside Iframe-1: "+ headingInIfrm1.getText());
		
		// Switching back to the main window
		// returns you back to main window directly
		driver.switchTo().defaultContent();
		
		// Switch to iFrame-2
		driver.switchTo().frame("IF2");
		
		// Locating Elements in iFrame - 2
		WebElement headingInIfrm2 = driver.findElement(By.id("heading2"));
		
		// Display Heading in iFrame - 2
		System.out.println("Heading inside Iframe-2: "+ headingInIfrm2.getText());
		
		// switch to iFrame-3 from iFrame-2
		driver.switchTo().frame(0);
		
		// Locating Elements in iFrame - 2
		WebElement headingInIfrm3 = driver.findElement(By.id("heading3"));
				
		// Display Heading in iFrame - 2
		System.out.println("Heading inside Iframe-3: "+ headingInIfrm3.getText());
		
		// Switch to default
		driver.switchTo().defaultContent();
		
		// Wait for 5 seconds
		Thread.sleep(5000);
		driver.quit();
		
	}

}
