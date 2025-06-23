package NewPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void assertEquals(){
	 
		Assert.assertEquals("assert will pass","assert will pass","error");
		 
		System.out.println("This line is executed because assertEquals " + "passed since both the strings are same");
		 
//		Assert.assertEquals("assertion","This assertion will fail");
//		 
//		System.out.println("This line will not be executed because " + "assertEquals fails both the strings are different."+ "Also the test/method will be declared failed");
	}
	
	@Test
	public void assertNotEquals(){
		Assert.assertNotEquals("This assertion will pass","Since the " + "expected and actual result do not match");
		 
		System.out.println("This line is executed because assertNotEquals" + " assertion pass for the given situation");
	}


}
