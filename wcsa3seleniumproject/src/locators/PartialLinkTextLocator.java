package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Testing/htmldocuments/link.html");
		
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("launch")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
