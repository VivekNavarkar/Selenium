package framework_Pom_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage_kite 
{
//1.Find variable
	@FindBy(id = "pin")  private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
//2.create parametric Constrctor and calling pagefactory calss with init method
	public PinPage_kite( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//3.create methode for utilize variable. 
	public void sendPin()
	{
		pin.sendKeys("150995");
	}
	 public void  clickOnContinueButton()
	{
		continueButton.click();
	}
//4.program run in test class.
}
