package kiteAppPomClasses_UsingPropertyFile;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//1. Find Variable/Data Member
		@FindBy(xpath = "//span[@class='user-id']")  private WebElement userId;
		@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
		
	//2.create parametric constrctor
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	//3.Create methode to validate username
// now check the test case of actual result with expected result of username.
		public String getActulUserID() 
		{
			String actualUserID = userId.getText();
			return actualUserID;
			
		}
		
		/*public void validateUserId(String Expectedid) 
		{
			String actualUserId = userId.getText();
			String expectedUserId =Expectedid;
			if(actualUserId.equals(expectedUserId))
			{
				System.out.println(" User id is Matching TC is Passed");
			}
			else
			{
				System.out.println("User id is Not Matching TC is Failed");
			}
		}*/
		public void clickonUseridbutton() throws InterruptedException 
		{Thread.sleep(2000);
			userId.click();
		}
		public void clicOnLogoutButton() throws InterruptedException
		{
			
			Thread.sleep(3000);
			logoutButton.click();
		
		}
		
}
