package excel_reading_12;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Eg3
{
//  if you read a particular row in the excel sheet 
   public static void main(String[] args) throws EncryptedDocumentException, IOException 
   {
	File myfile = new File("E:\\Excel123\\Book1.xlsx");
	Sheet MySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	for(int i=0;i<=2;i++) // static coding 
	{
		String v = MySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.print(v+" ");
	}
      System.out.println();
      
      int totalrownum = MySheet.getLastRowNum();
      // to find total row in the table start from 0 index.
      System.out.println(totalrownum);
      short totalcellnum = MySheet.getRow(0).getLastCellNum();
      // to find total cell in the table start from 1 index.
      System.out.println(totalcellnum);
      int totalcell = totalcellnum-1;// total cell is 3-1=2
      
      for(int i=0;i<=totalcell;i++)//dynamic coding
      {
    	 String val = MySheet.getRow(0).getCell(i).getStringCellValue();
    	 System.out.print(val+" ");
      }
    
      System.out.println();
   } 

}
