package screenshot_5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class multipleScreenShot 
{
  public static void main(String[] args) throws InterruptedException, IOException
  {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	WebDriver  driver = new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().window().maximize();
	Thread.sleep(200);
	
	   File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// to Takes Multiple ScreenShot used method RandomString.make() and creat its refe variable used in file dest.path
	   String Random = RandomString.make(5);
	   
	   File destination =  new File("F:\\ScreenShot\\multipless"+Random+".png");
	   // add refe variable random in path name"+random+"png"
	   
	   FileHandler.copy(Source, destination);
	
	
  }
}
