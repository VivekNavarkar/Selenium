package shearMk_ExcelRead_13;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class angelbroking_eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://trade.angelbroking.com/Login");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
         
        WebElement userid = driver.findElement(By.id("txtUserID"));
        WebElement userpwd = driver.findElement(By.id("txtTradingPassword"));
        WebElement signin = driver.findElement(By.id("loginBtn"));
        
		File myfile= new File("E:\\Excel123\\Book1.xlsx");
		// first we find the total row and cell in the excel sheet.
			    Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
			    
			    int totalrow  = sheet.getLastRowNum();
				int totalcell = sheet.getRow(totalrow).getLastCellNum()-1;
				
			    String UN = sheet.getRow(0).getCell(0).getStringCellValue();
		        String pwd = sheet.getRow(0).getCell(1).getStringCellValue();
		        userid.sendKeys(UN);
		        userpwd.sendKeys(pwd);
		        signin.click();
		        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		// now by using for loop we find all data for row=i and cell=j
				for(int i=0;i<=totalrow;i++) // outer for loop for  row
				{
				   for(int j=0;j<=totalcell;j++) // inner for loop for cell 
				   {
					   // find data cell type in excel sheet
						Cell cell = sheet.getRow(i).getCell(j);
						CellType type = cell.getCellType();
			
						if(type==CellType.STRING)
						{
							System.out.print(cell.getStringCellValue()+" ");
						}
						else if(type==CellType.NUMERIC)
						{
							System.out.print(cell.getNumericCellValue()+" ");
						}
						else if(type==CellType.BOOLEAN)
						{
							System.out.print(cell.getBooleanCellValue()+" ");
						}
						else if(type==CellType.BLANK)
						{
							System.out.print("==");
						}
					}
				    System.out.println();
				 }
			}
		 
		


	}


