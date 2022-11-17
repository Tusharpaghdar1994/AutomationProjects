package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(enabled = false)
  public void createUser() 
  {
		Reporter.log("Creating USer...",true);
  }
  @Test(enabled = true)
  public void login() 
  {
		Reporter.log("Login...",true);
  }
}
