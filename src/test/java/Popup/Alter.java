package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter {

	public static void main(String[] args) throws Throwable  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-traning");
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(300);
		al.accept();

	}
}
