package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/");
		
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		Point point = news.getLocation();
		int xlocation=point.getX();
		int ylocation = point.getY();
		System.out.println("X : "+xlocation+" "+"Y : "+ylocation);
		Thread.sleep(4000);
		driver.close();
	}
}
