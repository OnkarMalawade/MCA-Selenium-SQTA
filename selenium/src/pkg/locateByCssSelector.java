package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locateByCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// open page
		driver.get("https://demoqa.com/automation-practice-form");
		
		// Locate firstName 
		WebElement fname = driver.findElement(By.cssSelector("input[id = 'firstName']"));
		
		fname.sendKeys("Onkar");
		
		// Locate lastName
		//WebElement lname = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
		
		WebElement lname = driver.findElement(By.cssSelector("input#lastName"));
		
		//type last name
		lname.sendKeys("Malawade");
		
		// locate current address
		WebElement currAdd = driver.findElement(By.cssSelector("textarea[class = 'form-control']"));
		// WebElement currAdd = driver.findElement(By.cssSelector("textarea.form-control"));
		// type address
		currAdd.sendKeys("Sindhudurg");
		
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='name@example.com'"));
		email.sendKeys("onkarmalawade@gmail.com");
		
		// By Locating mobile number
		WebElement mobileNum = driver.findElement(By.cssSelector("input[id='userNumber'][placeholder='Mobile Number']"));
		mobileNum.sendKeys("7020767878","200");
		
		// using the starting text
		// input[id^='userN']
		
		
		
		// using the ending text
		// input[id$='ame']
		
		
		
		// using the content text in the string
		// input[id*='Nam']
		
		
		
		

	}

}
