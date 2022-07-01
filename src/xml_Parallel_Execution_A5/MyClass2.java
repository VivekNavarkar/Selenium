package xml_Parallel_Execution_A5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 
{   @Test
	public void mymethod1()
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://paytm.com/");
		  Reporter.log("myMethod1 is running", true);
		  
	  }
}
