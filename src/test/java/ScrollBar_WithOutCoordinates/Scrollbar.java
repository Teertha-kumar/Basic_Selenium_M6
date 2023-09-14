package ScrollBar_WithOutCoordinates;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Point;
public class Scrollbar 
{
	public static void main(String[] args) throws Throwable 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://amazon.com/");
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		Point coordinates = career.getLocation();
		int x = coordinates.getX();
		int y = coordinates.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+ x + ","+ y +")");
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",career);
		
}
}