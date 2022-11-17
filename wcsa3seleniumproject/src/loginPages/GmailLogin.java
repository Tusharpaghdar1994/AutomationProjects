package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1997273851%3A1665241167557100&continue=https%3A%2F%2Fmyaccount.google.com%2Fsecurity-checkup%3Fcontinue%3Dhttps%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%253Dsign_in_no_continue%2526pli%253D1&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		driver.findElement(By.cssSelector("input[name='identifier']")).sendKeys("tusharpaghadar@gmail.com");
		
		driver.findElement(By.cssSelector("button[class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234567890");
		
		//driver.findElement(By.cssSelector("div[class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(4000);
		
		driver.close();
	}

}
