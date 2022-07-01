package webTable_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_webtable 
{

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/web-table-element.php");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
    // find total row and cell in the table 
	     List<WebElement> tablerow = driver.findElements(By.xpath("//table//thead/tr/th"));// row 
	      for(WebElement t:tablerow)
	      {
	    	  System.out.print(t.getText()+" ");
	      }
	      System.out.println();
	      List<WebElement> totalcell = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));//cell
	      for(WebElement tt:totalcell)
	      {
	    	 System.out.print(tt.getText()+" ");
	      }
	      System.out.println();
	}

}
