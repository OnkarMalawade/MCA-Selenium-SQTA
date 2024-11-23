package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Open WebPage
		driver.get("file:///G:/DataFiles/DragAndDrop.html");
		
		// Locating Item
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		// Actions
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(drag, drop).perform();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
