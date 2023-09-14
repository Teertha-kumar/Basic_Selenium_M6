package TestNg_Annotation;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

class Annotations {
	WebDriver driver;
	@BeforeMethod
	public void opening() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}

@AfterMethod
public void closing() {
	driver.close();
}

@Test
public void fb() {
	driver.get("https://facebook.com/");	
}
@Test

public void amazon() {
	driver.get("https://amazon.com/");
}
}
