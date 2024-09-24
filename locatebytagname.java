package pkg;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatebytagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Open Web Page Login.html
		driver.get("https://demo.guru99.com/test/login.html");
		
		// Locate elements
		List<WebElement> txtBoxes = driver.findElements(By.tagName("input"));
		
		// Display number of Web Elements having <input> tag and saved in list
		System.out.println(txtBoxes.size());
		
		// Display value of name attribute in the List
		for(int i = 0; i < txtBoxes.size(); i++) {
			System.out.println(txtBoxes.get(i).getAttribute("name"));
		}
		
		
		// Type email address in Email
		txtBoxes.get(0).sendKeys("abcd@gmail.com");
		
		// Type password in password
		txtBoxes.get(1).sendKeys("abcdefghlkjkl");
		
		
	}

}
