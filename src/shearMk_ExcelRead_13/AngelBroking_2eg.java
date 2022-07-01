package shearMk_ExcelRead_13;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngelBroking_2eg {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://trade.angelbroking.com/Login");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
         
        WebElement userid = driver.findElement(By.id("txtUserID"));
        WebElement userpwd = driver.findElement(By.id("txtTradingPassword"));
        WebElement signin = driver.findElement(By.id("loginBtn"));
        
        File myfile = new File("E:\\Excel123\\Book1.xlsx");
        Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
        String UN = sheet.getRow(0).getCell(0).getStringCellValue();
        String pwd = sheet.getRow(0).getCell(1).getStringCellValue();
        
        userid.sendKeys(UN);
        userpwd.sendKeys(pwd);
        signin.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        // now check actual and expected result
        WebElement Useridname = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[10]"));
        String actualUserId = Useridname.getText();
        String ExpectedResuldId=UN;
       
      
        if(actualUserId.equals(ExpectedResuldId)) 
        {
        System.out.println("User id is match test case is passed");	
        }
        else
        {
        	System.out.println("User id is not matching Test case is failed");
        }
        Useridname.click();
        Thread.sleep(1000);
        WebElement Logoutbutton = driver.findElement(By.xpath("//a[text()='Logout']"));
        Logoutbutton.click();
        driver.close();
        	}
      

	}


