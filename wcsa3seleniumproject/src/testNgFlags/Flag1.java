package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "This Method Helps to login to the ActiTime Application")
  public void loginToActiTime() 
  {
	Reporter.log("loggin in...............",true);
  }
  
  @Test(description = "This Method Used is used to perform logout ActiTime Application")
  public void logoutOfActiTime() 
  {
	Reporter.log("loggin out...............",true);
  }
}
