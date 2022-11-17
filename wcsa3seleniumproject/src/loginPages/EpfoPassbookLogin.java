package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EpfoPassbookLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://passbook.epfindia.gov.in/MemberPassBook/Login");
		driver.findElement(By.cssSelector("button[id='reload-button']")).click();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("101320030199");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("tushar99796");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id='login']")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
