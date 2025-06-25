package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionTask {
WebDriver driver;
	
    @BeforeMethod
    public void setUp() {        
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testLoginAndAddToCart() throws InterruptedException {
        // Step 1: Log in with valid credentials
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        Thread.sleep(5000);
        
        //step 2 : find a product
        WebElement productsHeader = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        Assert.assertTrue(productsHeader.isDisplayed(), "product failed!");
        
        Thread.sleep(5000);

        // Step 3: Add a product to the cart
        WebElement firstProductAddToCartButton = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        firstProductAddToCartButton.click();
        
        Thread.sleep(5000);

        // Step 4: Verify the product is in the cart
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_badge"));
        String cartItemCount = cartIcon.getText();
        Assert.assertEquals(cartItemCount, "1", "Product not added to cart!");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after each test
        driver.quit();
    }
}
