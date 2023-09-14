package Datadriven_programs;

import java.io.FileInputStream;

 
import java.util.Properties; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import io.github.bonigarcia.wdm.WebDriverManager;


public class Reading_propertiesfiles_browser 
{
	public static void main(String[] args) throws Throwable 
	{
		
Properties p = new Properties();
FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
p.load(fis);
String appURL = p.getProperty("url");
String user = p.getProperty("username");
String password = p.getProperty("password");
String browser = p.getProperty("browser");
WebDriver driver = null;
if(browser.equals("Chrome"))
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get(appURL);
driver.findElement(By.id("email")).sendKeys(user);
driver.findElement(By.id("pass")).sendKeys(password);
	}
}
