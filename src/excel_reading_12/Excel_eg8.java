package excel_reading_12;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_eg8 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("C:\\Users\\Windows 10\\Documents\\MYDAILYSHEDULE.xlsx");
       Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
       int totalrow = mysheet.getLastRowNum();
       int totalcell = mysheet.getRow(totalrow).getLastCellNum()-1;
       for(int i=0;i<=totalrow;i++)// outer for loop for row
       {
         for(int j=0;j<=totalcell;j++)// inner for loop for column
         {
        	 Cell cell = mysheet.getRow(i).getCell(j);
        	 CellType type = cell.getCellType();
        	 if(type==CellType.STRING)
        	 {
        		 System.out.print(cell.getStringCellValue()+"      ");
        	 }
        	 else if(type==CellType.NUMERIC)
        	 {
        		  System.out.print(cell.getNumericCellValue()+"    ");
        	 }
        	 else if(type==CellType.BOOLEAN)
        	 {
        		 System.out.print(cell.getBooleanCellValue()+"    ");
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

