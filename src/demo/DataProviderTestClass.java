package demo;

import org.testng.annotations.Test;

public class DataProviderTestClass {
	@Test(dataProvider = "testdata", dataProviderClass = DataProviderClass.class)
	public void testMethod(String data) {
		System.out.println("Data is " + data);
	}
}
