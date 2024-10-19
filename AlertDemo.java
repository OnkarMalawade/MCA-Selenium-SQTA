package pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
				
				// Web driver for FireFox
				WebDriver driver = new FirefoxDriver();
				
				// open train_reservation page
				driver.get("file:///G:/Flight_Reservation/train_reservation.html");
				
				// findElement by hyperLink
				WebElement trains = driver.findElement(By.linkText("Trains"));
				
				// click on the link
				trains.click();
				
				// create Alert instance and switch to Alert Window
				Alert simpleAlert = driver.switchTo().alert();
				
				// Fetch all or Capture data using getText()
				System.out.println("The alert message is " + simpleAlert.getText());
				Thread.sleep(2000);
				
				// accept / OK button click using accept()
				simpleAlert.accept();
				Thread.sleep(2000);
				
				WebElement confirmBtn = driver.findElement(By.cssSelector("input[value='Confirm Details']"));
				
				// click on the link
				confirmBtn.click();
				
				// after that alert window switch
				Alert promptAlert = driver.switchTo().alert(); // handling alert
				
				// enter value
				promptAlert.sendKeys("7");
				Thread.sleep(2000);
				
				// click on OK
				promptAlert.accept();
				Thread.sleep(2000);
				
				WebElement bookTickets = driver.findElement(By.cssSelector("input[type = 'submit']"));
				
				// click on the link
				bookTickets.click();
				Thread.sleep(2000);

				// after that alert window switch
				Alert confirmAlert = driver.switchTo().alert(); // handling alert
				
				// Data of the alert is 
				System.out.println("Alert : "+confirmAlert.getText());
				Thread.sleep(2000);
				
				// click on OK
				confirmAlert.accept();
				

	}

}
