package readPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeValidLoginByReadProp {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=ek01crg3qj3no");
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData("./data/config.properties", "username");
		driver.findElement(By.name("username")).sendKeys(validUsername);
		String validPassword = flib.readPropertyData("./data/config.properties", "password");
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
