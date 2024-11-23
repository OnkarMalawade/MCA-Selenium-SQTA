package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class RegressionTesting {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	@Test(priority = 1, groups = {"regression"})
	public void verifyPageTitle() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Welcome : Mercury Tours", "Page Title Not Exists");
	}
	@Test(priority = 2, groups = {"regression"})
	public void verifyLogin() {
		WebElement username = driver.findElement(By.name("userName"));
		  username.sendKeys("mercury");
		  WebElement password = driver.findElement(By.name("password"));
		  password.sendKeys("mercury");
		  WebElement submitBtn = driver.findElement(By.name("submit"));
		  submitBtn.click();
		  WebElement login = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		  String msg = login.getText();
		  Assert.assertEquals(msg, "Login Successfully", "Login Failed");
	}
	@AfterTest
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
}
