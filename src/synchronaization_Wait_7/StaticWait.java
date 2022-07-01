package synchronaization_Wait_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Synchronization/wait: matching selenium test script speed with browser speed.
public class StaticWait
{
  /*Static wait/java wait. Wait time is fixed, irrespective of condition.Script will be hold for mentioned seconds.
   Eg: Thred.sleep();//7000ms 2500ms 4500ms*/

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(500);
	    driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	}

}
