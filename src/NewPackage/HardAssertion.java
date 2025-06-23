package NewPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void assertEquals(){
	 
		Assert.assertEquals("assert will pass","assert will pass","error");		 
		System.out.println("This line is executed because assertEquals.");
		 
		Assert.assertEquals("assertion","This assertion will fail");		 
		System.out.println("This line will not be executed.");
	}
	
	@Test
	public void assertNotEquals(){
		Assert.assertNotEquals("This assertion will pass","Since the " + "expected and actual result do not match");
		 
		System.out.println("This line is executed.");
	}
	
	@Test
	public void assertFalse(){
		Assert.assertFalse(3<5,"will fail");
		System.out.println("assertFalse" );
	}
	
	@Test
	public void assertTrue(){
		Assert.assertTrue(3<5);
		System.out.println("assertTrue");
	}
	
	@Test
	public void assertNull(){
		Assert.assertNull(null);
		System.out.println("assertNull will pass");
	}
	
	@Test
	public void assertNotNull(){
		Assert.assertNotNull(5);
		System.out.println("assertNotNull have passed");
	}

}
