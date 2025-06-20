package NewPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTestNG {
	WebDriver driver;

    // Method 1: Open Browser and Initialize WebDriver
    @Test(priority = 1)
    public void openBrowser() {
        driver = new ChromeDriver(); // Initialize ChromeDriver before any tests
    }

    // Method 2: Launch Google.com
    @Test(priority = 2)
    public void launchGoogle() {
        driver.get("http://www.google.co.in");
    }

    // Method 3: Perform a search using "Facebook"
    @Test(priority = 3)
    public void performSearchAndClick1stLink() {
        driver.findElement(By.name("q")).sendKeys("Facebook"); // Use 'name' for search input
        driver.findElement(By.name("q")).submit(); // Submit the search form
    }

    // Method 4: Verify Google search page title
    @Test(priority = 4)
    public void FaceBookPageTitleVerification() {
        // Wait for the title to contain 'Facebook - Google Search'
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Facebook - Google Search"));
        
        // Assert that the page title contains 'Facebook'
        Assert.assertTrue(driver.getTitle().contains("Facebook - Google Search"));
    }

    // Method to close the browser after all tests are completed
    @Test(priority = 5)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit(); // Close the browser after tests
        }
    }
 
}
