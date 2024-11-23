package demo;
import org.testng.annotations.Test;

public class TestNGPriorityExample {

    @Test(priority = 1, description = "This is the first test with highest priority.")
    public void testMethod1() {
        System.out.println("Executing Test Method 1");
    }

    @Test(priority = 2, description = "This is the second test with medium priority.")
    public void testMethod2() {
        System.out.println("Executing Test Method 2");
    }

    @Test(priority = 3, description = "This is the third test with lowest priority.")
    public void testMethod3() {
        System.out.println("Executing Test Method 3");
    }
}
