package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleModals {

    public static void main(String[] args) throws InterruptedException {
        // Set the path of the geckodriver (change the path as per your system)
        System.setProperty("webdriver.gecko.driver", "G:\\Selenium_setup\\geckodriver.exe");
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open the local HTML file (hotel_search.html) - Update the path to your local file
        driver.get("file:///G:/Flight_Reservation/hotel_search.html");
    
        Thread.sleep(4000);

        // Handle the first modal (5 Star Hotels)
        WebElement fiveStarHotelsButton = driver.findElement(By.cssSelector(".btn-info[data-target='#myModal']"));
        fiveStarHotelsButton.click();
        
        Thread.sleep(4000);

        // Interact with the first modal (close it)
        WebElement closeButton = driver.findElement(By.cssSelector("#myModal .close"));
        closeButton.click();  // Close the modal

        // Wait for the modal to disappear
        Thread.sleep(4000); // Short wait for the modal to close

        // Handle the second modal (Book a Room)
        WebElement bookRoomButton = driver.findElement(By.id("myBtn1"));
        bookRoomButton.click();
        
        Thread.sleep(4000);

        // Interact with the modal (fill in the form and submit)
        WebElement hotelNameInput = driver.findElement(By.id("htlname"));
        hotelNameInput.sendKeys("Mango Vila");
        
        Thread.sleep(4000);

        WebElement personsInput = driver.findElement(By.id("prs"));
        personsInput.sendKeys("2");
        
        Thread.sleep(4000);

        WebElement daysInput = driver.findElement(By.id("days"));
        daysInput.sendKeys("3");
        
        Thread.sleep(4000);

        WebElement bookButton = driver.findElement(By.cssSelector("#myModal1 .btn-success"));
        bookButton.click();  // Submit the form

        // Wait for a moment to view the results
        Thread.sleep(4000);

        // Close the browser
        driver.quit(); 
    }
}
