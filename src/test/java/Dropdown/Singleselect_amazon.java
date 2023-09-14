package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Singleselect_amazon 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s = new Select(dropDown);
		s.selectByIndex(4);
		Thread.sleep(4000);
		s.selectByValue("search-alias=stripbooks");
		s.selectByVisibleText("Furniture");
		List<WebElement> values = s.getOptions();
		System.out.println(values.size());
		for(WebElement b : values)
		{
			System.out.println(b.getText());
		}
		driver.quit();
}
	
	
}