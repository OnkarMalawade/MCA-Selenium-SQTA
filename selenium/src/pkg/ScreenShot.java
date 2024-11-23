package pkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Files;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// Setting Path to FireFox()
		System.setProperty("webdriver.gecko.driver","G:\\Selenium_setup\\geckodriver.exe");
					
		// Web driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		// Open Google WebPage
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		// setting takes Screen Shot
		TakesScreenshot srcShoot = ((TakesScreenshot)driver);
		
		// taking ScreenShot in file format
		File srcFile = srcShoot.getScreenshotAs(OutputType.FILE);
		
		// locating where screenshot saved
		System.out.println("Location of File : " + srcFile.getAbsolutePath());
		
		// Create new file
		File destFile = new File("G:/MCA-Selenium-STQA/Demo.png");
		
		// copy srcFile
		Files.copy(srcFile.toPath(), destFile.toPath());
		
		Thread.sleep(5000);
		driver.quit();
	}

}
