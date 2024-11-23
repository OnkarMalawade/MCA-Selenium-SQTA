package pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Set;

public class HandleMultipleWindows {

    public static void main(String[] args) throws InterruptedException {
        // Set the path of the geckodriver (change the path as per your system)
        System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://demoqa.com/browser-windows");

        // Store the current window handle (main window)
        String mainWindow = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindow);

        // Click on the button that opens a new window
        driver.findElement(By.id("windowButton")).click();

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

        // Switch back to the main window
        driver.switchTo().window(mainWindow);

        // Close the main window
        driver.quit();
    }
}
