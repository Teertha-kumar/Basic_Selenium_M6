package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal_frames {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://snapdeal.com/");
		WebElement SignIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(SignIn).perform();
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("1234567");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("dfdfd");
		
		
	}

}
