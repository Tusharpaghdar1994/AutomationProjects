package takeScreenShotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfWebElement {
	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/");
	
		WebElement webElement = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
		File src = webElement.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/WebElement.png");
		Files.copy(src, dest);

		Thread.sleep(3000);
		driver.close();	
	}

}
