package demo;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
  
	// Before Group
	@BeforeGroups(groups = {"group-1"})
	public void beforeGroupOne() {
		System.out.println("Before Group - 1 Test methods");
	}
	
	// After Group
	@AfterGroups(groups = {"group-1"})
	public void afterGroupOne() {
		System.out.println("After Group - 1 Test methods");
	}
	
	@Test(groups = {"group-1"})
	public void methodOne() {
		System.out.println("Group - 1 Test method : One");
	}
	
	@Test(groups = {"group-1"})
	public void methodTwo() {
		System.out.println("Group - 1 Test method : Two");
	}
	
	@Test(groups = {"group-2"})
	public void methodThree() {
		System.out.println("Group - 2 Test method : Three");
	}

}
