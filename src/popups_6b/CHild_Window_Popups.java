package popups_6b;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHild_Window_Popups {
	 // 1.We can inspect elements present in popup.
	 //2.This popup will contain address field(url),maximize,minimize and close options.
	
    public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");//open url 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("NewWindow")).click();//and click on popus window button to open new window
		Thread.sleep(2000);
		
		String mainpageid = driver.getWindowHandle();// 1.find window id of main page window create refe.variable.
		System.out.println(mainpageid);
		
		Set<String> childid = driver.getWindowHandles();//2. find widow id for all window open in webpage.
		System.out.println(childid);
		
	 //3.all ids are received in set we creat array list object for calling get methods for get window id.
	    ArrayList<String> array = new ArrayList<String>(childid); 
	      
		/* By Using For Loop
		 for(int i=0;i<=childid.size()-1;i++)
		{
			System.out.println(array.get(i));
		}*/
		String mainid = array.get(0);// create refe variable of main id for gat window id'. 
		String Child1id = array.get(1);//create refe variable of child id for gat window id'
		Thread.sleep(2000);
	//4.to switch to child page
		driver.switchTo().window(Child1id);// switch to child window
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("the7-search")).sendKeys("vivek");
		driver.close();// close the child window
	     Thread.sleep(1000);
	     driver.switchTo().window(mainid);// switch to main window
      }
}
