package POM;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class Fb_Loginpage 
{
@FindBy(id="email")
private WebElement emailTf;

@FindBy(xpath="//input[@id= 'pass']")
private WebElement passTf;

@FindBy(xpath="//button[@name= 'login']")
private WebElement loginBtn;

public Fb_Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void emailTextField(String value)
{
emailTf.sendKeys(value);
}

public void passwordTextField(String value)
{
passTf.sendKeys(value);
}

public void loginButton()
{
loginBtn.click();
}

public WebElement getEmailTf() {
	return emailTf;
}

public void setEmailTf(WebElement emailTf) {
	this.emailTf = emailTf;
}

public WebElement getPassTf() {
	return passTf;
}

public void setPassTf(WebElement passTf) {
	this.passTf = passTf;
}

public WebElement getLoginBtn() {
	return loginBtn;
}

public void setLoginBtn(WebElement loginBtn) {
	this.loginBtn = loginBtn;
}

}