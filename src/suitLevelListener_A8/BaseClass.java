package suitLevelListener_A8;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility_UsingPropertyFile.UtilityClassUsingPropertyFile;

public class BaseClass 
{
	 protected WebDriver driver;
	 {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	      driver = new ChromeDriver();
		  try 
		  {
			driver.get(UtilityClassUsingPropertyFile.readDataFromFile("URL"));
		  } 
		  catch (IOException e) 
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 }
		public void captureScreenshot( String TCname) throws IOException
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest= new File("F:\\ScreenShot\\multiples"+TCname+".png");
		
			org.openqa.selenium.io.FileHandler.copy(src, dest);
		}
		
}
