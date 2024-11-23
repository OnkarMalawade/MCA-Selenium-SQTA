package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Open WebPage
		driver.get("file:///G:/DataFiles/DragMe.html");
		
		// Locating Item
		WebElement drag = driver.findElement(By.id("draggable"));
		
		// Actions
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(drag, 300, 350).perform();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
