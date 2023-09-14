package Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement block1 = driver.findElement(By.xpath("//h1[text() = 'Block 1']"));
		WebElement block2 = driver.findElement(By.xpath("//h1[text() = 'Block 4']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[text() = 'Block 2']"));
		WebElement block4 = driver.findElement(By.xpath("//h1[text() = 'Block 3']"));
		
		Actions b = new Actions(driver);
		b.dragAndDrop(block1,block2).perform();
		
		
		Actions a = new Actions(driver);
		a.dragAndDrop(block3,block4).perform();
		
		
	}

}