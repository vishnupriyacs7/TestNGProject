package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GoogleSearch_DP {
	WebDriver driver;  
	@BeforeMethod
	public void setUp() {
      	  System.out.println("Start test");
      	  driver = new EdgeDriver();
      	  String url = "https://www.google.com";
      	  driver.get(url);
      	  driver.manage().window().maximize();
    }  	
	
	@Test(dataProvider ="search-data", dataProviderClass=DataProvider_inherit.class)
	public void search(String keyWord){
      	WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
      	searchBox.sendKeys(keyWord);
      	Reporter.log("Keyword entered is : " +keyWord);
      	searchBox.sendKeys(Keys.ENTER);
      	Reporter.log("Search results are displayed.");
	}  
	
	@AfterMethod
	public void burnDown() throws InterruptedException{
		Thread.sleep(2000);
      	driver.quit();
	}

}
