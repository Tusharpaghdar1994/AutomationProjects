package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[contains(@aria-label,'phone number')]")).sendKeys("Admin");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("admin23");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'6lti _4jy6 _4jy2')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tushar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patel");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("tusharpatel@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Tushar123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_day']/descendant::option[@value='7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_month']/descendant::option[@value='10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_year']/descendant::option[.='1994']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/descendant::input[@value='2']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("tusharpatel@gamil.com");
		Thread.sleep(4000);
		driver.close();		
	}

}
