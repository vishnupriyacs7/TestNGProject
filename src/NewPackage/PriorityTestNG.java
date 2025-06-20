package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTestNG {
	WebDriver driver;                  
   	
	@Test           	
	public void openBrowser() {                     	
    	driver = new ChromeDriver();                          
	}       	
            	
	@Test         	
	public void launchGoogle() {                            	
        driver.get("https://www.google.com/");             	                         
	}       	
                    
	@Test	
	public void peformSeachAndClick1stLink() {                      	
        driver.findElement(By.name("q")).sendKeys("Facebook");    
  
	}       	
                  	
//	@Test(priority=4)            	
//	public void FaceBookPageTitleVerification() throws Exception {                          	
//    	WebElement search =driver.findElement(By.name("q"));
//    	search.submit();
//    	Thread.sleep(3000);         	
//        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);                              
//	} 
}
