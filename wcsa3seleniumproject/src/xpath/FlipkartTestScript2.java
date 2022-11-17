package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipkartTestScript2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Hp Laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(3000);
		String priceOf1stLaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println(priceOf1stLaptop + " is the price of the first Suggestion");
		driver.close();
	}	
}