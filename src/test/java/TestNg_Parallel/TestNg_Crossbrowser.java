package TestNg_Parallel;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Crossbrowser 
{
	@Parameters({"browsername"})
	@Test
	public void facebook(String browser) 
	{
		WebDriver driver;
		if(browser.equals("Chrome"))
		{
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		
		else
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		driver.close();
	}
}
