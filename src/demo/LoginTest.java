package demo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    // DataProvider that supplies username and password combinations
    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][] {
            {"validUser", "validPass"},   // Valid credentials
            {"validUser", "wrongPass"},   // Incorrect password
            {"wrongUser", "validPass"},   // Incorrect username
            {"wrongUser", "wrongPass"}    // Both username and password are incorrect
        };
    }

    // Test method that checks the login status based on the provided username and password
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        // Simulated validation of credentials
        boolean isValidLogin = "validUser".equals(username) && "validPass".equals(password);

        if (isValidLogin) {
            System.out.println("Login successful for username: " + username);
            Assert.assertTrue(isValidLogin, "Login should be successful.");
        } else {
            System.out.println("Login failed for username: " + username);
            Assert.assertFalse(isValidLogin, "Login should fail.");
        }
    }
}

