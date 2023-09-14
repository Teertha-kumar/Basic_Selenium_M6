package Popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class child_popup {

	public static void main(String[] args) throws Throwable  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		String parent = driver.getCurrentUrl();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()='SkillRary Eassy'])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for(String b : child)
		{
			driver.switchTo().window(b);	
		}
		driver.findElement(By.id("mytext")).sendKeys("Teertha");
        Thread.sleep(3000);
        driver.switchTo().window(parent);
        driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
        
	}

}
