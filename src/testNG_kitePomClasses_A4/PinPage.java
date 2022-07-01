package testNG_kitePomClasses_A4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
	//1.Find variable
		@FindBy(id = "pin")  private WebElement pin;
		@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	//2.create parametric Constrctor and calling pagefactory calss with init method
		public PinPage( WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	//3.create methode for utilize variable. 
		public void sendPin(String PIN)
		{
			pin.sendKeys(PIN);
		}
		 public void  clickOnContinueButton()
		{
			continueButton.click();
		}

}
