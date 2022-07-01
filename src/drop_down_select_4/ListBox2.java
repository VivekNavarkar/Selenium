package drop_down_select_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		 Thread.sleep(2000);
	 //1.Identify list box to be handled and store it in reference variable
	     WebElement Day = driver.findElement(By.name("birthday_day"));
	 //2.Create an object of Select class which will accept WebElement as argument/parameter
	    Select s1= new Select(Day);
	 //3. By using one of the select class methods we can select values form list box like
        // for print multiple values in the dropdown using for loop
	    for(int i=0;i<10;i++)
	    {    Thread.sleep(1000);
	    	s1.selectByIndex(i);
	    }
	   for(int i=10;i>0;i--)
	    {   Thread.sleep(1000);
	        s1.selectByIndex(i);
	    }
	       boolean Result = s1.isMultiple();
	       System.out.println("multiple selection is available result is "+Result);
    }

}
