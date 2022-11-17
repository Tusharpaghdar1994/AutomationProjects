package assignmentNew;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkartWinHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("nothing phone 1");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[.='Nothing Phone (1) (White, 256 GB)'])[1]")).click();
		Thread.sleep(3000);
		Set<String> bothHandles = driver.getWindowHandles();
		for(String handle:bothHandles)
		{
			if (!parentHandle.equals(handle))
			{
				driver.switchTo().window(handle);
			}
			else
			{

			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='12 GB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_10vWcL td-FUv WDiNrH']/descendant::div[text()='Remove']")).click();
		
	}
}
