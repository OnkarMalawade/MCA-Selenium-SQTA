package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AnnotationsTesting {
    // Before Starting the Suite Testing
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Method");
	}
	
	// After completing the Tests
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite Method");
	}
	
	// Before Each Test Section
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Each Test Method");
	}
	
	// After Each test section
	@AfterTest
	public void afterTest() {
		System.out.println("After Each Test Method");
	}
	
	// Before any of the Test Methods
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Each Class Method");
	}
	
	// After Each Class section
	@AfterClass
	public void afterClass() {
		System.out.println("After Each Class Method");
	}
	
	// Before any of the Method
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Each Method");
	}
		
	// After Each Method section
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Each Method");
	}
	
	// Test Methods
	@Test
	public void testOneMethod() {
		System.out.println("Test One Method");
	}
	
	@Test
	public void testTwoMethod() {
		System.out.println("Test Two Method");
	}
	
	@Test
	public void testThreeMethod() {
		System.out.println("Test Three Method");
	}
}
