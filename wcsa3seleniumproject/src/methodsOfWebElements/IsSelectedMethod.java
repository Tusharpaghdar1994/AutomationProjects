package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=16arif23uq15q");
		
		WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
        boolean checkBox = element.isSelected();
        System.out.println(checkBox);
        Thread.sleep(4000);
        element.click();
        Thread.sleep(4000);
        boolean checkBox1 = element.isSelected();
        System.out.println(checkBox1);
        Thread.sleep(4000);
        driver.close();
    }	
}
