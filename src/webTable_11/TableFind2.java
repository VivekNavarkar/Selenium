package webTable_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFind2 {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	  // first find NO of Row(tr) and Column(th) in table
          List<WebElement> row = driver.findElements(By.xpath("//tr"));
          int totalrows = row.size();
          System.out.println("totalrows in table is "+totalrows);
          
          List<WebElement> column = driver.findElements(By.xpath("//th"));
          int totalcolumn = column.size();
          System.out.println("totalcolumn in table is "+totalcolumn);
      System.out.println("============================================================");
        //print table by using for loop
          for(int i=1;i<=totalrows;i++)// for row
          {
             for(int j=1;j<=totalcolumn;j++) // for column
             {
            	 if(i==1) 
            	 {    //find element of table row[tr] with column heading[th]
					String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(" |"+text+" ");
            	 }
            	 else
            	 {     // find element of table row[tr] with column data[td]
            		 String text1 = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
            		 System.out.print(" "+text1+" |");
            	 }
             
             }
             System.out.println();
          }
			
		}
	}


