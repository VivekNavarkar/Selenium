package framework_Pom_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage_Kite 
{
//1.find Data Member/Variable
	@FindBy(id ="userid")   private WebElement userid;
	@FindBy(id ="password") private WebElement password;
	@FindBy(xpath = "//button[text()='Login ']")  private WebElement login;
//2.create constractor initilize variable
	public LogInPage_Kite(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
//3.create Method to perform action	on variable
	public void sendUserId()
	{
	    userid.sendKeys("HVX367");
	}
	public void sendPassword()
	{
		password.sendKeys("Vivek@123");
	}
	public void clickOnLoginButton()
	{
		login.click();
	}
	
}
