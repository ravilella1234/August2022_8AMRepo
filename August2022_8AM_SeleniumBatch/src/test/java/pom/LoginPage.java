package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{	
	@FindBy(xpath="//a[contains(text(),'Sign in')]") public WebElement signIn ;
	@FindBy(id="email") public WebElement customerEmail;
	@FindBy(id="passwd") public WebElement customerPassword;
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]") public WebElement submitLogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]") public WebElement getError;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerLogin()
	{
		signIn.click();
		customerEmail.sendKeys("qatest8378387@gmail.com");
		customerPassword.sendKeys("password");
		submitLogin.click();
	}
	
	public String verifyLoginError() 
	{
		return getError.getText();
	}

}
