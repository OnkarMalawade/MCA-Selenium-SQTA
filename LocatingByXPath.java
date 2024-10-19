package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingByXPath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium_Setup\\geckodriver.exe");
		
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		
		WebElement testing = driver.findElement(By.xpath("/html/body/div[3]/h2"));
		//print text testing 
		System.out.println(testing.getText());
        // 2. Locate using Relative XPath
		WebElement testing1 = driver.findElement(By.xpath("//div[@class='featured-box cloumnsize1']//h4[3]//b"));
		System.out.println(testing1.getText());
	}
}
