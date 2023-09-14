package Popup;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class notification_popup {
	public static void main(String[] args)  {
		HashMap<String, Integer> contentStrings = new HashMap<String, Integer>();
		HashMap<String, Object> profiles = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		contentStrings.put("Notification", 2);
		profiles.put("managed_default_content_settings", contentStrings);
		prefs.put("Profile", prefs);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");
	}

}
