package Popup;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeProfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class notification_popupforchrome {

	public static void main(String[] args) {
		ChromeProfile profile = new ChromeProfile();
		profile.setpreference("dom.webnotifications.enabled",false);
		ChromeOptions options = new ChromeOptions();
		options.setprofile(profile);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");
	}

}
