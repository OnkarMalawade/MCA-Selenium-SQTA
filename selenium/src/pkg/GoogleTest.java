package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

    public static void main(String[] args) {
        // Set the path of the geckodriver (change the path as per your system)
    	System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Launch the Google website
        driver.get("https://www.google.co.in/");

        // Get and print the Page Title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Get and print the Page Title length
        int titleLength = title.length();
        System.out.println("Title Length: " + titleLength);

        // Get and verify the current URL
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.google.co.in/")) {
            System.out.println("The correct URL is opened: " + currentUrl);
        } else {
            System.out.println("An incorrect URL is opened: " + currentUrl);
        }

        // Get and print the Page Source length
        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Page Source Length: " + pageSourceLength);

        // Close the browser
        driver.close();
    }
}
