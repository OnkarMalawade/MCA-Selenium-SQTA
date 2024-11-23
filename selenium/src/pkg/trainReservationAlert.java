package pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trainReservationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		//locate web page
		driver.get("");
		
		//locate trains hyperlink
		WebElement trains_link = driver.findElement(By.linkText("Trains"));


		//click on trains link 
		trains_link.click();

		//Alert window opens
		//switch from main window to alert window
		Alert simpleAlert = driver.switchTo().alert(); // simpleAlert


		//print alert text
		System.out.println("The	Text	inside	alert	window	is: "+simpleAlert.getText());

		//perform action on clicking on simple alert 
		Thread.sleep(2000);
		simpleAlert.accept(); 
		
		Thread.sleep(5000);


		//locate confirm details button
		WebElement confirmBtn = driver.findElement(By.cssSelector("input[value='Confirm Details']"));
		confirmBtn.click();


		//Alert window opens
		//switch from main window to alert window 
		Alert promt_Alert = driver.switchTo().alert();
		//enter input 
		promt_Alert.sendKeys("3");
		Thread.sleep(2000);
		promt_Alert.accept();
		Thread.sleep(5000);

		WebElement	book_Ticket = driver.findElement(By.cssSelector("input[value='Book Tickets']"));
		book_Ticket.click();
		//Alert window opens
		//switch from main window to alert window
		Alert Confimation_alert = driver.switchTo().alert();

		//text retrieve from confirmation Text
		System.out.println("The Text inside window: "+Confimation_alert.getText());
		Thread.sleep(2000);
		Confimation_alert.accept();

		Thread.sleep(5000);
		WebElement book_ticket_cancel = driver.findElement(By.cssSelector("input[value='Book Tickets']")); 
		book_ticket_cancel.click();

		Alert decline_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		decline_alert.dismiss();

	}

}
