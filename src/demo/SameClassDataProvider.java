package demo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class SameClassDataProvider {
	
	@DataProvider(name = "dataprovider")
	  public Object[][] dataProviderMethod() {
	    return new Object[][] {
	      { "data One" },
	      { "data Two" }
	    };
	  }
	
	@Test(dataProvider = "dataprovider")
	public void testMethod(String data) {
		System.out.println("Data is " + data);
	}
}
