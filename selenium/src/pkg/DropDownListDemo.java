package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "G:\\Selenium_Setup\\geckodriver.exe");
			
		 // create web driver instance
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://output.jsbin.com/osebed/2");
		 
		 Select fruits = new Select(driver.findElement(By.id("fruits")));
		 
		 fruits.selectByVisibleText("Banana");
		 fruits.selectByValue("apple");
		 fruits.selectByIndex(2);
		 
		 if(fruits.isMultiple()) {
			 System.out.println("List has multiple select option");
		 }
		 else {
			 System.out.println("List does not have multiple select option");
		 }
	}

}
