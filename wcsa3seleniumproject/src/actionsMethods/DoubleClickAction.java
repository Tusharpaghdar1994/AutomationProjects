package actionsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=ek01crg3qj3no");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.partialLinkText("Logo")).click();
		driver.findElement(By.id("uploadNewReportLogoOption")).click();
		
		WebElement target = driver.findElement(By.xpath("//input[@name='formCustomReportLogo.logo']"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();	
		Thread.sleep(5000);
		driver.quit();
		
	}
}
