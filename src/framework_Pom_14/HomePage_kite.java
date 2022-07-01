package framework_Pom_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_kite 
{
//1. Find Variable/Data Member
	@FindBy(xpath = "//span[text()='HVX367']")  private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
//2.create parametric constrctor
	public HomePage_kite(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//3.Create methode to validate username
	
// now check the test case of actual result with expected result of username.
	public void validateUserId() 
	{
		String actualUserId = userId.getText();
		String expectedUserId = "HVX367";
		if(actualUserId==expectedUserId)
		{
			System.out.println(" User id is Matching TC is Passed");
		}
		else
		{
			System.out.println("User id is Not Matching TC is Failed");
		}
	}
	public void clicOnLogoutButton() throws InterruptedException
	{
		userId.click();
		Thread.sleep(200);
		logoutButton.click();
	
	}
}
