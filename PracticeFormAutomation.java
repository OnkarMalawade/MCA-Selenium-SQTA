package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeFormAutomation {

    public static void main(String[] args) throws InterruptedException {
        // Set the path of the GeckoDriver for Mozilla Firefox 	
    	System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the demo automation practice form page
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement Username = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        System.out.println(Username.getAttribute("id"));
        

        WebElement Lastname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        System.out.println(Lastname.getAttribute("id"));
        
        
        List<WebElement> gender = driver.findElements(By.cssSelector("input[class='custom-control-input']"));
        
        for(int i=0;i<gender.size();i++)
        {
            System.out.println(gender.get(i).getAttribute("id"));
        }


        // Wait for a few seconds to observe the result
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
    }
}
