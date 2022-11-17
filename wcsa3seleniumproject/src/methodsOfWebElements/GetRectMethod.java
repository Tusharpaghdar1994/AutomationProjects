package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/");
		
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		Rectangle rect = news.getRect();
		int h = rect.getHeight();
		int w = rect.getWidth();
		int xlocation=rect.getX();
		int ylocation = rect.getY();
		System.out.println("X : "+xlocation+" "+"Y : "+ylocation+" "+"Height : "+h+" "+"Width  : "+w);
		Thread.sleep(4000);
		driver.close();
	}
}
