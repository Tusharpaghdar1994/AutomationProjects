package takeScreenShotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay2 {
	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/");
		//By upcast browser specific class reference variable to RemoteWebDriver(I)
		RemoteWebDriver rw = (RemoteWebDriver)driver;
		
		File src = rw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/ss_2.jpg");
		Files.copy(src, dest);

		Thread.sleep(3000);
		driver.close();	
	}
}
