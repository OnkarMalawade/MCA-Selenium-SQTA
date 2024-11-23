package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
        
        WebElement usNm = driver.findElement(By.name("userName"));
        usNm.sendKeys("omshree");
        
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("123");
        
     // Wait for the Flight Finder page to load
        Thread.sleep(5000);
        
		// locate Images hyperlink
		WebElement flight_link = driver.findElement(By.linkText("Flights"));
		
		// click on the Flights Keyword
		flight_link.click();
		
		// radio button select 
		WebElement radioBtn = driver.findElement(By.cssSelector("input[value='oneway']"));
		radioBtn.click();
		
		Select passenger = new Select(driver.findElement(By.name("passCount")));
		passenger.selectByIndex(2);
		
		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByValue("New York");
		
		Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
		fromMonth.selectByVisibleText("June");
		
		Select fromDay = new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByValue("30");
		
		Select toPort = new Select(driver.findElement(By.name("toPort")));
		toPort.selectByValue("Paris");
		
		Select toMonth = new Select(driver.findElement(By.name("toMonth")));
		toMonth.selectByVisibleText("August");
		
		Select toDay = new Select(driver.findElement(By.name("toDay")));
		toDay.selectByValue("18");
		
		WebElement seatBtn = driver.findElement(By.cssSelector("input[value='First']"));
		seatBtn.click();
		
		Select airlines = new Select(driver.findElement(By.name("airline")));
		airlines.selectByIndex(2);
		
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
