package excel_reading_12;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_eg7 
{
// all table read in the excel sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("E:\\Excel123\\Book1.xlsx");
		
		for(int i=0;i<=7;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String v = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
				System.out.print(v+" ");
			}
			System.out.println();
		}

	}

}
