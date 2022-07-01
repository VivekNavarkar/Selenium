package webElementMethod_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Is_SelectedMethod 
{
// it is used to verify the radio button/ checkbox is selected or not on the webpage.RT is boolean
    public static void main(String[] args) throws InterruptedException 
	{
    	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(200);
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		// checkbox.click();  if it is used its show result --checkbox is already selected
	     if(checkbox.isSelected())
	     {
	    	 System.out.println("checkbox is already selected ");
	     }
	     else 
	     {
	    	 System.out.println("selecting checkbox now");
	    	 checkbox.click();
	     
	    	if(checkbox.isSelected())
		    {
			   System.out.println("checkbox is selected now");
		    }
	    	else 
	    	{    // if any check box is not selected it is show else statment
	    		System.out.println("failed to select check box");
	    	}
		
		}
	}

}
