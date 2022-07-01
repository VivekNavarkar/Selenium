package excel_reading_12;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_eg5 
{
// if you read a particular cell/ column in the excel sheet 
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("E:\\Excel123\\Book1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		for(int i=0;i<=7;i++)// static coding for call cell value
		{
			System.out.print(mysheet.getRow(i).getCell(0).getStringCellValue()+" ");
		
		}
		System.out.println();
		
		int totalrow = mysheet.getLastRowNum();
		System.out.println(totalrow);
		
		short totalcell = mysheet.getRow(0).getLastCellNum();
		System.out.println(totalcell);
		int totalcellnum = totalcell-1;
		System.out.println(totalcellnum);
		//dynamic coding for call column / cell value
		for(int i=0;i<=totalrow;i++)
		{
			String v = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.print(v+" ");
		}
		System.out.println();
		
	}

}
