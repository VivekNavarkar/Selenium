package framework_Pom_14;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//  Test class:
//	Test class depends on no of Test cases written by manual Test engineer.
//	Test class will contains navigation steps & inputs that need to be given to the components/elements.
//	In test class data/inputs that can be given directly or through external source like Excel shee

public class TestClass_AB 
{
// create new test class to calling or Run pom page method
	public static void main(String[] args) throws InterruptedException 
	{
 // 1.first we open url in selenium.
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://trade.angelbroking.com/Login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
 // 2.to calling nonstatic method first we create object of that class.
     //1.login page method calling
        LoginPage_AngleBroking login= new LoginPage_AngleBroking(driver);
        login.SendUserName();
        login.SendPWD();
        login.ClickOnSignInPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
     //2.home page method calling 
       
        Homepage_AB select = new Homepage_AB(driver);
      
        select.checkDropdownValue();
        select.SelectLogoutButton();
        
     
	}

}
