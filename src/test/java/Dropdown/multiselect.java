package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiselect {

	public static void main(String[] args) throws Throwable 
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(dropDown);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("199");
		Thread.sleep(3000);
		s.deselectByValue("199");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		List<WebElement> list = s.getAllSelectedOptions();
		
		for(WebElement b : list)
		{
			System.out.println(b.getText());
		}
		driver.quit();
	}

}
