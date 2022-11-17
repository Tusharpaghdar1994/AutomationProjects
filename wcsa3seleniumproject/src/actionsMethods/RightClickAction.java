package actionsMethods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///D:/Automation%20Testing/htmldocuments/multiselectdropdown.html");
		WebElement menu = driver.findElement(By.id("menu"));

		Actions act = new Actions(driver);
		act.contextClick(menu).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}

