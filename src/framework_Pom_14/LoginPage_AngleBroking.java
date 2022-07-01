package framework_Pom_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//The Selenium Framework is a code structure that makes code maintenance easy and efficient.
//Without frameworks, users may place the “code” and “data” at the same location which is neither reusable nor readable.
//Frameworks produce beneficial outcomes like increased code reusability, higher portability, reduced cost of script maintenance, better code readability, etc.
//1. Data Driven 2. Keyword Driven (BDD, Cucumber) whenThen 3.Hybrid

//Data Driven Framework in Selenium is a method of separating Test data from the test case.
//Once the Test data are separated from the test case, it can be easily modified for a specific functionality without changing the code. 
//It is used to fetch Test Data from external files like Excel, .csv, .xml or some database tables

//POM with page factory is DDframework
//POM Strictly follows encapsulation concept where.
//1. Data member should be declared globally with access level private using @findBy Annotation.
//2. Initialize within a constructor with access level public using pagefactory.
//3. Utilize within a method with access level public.
public class LoginPage_AngleBroking 
{
//1.create / find data members/Variable-->element present on the webpage take action on it
	
	@FindBy(id="txtUserID")  private WebElement UN; // find un element
	
	@FindBy(id="txtTradingPassword")  private WebElement PWD;// find psw element
	
	@FindBy(id="loginBtn")   private WebElement signinbutton;// find sign in element
// 2.create constrctor calling pagefactory.initelement method and pass(driver,this) as arguement
	public LoginPage_AngleBroking(WebDriver driver)
	{
		PageFactory.initElements(driver, this);// this is usd to call all GV 
	}
//3.create method perorm action on the find elements
	public void SendUserName() 
	{
		UN.sendKeys("V282235");
	}
	public void SendPWD()
	{
		PWD.sendKeys("Vivek95");
	}
	public void ClickOnSignInPage()
	{
		signinbutton.click();
	}
	
// create new test class to calling or Run this method
}
