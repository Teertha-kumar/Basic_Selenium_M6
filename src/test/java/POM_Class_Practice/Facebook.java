package POM_Class_Practice;

import java.util.concurrent.TimeUnit;
import POM.Fb_Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Fb_Loginpage fbLogin= new Fb_Loginpage(driver);
		fbLogin.emailTextField("TEERTHA");
		fbLogin.passwordTextField("PUDI");
		fbLogin.loginButton();
	}

}
