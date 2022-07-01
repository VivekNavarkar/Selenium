package synchronaization_Wait_7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_Wait_implicit
{
	     /* 1. Implicit wait: 
		    Applicable: complete webpage
		  1 parameter: time value (seconds)
		    eg. 30sec 20sec 10sec release wait time*/


	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.discoveryplus.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	

	driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	}

}
