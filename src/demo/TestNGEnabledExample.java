package demo;

import org.testng.annotations.Test;

public class TestNGEnabledExample {

    @Test(priority = 1, description = "This is the first test method and is enabled.")
    public void testMethod1() {
        System.out.println("Executing Test Method 1");
    }

    @Test(priority = 2, description = "This is the second test method and is enabled.")
    public void testMethod2() {
        System.out.println("Executing Test Method 2");
    }

    @Test(priority = 3, enabled = false, description = "This test method is disabled and will not be executed.")
    public void testMethod3() {
        System.out.println("Executing Test Method 3");
    }
}

