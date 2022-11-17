package robotMethods;

import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://www.selenium.dev/");	    
	    WebElement scr = driver.findElement(By.linkText("Learn More"));
	    
	    Actions act = new Actions(driver);
		act.contextClick(scr).perform();	
		
	    Robot robot = new Robot();
	
	    for(int i=1;i<=6;i++)
	    {
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
	    }
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		 
		Thread.sleep(8000);
		driver.close();		 	    
	}
}
