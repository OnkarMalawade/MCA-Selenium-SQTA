package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

    public static void main(String[] args) throws InterruptedException {
        // Setting the path to geckodriver
        System.setProperty("webdriver.gecko.driver", "G:\\Selenium_setup\\geckodriver.exe");
        
        // Web driver for Firefox
        WebDriver driver = new FirefoxDriver();
        
        // Open the Drag and Drop WebPage
        driver.get("https://demoqa.com/droppable/");
        
        // Locate the "drag me" element and "drop here" area
        WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement dropHere = driver.findElement(By.id("droppable"));

        // Scroll the target drop area into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropHere);
        
        // Instantiate Actions
        Actions builder = new Actions(driver);
        Thread.sleep(5000);
        // Step 1: Click and hold the "drag me" element
        builder.clickAndHold(dragMe)
               // Step 2: Move it to the target drop area
               .moveToElement(dropHere)
               // Step 3: Release the mouse button to drop it
               .release()
               // Perform the action
               .perform();

        // Optional: Wait to observe the result
        Thread.sleep(5000);
        
        // Close the driver
        driver.quit();
    }
}
