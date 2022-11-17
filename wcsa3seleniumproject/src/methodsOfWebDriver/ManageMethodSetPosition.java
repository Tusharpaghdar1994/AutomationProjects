package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		driver.get("https://www.google.com");
		Point setPos = new Point(500, 90);
		driver.manage().window().setPosition(setPos);
		Thread.sleep(4000);
		driver.close();
	}

}
