package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locateFlightClickToContinue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// open page
		driver.get("https://demo.guru99.com/test/newtours/");
		
		// Wait for the Flight Finder page to load
        Thread.sleep(5000);
        
		// locate Images hyperlink
		WebElement flight_link = driver.findElement(By.linkText("Flights"));
		
		// click on the Flights Keyword
		flight_link.click();
		
		 // Wait for the Flight Finder page to load
        Thread.sleep(5000);

        // Submit the flight search
        WebElement findFlightsButton = driver.findElement(By.name("findFlights"));
        findFlightsButton.click();
        
        // Wait for the flight results page to load
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
	}

}
