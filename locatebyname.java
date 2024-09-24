package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatebyname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// setting the Path
				System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
				
				// elements finding
				WebDriver driver = new FirefoxDriver();
				
				// open webpage
				driver.get("https://www.google.com/");
				
				//locate ele
				WebElement search_box = driver.findElement(By.name("q"));
				
				// perform type FAMT in Search Box
				search_box.sendKeys("FAMT");
				
				// locating google search button
				WebElement search_button = driver.findElement(By.name("btnK"));
				
				search_button.submit();
	}

}
