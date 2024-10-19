package pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Open WebPage
		driver.get("file:///G:/DataFiles/ContextClick.html");
		
		WebElement contextLocate = driver.findElement(By.id("div-context"));
		WebElement items = driver.findElement(By.id("ui-id-4"));
		
		// Actions Perform
		Actions builder = new Actions(driver);
		
		// right click
		builder.contextClick(contextLocate).click(items).perform();
		
		//switch from main window to alert window
		Alert simpleAlert = driver.switchTo().alert(); // simpleAlert

		Thread.sleep(2000);
		//print alert text
		System.out.println("The	Text inside	alert window is: "+  simpleAlert.getText());

		//perform action on clicking on simple alert 
		Thread.sleep(2000);
		simpleAlert.accept();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
