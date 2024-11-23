package demo;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Parameterization {
 
	@Parameters({"suite-param"})
	@Test
	public void parametersTestOne(String params) {
		System.out.println("Test Suite-Level Parameter: "+ params);
	}
	
	@Parameters({"test-two-params"})
	@Test
	public void parametersTestTwo(String params) {
		System.out.println("Test Two Suite-Level Parameter: "+ params);
	}
	
	@Parameters({"suite-param","test-three-param"})
	@Test
	public void parametersTestThree(String params, String params2) {
		System.out.println("Test Three Suite-Level Parameter: "+ params);
		System.out.println("Test Three Suite-Level Two Parameter: "+ params2);
	}
}
