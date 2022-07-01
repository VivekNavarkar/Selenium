package framework_Pom_14;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass_kite {
// to test POM(Page Object Module) classes we crete main method in test class
	 static public void main(String[] args) throws InterruptedException
	{
// 1.first we open url in selenium.
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
// 2.to calling nonstatic method first we create object of that class.
    //A.login page method calling
        LogInPage_Kite loginpage = new LogInPage_Kite(driver);
        loginpage.sendUserId();
        loginpage.sendPassword();
        loginpage.clickOnLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    //B.pin page method calling
        PinPage_kite pinpage = new PinPage_kite(driver);
        pinpage.sendPin();
        pinpage.clickOnContinueButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    //C.Homepage method calling
        HomePage_kite Hm = new HomePage_kite(driver);
        // now check the test case of actual result with expected result of username.
        Hm.validateUserId();
        Hm.clicOnLogoutButton();
	}

}
