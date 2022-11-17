package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(1000);
		driver.findElement(By.id("usernameField")).sendKeys("tusharpaghadar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwordField")).sendKeys("9979679441");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']")).click();
		Thread.sleep(8000);
		driver.close();

	}

}
