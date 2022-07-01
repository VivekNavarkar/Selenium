package testNG_kitePomClasses_A4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
   @FindBy(xpath = "//a[@class='remove text-xxsmall']")  private WebElement changeuser;
   
   public Logout(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void clicOnChangeUser() 
   {
	   changeuser.click();
   }
}
