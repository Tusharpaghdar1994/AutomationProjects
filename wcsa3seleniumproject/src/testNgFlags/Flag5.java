package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	@Test
	public void loginMethod() 
	{
		Reporter.log("Login Method...",true);  
	}
	@Test(dependsOnMethods="loginMethod")
	public void createUsers() 
	{
		Reporter.log("Create USers Method...",true);  
	}
	@Test(priority = 1)
	public void logoutMethod() 
	{
		Reporter.log("Logout Method...",true);  
	}

}
