package oprationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		driver.findElement(By.xpath("//span[.='My Info']")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		driver.findElement(By.xpath("(//div[.='Indian'])[4]")).click();
		 //Select sel = new Select(element);
		 //sel.selectByVisibleText("Indian");
		//Thread.sleep(4000);
		//driver.close();

	}

}
