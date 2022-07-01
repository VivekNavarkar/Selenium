package iframe_6a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_practise
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");//open main webpage 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// now focus shifted to main page  to iframe page,find iframe id or name in the code put in switch.frame() metohd
		driver.switchTo().frame("iframe-name");
		Thread.sleep(2000);
		// now find element to click on about us link on the iframe 
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		// this element is present on iframe(need to switch selenium focus from main page to frame)
		
		//driver.switchTo().parentFrame();// it is used to switch to focus child to parent frame page.
		driver.switchTo().defaultContent();// it is used to switch fouss any child frame page to main page. 
	    driver.findElement(By.xpath("//input[@value='Radio1']")).click();

	}

}
