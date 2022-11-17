package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartLogin {
	
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("tusharpaghadar@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abcdefghijk");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		driver.close();
		}
}
