package pkg;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set System path to browser
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium_setup\\geckodriver.exe");
		
		// Create webdriver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
	}

}
