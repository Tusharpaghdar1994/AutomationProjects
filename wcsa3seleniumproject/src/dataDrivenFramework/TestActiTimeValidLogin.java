package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeValidLogin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=ek01crg3qj3no");
		Thread.sleep(3000);
		Flib flib = new Flib();
		
		String validUsername = flib.readExcelData("./data/testdata.xlsx", "validdata", 1, 0);
		driver.findElement(By.name("username")).sendKeys(validUsername);
		
		String validPassword = flib.readExcelData("./data/testdata.xlsx", "validdata", 1, 1);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.close();

	}
}
