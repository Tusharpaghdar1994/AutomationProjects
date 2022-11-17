package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///D:/Automation%20Testing/htmldocuments/multiselectdropdown.html");

		WebElement sdropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(sdropdown);
		for(int i=0;i<=5;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		sel.deselectByIndex(0);
		Thread.sleep(5000);
		driver.close();
	}
}
