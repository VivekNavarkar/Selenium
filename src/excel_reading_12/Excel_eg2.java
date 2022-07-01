package excel_reading_12;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_eg2 {
// calling the seprate  method with its return type.
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	File myfile  = new File("E:\\Excel123\\Book1.xlsx");
	
	Workbook book = WorkbookFactory.create(myfile);// WorkbookFactory final class calling with create ststic method
	Sheet sheet = book.getSheet("Sheet1");// calling getsheet method and pass sheetname--sheet1 as an argu.
	Row row = sheet.getRow(0);//calling getrow method with row index num as reference
	Cell cell = row.getCell(1);// calling getcell method with column/cell index num reference.
    CellType type = cell.getCellType();// to find RT of data in the sheet used getcelltype methode
	System.out.println(type);// String
	String value = cell.getStringCellValue();// calling getStringCellValue method
	System.out.println(value);// 
	}

}
