package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Xpath1 
{
	public static void main(String [] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("TEERTHA");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("TEER");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.close();
		
}
}