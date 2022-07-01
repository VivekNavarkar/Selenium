package drop_down_select_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_Ex// to select the 1 option /value from the dropdown by using select tagname.
{

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();//find dropbox element
	 Thread.sleep(2000);
 //1.Identify list box to be handled and store it in reference variable
     WebElement Day = driver.findElement(By.name("birthday_day"));
 //2.Create an object of Select class which will accept WebElement as argument/parameter
    Select s= new Select(Day);
 //3. By using one of the select class methods we can select values form list box like
 // i. selectByVisibleText: selectByVisibleText(String arg0)
    Thread.sleep(2000);
    s.selectByVisibleText("8");
 // ii. selectByIndex: selectByIndex(int arg0)
    Thread.sleep(2000);
    s.selectByIndex(11);//select index value 11 for 12 day 
 // iii. selectByValue: selectByValue(String arg0)
    Thread.sleep(2000);
    s.selectByValue("15");
    
    WebElement Month = driver.findElement(By.id("month"));
	Select s1= new Select(Month);
	Thread.sleep(1000);
	s1.selectByIndex(8);
	
	 WebElement Year = driver.findElement(By.id("year"));
	 Select s2 = new Select(Year);
	 Thread.sleep(1000);
	 s2.selectByValue("1995");
	
	}

}
