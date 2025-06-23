package NewPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert softAssert = new SoftAssert();
	@Test
	public void hardAssertion(){
		Assert.assertEquals("pass","pass");
		System.out.println("hard assertion");
		softAssert.assertNull("assertion");
		System.out.println("Since the object under assertion" + " is not null, the assertion will fail. " + "This line will not be executed");
		softAssert.assertAll();
	}
	@Test
	public void softAssertion(){ 
		softAssert.assertNull("assertion");
		System.out.println("SoftAssertion");
//		softAssert.assertAll();
	}
}
