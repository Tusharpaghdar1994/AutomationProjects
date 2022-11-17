package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeExp1 {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=16arif23uq15q");
		
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals("actiTIME - Login"))
		{
				System.out.println("login page title matched ! test case pass");
		}
		else
		{
			System.out.println("login page title matched ! test case fail");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals("actiTIME - Home Page"))
		{
				System.out.println("Home page title matched ! test case pass");
		}
		else
		{
			System.out.println("Home page title matched ! test case fail");
		}
		Thread.sleep(4000);
		driver.close();
	}
}
