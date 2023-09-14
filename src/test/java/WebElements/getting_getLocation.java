package WebElements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getting_getLocation {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		Point coordinates=ele.getLocation();
		System.out.println(coordinates.getX());
		System.out.println(coordinates.getY());
	}

}
