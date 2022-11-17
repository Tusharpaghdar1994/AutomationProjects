package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShineJobLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/myshine/login/");

		driver.findElement(By.xpath("//*[@id=\"id_email_login\"]")).sendKeys("tpaghdar89@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='id_password']")).sendKeys("tushar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cndidate_login_widget\"]/form/ul[2]/li[4]/div/button")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
