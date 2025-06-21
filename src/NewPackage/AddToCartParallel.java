package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import NewPackage.Parallel1;

public class AddToCartParallel extends Parallel1 {
	@Test
    public void addItemToCart() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Samsung Galaxy S24");
        searchBox.submit();

 
        System.out.println("Title" + driver.getTitle());
        System.out.println(" Thread: " + Thread.currentThread().getId());
    }
}
