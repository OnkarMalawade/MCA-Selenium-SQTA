package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractionsWithWebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// open page
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		
		// Locate newName
		//WebElement lname = driver.findElement(By.cssSelector("input[placeholder = 'Last Name']"));
		WebElement itemsProps = driver.findElement(By.cssSelector("h3[itemprop = 'name']"));		
		
		//locating string (testing) using Absolute id
		WebElement fname = driver.findElement(By.id("fname"));

		// locating string (testing) using Absolute name
		WebElement lname = driver.findElement(By.name("lname"));
		
		// CheckBoxes selection List
		List<WebElement> chkBoxData = driver.findElements(By.name("vehicle"));
		
		// RadioButtons Selection
		WebElement mRbtn = driver.findElement(By.cssSelector("input[value='male']"));
		WebElement fmRbtn = driver.findElement(By.cssSelector("input[value='female']"));
		
		// using getAttribute()
		System.out.println("The value of name attribute of FirstName element is " + fname.getAttribute("name"));
		
		// using sendKeys
		fname.sendKeys("Onkar");
		
		// delay time
		Thread.sleep(2000);
		
		// use clear()
		fname.clear();
		
		// Uppercase Buttons
		fname.sendKeys(Keys.chord(Keys.SHIFT,"onkar"));
		
		// delay time
		Thread.sleep(2000);
				
		// use clear()
		// fname.clear();
		
		// using getCssValue()
		System.out.println("Get CSS value is : " + fname.getCssValue("text-align"));
		
		// using getLocation()
		System.out.println("Get Location in (X, Y) : " + fname.getLocation());
		System.out.println("Get Location in (X) : " + fname.getLocation().x);
		System.out.println("Get Location in (Y) : " + fname.getLocation().y);
		
		// using getSize()
		System.out.println("Get Size : " + fname.getSize());
		System.out.println("Get Width Size : " + fname.getSize().width);
		System.out.println("Get Height Size : " + fname.getSize().height);
		
		// using getText()
		System.out.println("Get Text : " + itemsProps.getText());
		
		//	using getTagNmae()
		System.out.println("Get Tag Name : " + itemsProps.getTagName());
		
		// using isDisplayed()
		if(fname.isDisplayed()) {
			System.out.println("It's Displayed TextBox fname");
		}else {
			System.out.println("It's not Displayed TextBox fname");
		}
		
		// using isEnabled()
		if(lname.isEnabled() == true) {
			lname.sendKeys("Malawade");
			System.out.println("You can add value in Last name");
		}else {
			System.out.println("Sorry! You can't handle Last name");
		}
		
		// handling Check Boxes
		// 1. Select car in checkboxes (chkBoxData)
		// 2. in the list get data
		chkBoxData.get(1).click();
		chkBoxData.get(2).click();
		
		if(chkBoxData.get(0).isSelected()) {
			System.out.println("I have bike Checkbox is Selected");
		}else {
			System.out.println("I have bike Checkbox is not Selected");
		}
		
		// radio button
		mRbtn.click();
		if(mRbtn.isSelected()) {
			System.out.println("Gender is Male");
		}else {
			System.out.println("Gender is not Selected");
		}
		
		chkBoxData.get(1).click();
		
		// handle the drop down list
		// locate car name list using Select Class
		Select car_type = new Select(driver.findElement(By.tagName("select")));
		// select by value
		car_type.selectByValue("UK");
		Thread.sleep(2000);
		// select by an index
		car_type.selectByIndex(2);
		Thread.sleep(2000);
		// select by visibleText
		car_type.selectByVisibleText("Saab");
		Thread.sleep(2000);
		
		Select coutry_list = new Select(driver.findElement(By.name("FromLB")));
		// isMultiple() : allow multiple Selection that time Send true otherwise false
		if(coutry_list.isMultiple()) {
			System.out.println("Allowed Multiple Selection");
			// USA selected
			coutry_list.selectByIndex(0);
			Thread.sleep(2000);
			// Italy selected
			coutry_list.selectByValue("ITA");
			Thread.sleep(2000);
			// Russia Selected
			coutry_list.selectByVisibleText("Greece");
			Thread.sleep(2000);
		}else {
			System.out.println("Not Allowed Multiple Selection");
		}
		
		// deselect USA, Greece
		coutry_list.deselectByVisibleText("USA");
		coutry_list.deselectByIndex(9);
		
		if(coutry_list.isMultiple()) {
			System.out.println("Allowed Multiple Selection");
			// USA selected
			coutry_list.selectByIndex(0);
			Thread.sleep(2000);
			// Italy selected
			coutry_list.selectByValue("IND");
			Thread.sleep(2000);
			// Russia Selected
			coutry_list.selectByVisibleText("Greece");
			Thread.sleep(3000);
		}else {
			System.out.println("Not Allowed Multiple Selection");
		}
		// Deselect All the Elements
		coutry_list.deselectAll();
		
		driver.quit();
	}

}
