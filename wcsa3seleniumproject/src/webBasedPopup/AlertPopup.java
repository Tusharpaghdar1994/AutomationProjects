package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("file:///D:/Automation%20Testing/htmldocuments/alert.html");
	Thread.sleep(2000);
	//popup is genrated
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Thread.sleep(2000);
	//control switched to alert popup
	Alert a1 = driver.switchTo().alert();
	// we get the text of alert popup
	String textOfPopup= a1.getText();
	//display text 
	System.out.println(textOfPopup);
	//hit the ok button
	a1.dismiss();//a1.accept
	//generates the NoAlertPresentException because the Alert is already handled
	a1.accept();
	
}

}
