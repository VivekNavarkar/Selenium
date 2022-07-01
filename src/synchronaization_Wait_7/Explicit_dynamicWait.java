package synchronaization_Wait_7;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_dynamicWait 
{

	   /*Applicable: single element
	     1 parameter: time value(seconds)
	     2 parameter: Condition (isselected, isdisplayed, isenabled)*/

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		// creat obj of webdriverwait
		WebDriverWait w =new WebDriverWait(driver,Duration.ofMinutes(1));// thread
		// find element and creat ref variable
		WebElement v = driver.findElement(By.id("alertButton"));
	    // 
		w.until(ExpectedConditions.visibilityOf(v));
		
		v.click();
	    Alert alt = driver.switchTo().alert();
		  
	    alt.accept();
		
		
		
	   

	}

}
