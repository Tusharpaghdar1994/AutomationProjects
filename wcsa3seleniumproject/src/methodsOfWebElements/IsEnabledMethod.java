package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com/accounts/login/");
		//driver.findElement(By.name("username")).sendKeys("abcdvfb");
		//driver.findElement(By.name("password")).sendKeys("abcdvfb");

		WebElement element = driver.findElement(By.xpath("//button[@class='_acan _acap _acas']"));
		boolean button = element.isEnabled();
		System.out.println(button);
		Thread.sleep(4000);
		driver.close();
    
}
}