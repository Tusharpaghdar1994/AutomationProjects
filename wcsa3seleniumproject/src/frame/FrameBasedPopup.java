package frame;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class FrameBasedPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");		 
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(4000);
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Tushar");
		Thread.sleep(1000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("tusharpaghadar@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9979669451");
		Thread.sleep(7000);
		driver.close();
	}
}