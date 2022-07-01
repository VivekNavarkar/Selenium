package framework_Pom_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*POM class:
 POM class depends on webpage present in an application.
 For each webpage pom class will be created, no of POM class depends on no of webpages present in an application.
 In each POM class D.M./variable are created in encapsulation concept by using pagefactory.
 No of D.M. created in POM class will depend on no of elements present in a webpage.
 Each declared D.M. should initialized & utilized in POM class.*/

public class Homepage_AB 
{
//1.Find Variabl
	@FindBy(xpath = "//a[text()='V282235 ']") private WebElement Dropdown;
	@FindBy(xpath = "//a[text()='Logout']") private WebElement  logout;
	
	
//2.create constrctor
	public Homepage_AB(WebDriver driver)
	{
      PageFactory.initElements(driver,this);
	}

	
//3.crete method to perform action

	public void checkDropdownValue()
	{
		String actualDropDownValue = Dropdown.getText();
		System.out.println(actualDropDownValue);
		String expectedDropdownValue = "V282235";
		if(actualDropDownValue==expectedDropdownValue)
		{
			System.out.println("Value is matchimg TC is Passed");
		}
		else
		{
			System.out.println(" Value is not matching TC is Failed ");
		}

	    
	}
	
	public void SelectLogoutButton() throws InterruptedException
    {   Dropdown.click();
        Thread.sleep(500);
    	logout.click();
    }

}
