package NewPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@DataProvider(name = "login-data")
	public Object[][] loginData() {
	    return new Object[][] {
	        {"user1", "password1"},
	        {"user2", "password2"},
	        {"user3", "password3"}
	    };
	}

	@Test(dataProvider = "login-data")
	public void testLogin(String username, String password) {
	    System.out.println("Testing login with Username: " + username + " and Password: " + password);
	}
}
