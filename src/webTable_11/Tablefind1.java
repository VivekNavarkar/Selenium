package webTable_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablefind1
{
   public static void main(String[] args) throws InterruptedException
   {  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://vctcpune.com/selenium/practice.html");
      driver.manage().window().maximize();
      Thread.sleep(1000);
      // find text/data 30 in table--  tr-row,td-data,th-row heading
      WebElement text = driver.findElement(By.xpath("//table//tr[2]//td[3]"));
      System.out.println(text.getText());
      // find tableheader/row in table
      List<WebElement> TH = driver.findElements(By.xpath("//table//th"));
		for(WebElement th:TH)
		{
			System.out.print(th.getText()+" |");
		}
		System.out.println();
    // find any row in table 
		List<WebElement> Row5 = driver.findElements(By.xpath("//table//tr[5]"));
		for(WebElement R:Row5)
		{
			System.out.print(R.getText()+" |");
		}
		System.out.println();
	// to know how many row in table
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
	    int totalrows = rows.size();
	    System.out.println("total no of row is "+totalrows);
	    for( WebElement R:rows)
	    {
	    	System.out.println(" ||"+R.getText()+" ||");
	    }
System.out.println("========================================================================");
	  //to know how many columns are there in table
	    List<WebElement> columns = driver.findElements(By.xpath("//th"));
	    int TotalNumOfColumns = columns.size();
	    System.out.println("total num of columns are "+TotalNumOfColumns);
	    for(WebElement c:columns)
	    {
	    System.out.print(c.getText()+" ||");
	    }
   }

}
