package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		//driver.get("https://www.google.com");
		Dimension targetSize = new Dimension(500, 600);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(5000);
		driver.close();
	}

}
