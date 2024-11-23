package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "G:\\Selenium_Setup\\geckodriver.exe");
		
		 // create web driver instance
		 WebDriver driver = new FirefoxDriver();
		 
		 //open 
		 driver.get("https://demo.guru99.com/test/radio.html");
		 
		 //locate all radio buttons
		 List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type ='checkbox']"));
		 for(int i=0;i<radioButtons.size();i++) {
			 if(radioButtons.get(i).isSelected()) {
				 System.out.println(radioButtons.get(i)+ " is Selected");
		 	 }
		 }
		 System.out.println("No one is selected");
	}

}
