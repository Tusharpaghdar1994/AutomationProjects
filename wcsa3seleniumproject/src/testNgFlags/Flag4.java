package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	@Test(invocationCount=10)
	public void verifyLoginButtonEnableDisableStatus() 
	{
		Reporter.log("Disabled !!",true);
	}
}
