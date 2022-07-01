package popups_6b;

import org.openqa.selenium.By;
//Popups are small or separate window which will be displayed when we perform action on any components present in a webpage.
//These popus can be handled by selenium directly, but sometimes we may need to use 3rd (Auto IT) party tools to handle these popups
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hiden_DivesionPopups
{

//Popups are small or separate window which will be displayed when we perform action on any components present in a webpage.

//These popups are colorful.
//We can inspect the elements present in pop up.
//As we can inspect element present in popup then using selenium we can handle it & no need to switch.
// eg. popup on flipkart
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");// open popups url
		driver.manage().window().maximize();
		Thread.sleep(500);
		//find the xpath of close buttin on popups page and click on close button. 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	  /*	
		// now we perform the work on main webpage--eg-we find mobiles in search bar, 
		Thread.sleep(500);
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//my budget is 20000 thousnds so select vlues in dropdown
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='_2YxCDZ']"));
	    Select s=new Select(dropdown);
	    s.selectByIndex(7);
	  */  
	    
	}

}
