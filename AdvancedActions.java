package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AdvancedActions {

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
		WebElement two = driver.findElement(By.name("two"));
		WebElement four = driver.findElement(By.name("four"));
		WebElement five = driver.findElement(By.name("five"));
		WebElement seven = driver.findElement(By.name("seven"));
		WebElement ten = driver.findElement(By.name("ten"));
		WebElement twelve = driver.findElement(By.name("twelve"));
		
		// Step - 1 
		Actions builder = new Actions(driver);
		
		// Step - 2
		builder.keyDown(Keys.CONTROL).click(two)
									.click(four)
									.click(five)
									.click(seven)
									.click(ten)
									.click(twelve)
									.keyUp(Keys.CONTROL);
		
		// Step - 3
		Action compositeAction = builder.build();
		
		// Step - 4
		compositeAction.perform();
		
		// Short Cut
		// builder.perform();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		// locate Element 2
		two = driver.findElement(By.name("two"));
		
		System.out.println("X coordinate : " + (two.getLocation().getX()+1) + ", Y coordinate : " + (two.getLocation().getY()+1));
		
		// step -1 add all actions into Actions builder
		builder.moveByOffset(two.getLocation().getX()+1 , two.getLocation().getX()+1).click();
		
		// step - 2 Perform task
		builder.perform();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		WebElement nine = driver.findElement(By.name("nine"));
		
		builder.moveToElement(nine).click();
		builder.perform();
		Thread.sleep(3000);
		
		// the click on WebElement Action
		driver.navigate().refresh();
		Thread.sleep(3900);
		
		seven = driver.findElement(By.name("seven"));
		WebElement eight = driver.findElement(By.name("eight"));
		ten = driver.findElement(By.name("ten"));
		
		// click 7 8 10
		builder.click(seven).click(eight).click(ten).perform();
		
		Thread.sleep(3900);
		
		driver.quit();
		
	}

}
