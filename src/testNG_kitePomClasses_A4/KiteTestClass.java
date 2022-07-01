package testNG_kitePomClasses_A4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestClass
{// Declare variable of all classes and driver,mysheet.
	LogInPage login;
	PinPage pin;
	HomePage home; 
	Logout logout;
	WebDriver driver;
	  Sheet mysheet;
	
// By using TestNG Annotation we Design TestNG Test Class
    @BeforeClass
    public void launchBrowser() throws EncryptedDocumentException, IOException
    { 
    //1.first we open url in selenium.
    	 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://kite.zerodha.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
         login= new LogInPage(driver);
         home= new HomePage(driver);
         pin= new PinPage(driver);
         logout = new Logout(driver);
    //2.create file object and pass excel file location.
         File myfile = new File("E:\\Excel123\\Book1.xlsx");
          mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
    }
    @BeforeMethod
    public void loginToKite()
    {
    	login.sendUserId(mysheet.getRow(0).getCell(0).getStringCellValue());
    	Reporter.log("Sending Username", true);
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	login.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
    	Reporter.log("Sending Password",true);
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	login.clickOnLoginButton();
    	Reporter.log("Clicking on login button",true);
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	pin.sendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
    	Reporter.log("Sending PIN",true);
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	pin.clickOnContinueButton();
    	Reporter.log("Clicking on continue button",true);
    }
    @Test
    public void ValidateUserid()
    {
    	// expected username--> excell
    	// actual username???
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	String  expectedUserId= mysheet.getRow(0).getCell(0).getStringCellValue();
    	String actualUserId = home.getActulUserID();
    	Reporter.log("Validating user ID ",true);
    	Assert.assertEquals(expectedUserId, actualUserId,"Expected UserID and Actual UserID are not matching TC is FAILED");
    	Reporter.log("Expected UserID and Actual UserID are matching TC is PASSED", true);
    	
    }
    @AfterMethod
    public void logout() throws InterruptedException
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	home.clickonUseridbutton();
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	home.clicOnLogoutButton();
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	logout.clicOnChangeUser();
    	Reporter.log("Logging out.......",true);
    }
    
    @AfterClass
    public void closeBrowser()
    {   
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	Reporter.log("closing browser", true);
    	driver.close();
    }
}
