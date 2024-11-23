package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBank {

    public static void main(String[] args) throws InterruptedException {
        // Setting the path to geckodriver
        System.setProperty("webdriver.gecko.driver", "G:\\Selenium_setup\\geckodriver.exe");
        
        // Web driver for FireFox
        WebDriver driver = new FirefoxDriver();
        
        // Open the Drag and Drop WebPage
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        
        // Locate the "BANK" element and "Account" block (target drop area)
        WebElement bank = driver.findElement(By.xpath("//li[@id='credit2']//a"));
        WebElement accountBlock = driver.findElement(By.xpath("//li[@class='placeholder']"));
        
     // Scroll the target drop area into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accountBlock);
        
        
        // Instantiate Actions
        Actions builder = new Actions(driver);
        
        // Step 1: Click and hold the "BANK" element
        builder.clickAndHold(bank)
               // Step 2: Move it to the target drop area (Account block)
               .moveToElement(accountBlock)
               // Step 3: Release the mouse button to drop it
               .release()
               // Perform the action
               .perform();

        // Optional: Wait to observe the result
        Thread.sleep(2000);
        
        // Close the driver
        driver.quit();
    }
}
