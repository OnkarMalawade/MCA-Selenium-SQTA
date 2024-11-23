package pkg;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///G:/Flight_Reservation/flight_reservation.html");
		
		String mainWindow = driver.getWindowHandle();
		
		WebElement btn = driver.findElement(By.linkText("Hotels"));
		btn.click();
		Thread.sleep(5000);

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        
        // Loop through all window handles
        for (String windowHandle : allWindowHandles) {
        	if (!windowHandle.equals(mainWindow)) {
            // Switch to the newly opened window
            driver.switchTo().window(windowHandle);
                
            // Wait for a few seconds to ensure page loads
            Thread.sleep(2000);

            // Get and print the heading from the new window
            String heading = driver.findElement(By.id("sampleHeading")).getText();
            System.out.println("Heading on the new window: " + heading);

            // Close the new window
            driver.close();
        	}
        }

		Thread.sleep(5000);
	}

}
