package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notification");
		co.addArguments("-start-maximized");
		WebDriver driver= new ChromeDriver(co);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class='confirm-btn']")).click();
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("ring");
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
