package demo;

import org.testng.annotations.Test;

// @Test(enabled=true)
public class EnabledTest {
  @Test(enabled=true)
  public void testMethodOne() {
	  System.out.println("Test Method One");
  }
  
  @Test(enabled=false)
  public void testMethodTwo() {
	  System.out.println("Test Method Two");
  }
  
  private void testMethodThree() {
	  System.out.println("Test Method Three");
  }
}
