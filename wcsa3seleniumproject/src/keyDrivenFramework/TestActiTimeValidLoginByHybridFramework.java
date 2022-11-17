package keyDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestActiTimeValidLoginByHybridFramework  extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();

		String validUsername = flib.readPropertyData(PROP_PATH, "username");
		driver.findElement(By.name("username")).sendKeys(validUsername);
		
		String validPassword = flib.readPropertyData(PROP_PATH, "password");
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
