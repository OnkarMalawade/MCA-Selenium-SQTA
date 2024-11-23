package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

    private WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) throws Exception {
       if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "G:\\Selenium_setup\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "G:\\Selenium_setup\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
  		  throw new Exception("Incorrect Browser");
  	  }
    }

    @Test
    public void testHomePage() {
        driver.get("https://www.google.co.in");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertTrue(title.contains("Example Domain"), "Page title does not match expected value.");
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
