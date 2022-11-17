package pageObjectModel;

import java.io.IOException;

public class TestLogOutActiTime extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		//way1
		//String validUsername = flib.readPropertyData(PROP_PATH, "username");
		//String validPassword = flib.readPropertyData(PROP_PATH, "password");
		//lp.validLoginToActiTime(validUsername, validPassword);
		
		//way2
		lp.validLoginToActiTime(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		
		HomePage hp = new HomePage(driver);
		hp.logOutmethod();
		
		bt.tearDown();
	
	}
}
