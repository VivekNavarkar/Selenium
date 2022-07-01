package kite_withExcel_15;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 
{
// by using inner and outer for loop
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		//1.first we open url in selenium.
		   System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://kite.zerodha.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	 // create file object and pass excel file location. 
	       File myfile = new File("E:\\Excel123\\Book1.xlsx");
	       Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
	       ArrayList<String> al= new ArrayList<String>();
	       int totalrow = mysheet.getLastRowNum();
	       int totalcell = mysheet.getRow(totalrow).getLastCellNum()-1;
	      for(int i=0;i<=totalrow;i++) 
	      {
	       for(int j=0;j<=totalcell;j++) {
	       String Values = mysheet.getRow(i).getCell(j).getStringCellValue();
	       al.add(Values);}
	       
	//2.to calling nonstatic method first we create object of that class.
	   //A.login page method calling
	       LogInPage loginpage = new LogInPage(driver);
	       loginpage.sendUserId(al.get(0));
	       loginpage.sendPassword(al.get(1));
	       loginpage.clickOnLoginButton();
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	       
	   //B.pin page method calling
	       PinPage pinpage = new PinPage(driver);
	       pinpage.sendPin(al.get(2));
	       pinpage.clickOnContinueButton();
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	       
	   //C.Homepage method calling
	       HomePage Hm = new HomePage(driver);
	       // now check the test case of actual result with expected result of username.
	       Hm.validateUserId(al.get(0));
	       Hm.clickonUseridbutton();
	       Thread.sleep(1000);
	       Hm.clicOnLogoutButton();
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	       
	   //D.logout page method calling
	       Logout l=new Logout(driver);
	       l.clicOnChangeUser();
	       al.clear();
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	       }
	}
}
