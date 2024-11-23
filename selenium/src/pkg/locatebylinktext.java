package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatebylinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
				System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
				
				// Web driver for FireFox
				WebDriver driver = new FirefoxDriver();
				
				// open page
				driver.get("https://www.google.com/");
				
				//locate Images hyperlink
				WebElement img_link = driver.findElement(By.linkText("Images"));
				
				// Clicking on Images Link
				 img_link.click();
				
				// locate images hyperlink to partial text
				WebElement img_link_partial = driver.findElement(By.partialLinkText("Ima"));
				
				// click
				img_link_partial.click();
				
				// close() or quit()
				// driver.quit();
				driver.close();
				

	}

}
