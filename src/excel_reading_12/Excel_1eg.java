package excel_reading_12;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_1eg {
// 
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{   // create obj of file class and pass the excel file fath with ext.
		File myfile = new File("E:\\Excel123\\Book1.xlsx");
		
// then call workbookfactory class with create methode etc.
        String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(name);
        String sname = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
        System.out.println(sname);
        double year = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
        System.out.println(year);
        double tr = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
        System.out.println(tr);
       System.out.println(WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue());
	}

}
