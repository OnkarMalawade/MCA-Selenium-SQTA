package pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Open WebPage
		driver.get("file:///G:/DataFiles/DoubleClick.html");
		
		// Locate Click me Button
		WebElement dBClick = driver.findElement(By.name("dblClick"));
		
		// Perform Action
		Actions builder = new Actions(driver);
		// builder.moveToElement(dBClick).doubleClick().perform();
		// alternate options
		builder.doubleClick(dBClick).perform();
		
		//switch from main window to alert window
		Alert simpleAlert = driver.switchTo().alert(); // simpleAlert

		//print alert text
		System.out.println("The	Text inside	alert window is: "+  simpleAlert.getText());

		//perform action on clicking on simple alert 
		Thread.sleep(2000);
		simpleAlert.accept();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
