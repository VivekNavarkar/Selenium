package kite_withExcel_15;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// paramitrazation means calling test data from excelsheet.
public class TestClass
{
	public static  void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
//1.first we open url in selenium.
	   System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://kite.zerodha.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//2.create file object and pass excel file location. 
       File myfile = new File("E:\\Excel123\\Book1.xlsx");
       Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
       int totalrow = mysheet.getLastRowNum();
       System.out.println(totalrow);
       
      for(int i=0;i<=totalrow;i++) 
      {
       String UN  = mysheet.getRow(i).getCell(0).getStringCellValue();
       String PWD = mysheet.getRow(i).getCell(1).getStringCellValue();
       String PIN = mysheet.getRow(i).getCell(2).getStringCellValue();
//3.to calling nonstatic method first we create object of that class.
   //A.login page method calling
       LogInPage loginpage = new LogInPage(driver);
       loginpage.sendUserId(UN);
       loginpage.sendPassword(PWD);
       loginpage.clickOnLoginButton();
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
       
   //B.pin page method calling
       PinPage pinpage = new PinPage(driver);
       pinpage.sendPin(PIN);
       pinpage.clickOnContinueButton();
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
       
   //C.Homepage method calling
       HomePage Hm = new HomePage(driver);
       // now check the test case of actual result with expected result of username.
       Hm.validateUserId(UN);
       Hm.clickonUseridbutton();
       Thread.sleep(1000);
       Hm.clicOnLogoutButton();
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
       
   //D.logout page method calling
       Logout lo=new Logout(driver);
       lo.clicOnChangeUser();
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	   }

	}

}
