package excel_reading_12;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_eg4 
{ 
// to read single data in the row/column in the sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile= new File("E:\\Excel123\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
// first we find data type in the sheet is witch one
        Cell cell = sheet.getRow(4).getCell(1);  // crete ref varible of cell
        CellType type = cell.getCellType();    // calling get cell type method and store in ref varible type
// by using if elseif we check which data type in the sheet  
        if(type==CellType.STRING)
        {
        	System.out.println(cell.getStringCellValue());// if data is string print if parts.
        }
        else if(type==CellType.NUMERIC)
        {
        	System.out.println(cell.getNumericCellValue());// if data is int/ numeric print elseif parts.
        }
        else if(type==CellType.BOOLEAN) 
        {
        	System.out.println(cell.getBooleanCellValue());// if data is boolean print elseif parts.
        }
        else if(type==CellType.BLANK)
        {
        	System.out.println("===");// if any blank space in the sheet 
        }
	}

}
