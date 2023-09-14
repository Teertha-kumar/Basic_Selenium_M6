package Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class id_Name_LinkText_Partial 
{
	public static void main(String [] args) throws Throwable 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Teertha");
	driver.findElement(By.name("pass")).sendKeys("Teerthapassword");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Forgotten password?")).click();
	Thread.sleep(3000);
	driver.close();

	}
	}
