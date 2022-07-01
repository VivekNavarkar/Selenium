package kiteAppPomClasses_UsingPropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	
//1.find Data Member/Variable/element on the webpage
		@FindBy(id ="userid")   private WebElement userid;
		@FindBy(id ="password") private WebElement password;
		@FindBy(xpath = "//button[text()='Login ']")  private WebElement login;
//2.create constractor initilize variable
		public LogInPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
//3.create Method to perform action	on variable
		public void sendUserId( String UserName)
		{
		    userid.sendKeys(UserName);
		}
		public void sendPassword(String Password)
		{
			password.sendKeys(Password);
		}
		public void clickOnLoginButton()
		{
			login.click();
		}
		
	

	

}
