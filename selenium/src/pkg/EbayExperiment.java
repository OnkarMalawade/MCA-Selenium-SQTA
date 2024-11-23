package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayExperiment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "G:\\Selenium_Setup\\geckodriver.exe");
			
		 // create web driver instance
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.ebay.com/");
		
		 //Entersearchqueryfor'AppleWatches'
		 WebElement searchBox=driver.findElement(By.id("gh-ac"));
		 searchBox.sendKeys("Apple Watches");
		 //Locate the categories dropdown
		 Select categories = new Select(driver.findElement(By.id("gh-cat")));
		 //Select the'ConsumerElectronics'category(value is'293')
		 categories.selectByValue("293");
		 //Click on the search button
		 WebElement submit = driver.findElement(By.id("gh-btn"));
		 submit.click();
		 //Wait
		 Thread.sleep(3000);
		 
		 System.out.println("Results for'Apple Watches':");
		 
		 List<WebElement> productTitles = driver.findElements(By.cssSelector(".s-item__title"));
		 
		 for(WebElement title:productTitles){
			 System.out.println(title.getText());
		 }
		 
	}

}
