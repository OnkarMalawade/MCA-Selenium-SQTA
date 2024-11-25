package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SelectTestTile {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
							
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
				
		// Open WebPage
		driver.get("file:///G:/DataFiles/Selectable.html");	
		
		// locate elements 2,4,5,7,10,12
		WebElement one = driver.findElement(By.name("one"));
		WebElement eleven = driver.findElement(By.name("eleven"));
		WebElement five = driver.findElement(By.name("five"));
		
		// Step - 1 
		Actions builder = new Actions(driver);
		
		// Step - 2
		builder.keyDown(Keys.CONTROL).click(five)
									.click(one)
									.click(eleven)
									.keyUp(Keys.CONTROL);
		
		// Step - 3
		Action compositeAction = builder.build();
		
		// Step - 4
		compositeAction.perform();
		
		// Short Cut
		// builder.perform();
		
		 Thread.sleep(3900);
		
		driver.quit();
		
	}

}
