package demo;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "testdata")
	  public Object[][] dataProviderMethod() {
	    return new Object[][] {
	      { "data One" },
	      { "data Two" }
	    };
	  }
}
