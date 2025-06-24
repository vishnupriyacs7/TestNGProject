package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginDP {
	@DataProvider(name = "login-data")
    public Object[][] loginData() {
        return new Object[][] {
            // User name, Password, Expected Result
            {"validUser@example.com", "validPassword", "Home Page",}, 
            {"invalidUser@example.com", "wrongPassword", "The email address you entered isn't connected to an account. Find your account and log in."},
            {"", "", "The email address or mobile number you entered isn't connected to an account. Find your account and log in."},
            {"", "validPassword", "The email address or mobile number you entered isn't connected to an account. Find your account and log in."},
            {"validUser@example.com", "", "The email address you entered isn't connected to an account. Find your account and log in."}
        };
    }

    @Test(dataProvider = "login-data")
    public void testLogin(String username, String password, String expectedMessage) {
    	WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/login");
        
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));
        
        
        
        // Enter the test data into the fields
        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        
        // Click the login button
        loginButton.click();
        
        // Wait for the page to load (use explicit waits in real cases, but for simplicity we are using sleep here)
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Check the outcome - typically you'd check for a page element that appears only after login
        String actualMessage = "";
       
            WebElement errorElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/div[2]"));
            actualMessage = errorElement != null ? errorElement.getText() : "Login failed"; 
        
            Reporter.log("Test failed for username: " + username);
        // Verify the result message
        Assert.assertEquals(actualMessage,expectedMessage, "Test failed for username: " + username);

        // Close the browser after the test
        driver.quit();
    }

}
