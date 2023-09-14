package Synchronization;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 

{
public static void main (String [] args)
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,10);
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.id("email"));
	wait.until(ExpectedConditions.visibilityOf(ele));
	ele.sendKeys("hhgh");
	WebElement cli = driver.findElement(By.linkText("Forgotten password?"));
	wait.until(ExpectedConditions.elementToBeClickable(cli));
	cli.click();
	
	
	
	
}
}
