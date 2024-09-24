package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatebyclassname {
	public static void main(String []args) {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
				
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
				
		// Open Web Page Login.html
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		// Locate class elements of inputtext
		List<WebElement> input_elements = driver.findElements(By.className("inputtext"));
		
		// Find Number of Elements in the List
		System.out.println(input_elements.size());
		
		// display value of id attribute of all elements in list
		for(int i = 0; i < input_elements.size(); i++) {
			System.out.println(input_elements.get(i).getAttribute("id"));
		}
	}
}
