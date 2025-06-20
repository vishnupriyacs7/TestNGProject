package NewPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstTestNGClass {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public WebDriver driver ;
 	 	
	  @Test
	  public void verifyHomepageTitle() {	   		  	
	  	String expectedTitle = "Welcome: Mercury Tours";
	  	String actualTitle = driver.getTitle();
	      
	  	Assert.assertEquals(actualTitle, expectedTitle);
	  }

  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.get(baseUrl);
	  }
	
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}
