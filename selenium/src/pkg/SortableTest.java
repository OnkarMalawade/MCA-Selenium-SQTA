package pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableTest {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		 // Navigate to the ToolsQA Selenium Training website
        driver.get("file:///G:/DataFiles/Sortable.html");
        
        // Locate the elements
        WebElement tile3 = driver.findElement(By.xpath("//li[@name='three']"));
        WebElement tile2 = driver.findElement(By.xpath("//li[@name='two']"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        Thread.sleep(5000);
        // Move tile3 to the position of tile2
        actions.clickAndHold(tile3)
               .moveToElement(tile2)
               .release() 
               .perform(); 

        Thread.sleep(5000);
        
        driver.quit();
    }
}
