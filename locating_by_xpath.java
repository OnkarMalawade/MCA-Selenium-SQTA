package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// xpath = xml path
// xml = extensible markup language
// Syntax : (Relative XPATH) - src = "~/script.js" in html
// begins with double forward slash [//] starts from middle of html dom structure
//     Xpath=//tagname[@Attribute='Value'] 
// Syntax : ( Absolute XPATH ) - src = "E:/start/img1.jpg"
// begins with single forward slash [/]
//         /html/body/div[3]/div[1]/h4[3]/b
// get Attribute() : it returns specified attribute it perform action on all elements
// sendKeys() : It is applicable for textBox or textArea
// 		Syntax : <id/class name>.sendKeys(Keys.chord(Keys.<special>,"String"));
// clear() : It clears or erase the input box that present in text Area or Text Box.
// 		<id>.clear();
// submit() : Submits the form on web server
//		<return_type> submit(){}
// click() : You can click action on normal buttons, hyperlinks, checkboxes, radiobutton
// getCssValue() : 
// 		it fetches CSS value of WebElement
// getLocation() : Relative position of (x, y) co-ordinates
// getSize() : it returns width and height of the element
// getText() : returns -1/"" or "String Value"
// getTagName() : returns tag associated with WebElements
// isDisplayed() : returns -1/false if WebElements not present else 1/true means present
// boolean isEnabled() : Before any action works we perform this 
// boolean isSelected() : radio, chkBox, DropList values Selected or not
public class locating_by_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// open page
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		
		//locating string (testing) using Absolute Path
		WebElement testing = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/h4[1]/b"));
		System.out.println(testing.getText());
		
		//locating string (testing) using Relative Path
		WebElement test = driver.findElement(By.xpath("//div[@class='featured-box cloumnsize1']/h4[3]/b"));
		System.out.println(test.getText());
		
		// locating login button
//		WebElement submitBtn = driver.findElement(By.xpath("//*[contains(@type,'sub')]"));
//		System.out.println(submitBtn.getText());
//		
		// locating * any tag
		// *[contains(@type='submit' or @name='btnLogin')]
		// //*[@type='submit' or @name='btnReset']
		// //*[@type='submit' and @name='btnReset']
		// //label[starts-with(@id,'mess')]
		
		// store findElements
		List<WebElement> multi = driver.findElements(By.xpath("//label[starts-with(@id,'mess')]"));
		for (WebElement webElement : multi) {
			System.out.println(webElement.getText() + " : " + webElement.getTagName());
		}
	}

}
