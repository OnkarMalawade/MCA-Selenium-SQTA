package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DataInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		// open the web page
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		
		WebElement username = driver.findElement(By.id("fname")); WebElement password = driver.findElement(By.name("lname"));
		
		if(username.isEnabled()) {
			username.sendKeys(Keys.chord(Keys.SHIFT, "ABC"));
		}
		else {
			System.out.println("Username key is not enabled");
		}
		
		if(password.isEnabled()){
			password.sendKeys(Keys.chord(Keys.SHIFT,"123"));
		}
		else {
			System.out.println("Password key is not enabled");
		}
		List<WebElement> checkboxes = driver.findElements(By.name("vehicle"));
		//using Click select I have bike check box 
		checkboxes.get(0).click();
		//using Click select I have car check box
		checkboxes.get(1).click();
		WebElement male_rb = driver.findElement(By.cssSelector("input[value='male']"));

		male_rb.click();
		Select car_type = new Select(driver.findElement(By.tagName("select"))); 
		if(car_type.isMultiple()) {
			System.out.println("Car_type is multiple");
		}else {
			System.out.println("Car type is not multiple");
		}

		// car is selected
		car_type.selectByValue("Singapore");
		Select country_list = new Select(driver.findElement(By.name("FromLB")));
		if(country_list.isMultiple()) {
			System.out.println("Country list is multiple");
		}
		else {
			System.out.println("Country list is not Multiple");
		}
		//selectByVisibleText
		country_list.selectByVisibleText("USA");
		Thread.sleep(2000); //selectByValue
		
		country_list.selectByValue("GRC");
		Thread.sleep(2000); //selectByIndex
		
		country_list.selectByIndex(6);

	}

}
