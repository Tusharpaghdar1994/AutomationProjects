package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	@Test(priority = 1)
	public void loginMethod() 
	{
		Reporter.log("Login Method...",true);  
	}
	@Test(priority = 2)
	public void createUsers() 
	{
		Reporter.log("Create USers Method...",true);  
	}
	@Test(priority = 3)
	public void logoutMethod() 
	{
		Reporter.log("Logout Method...",true);  
	}


}
