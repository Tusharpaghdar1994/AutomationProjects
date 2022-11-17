package keyDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoConstant {
	static WebDriver driver;
	//Open Browser
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		//browser from property file
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		//url from property file
		String url = flib.readPropertyData(PROP_PATH, "url");
		//choose browser
		if (browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}
		else
		{
			System.out.println("invalid browser name");
		}
	}
		//close browser
		public void tearDown()
		{
			driver.quit();
		}

}
