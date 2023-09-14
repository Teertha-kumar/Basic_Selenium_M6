package Basicprograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Browser 
{  
public static void main(String [] args) throws Throwable 

{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
Thread.sleep(4000);
driver.close();

}
}
