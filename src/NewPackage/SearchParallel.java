package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import mypackage.Parallel1;

public class SearchParallel  extends Parallel1  {
	@Test
    public void searchByProductName() {
        WebElement searchBox = driver.findElement(By.name("q")); 
        searchBox.sendKeys("iPhone 15");
        searchBox.submit();

        System.out.println("google Search " + Thread.currentThread().getId());
    }

    @Test
    public void searchByCategory() {
    	WebElement searchBox = driver.findElement(By.name("q"));         
    	searchBox.sendKeys("scope india technopark");
        searchBox.submit();

        System.out.println("google Search " + Thread.currentThread().getId());
    }
}
