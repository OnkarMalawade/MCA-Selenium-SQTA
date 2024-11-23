package demo;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority = 2)
  public void FirstMethod() {
	  System.out.println("This is First Method");
  }
  
  @Test(enabled = false)
  public void TwoMethod() {
	  System.out.println("This is Two Method");
  }
  
  @Test(priority = 1)
  public void ThreeMethod() {
	  System.out.println("This is Three Method");
  }
}
