package excel_reading_12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_eg6 
{// to read the all data in excel sheet--by using for loop
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("E:\\Excel123\\Book1.xlsx");
// first we find the total row and cell in the excel sheet.
	    Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	    
	    int totalrow  = sheet.getLastRowNum();
		int totalcell = sheet.getRow(totalrow).getLastCellNum()-1;
		
		
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
