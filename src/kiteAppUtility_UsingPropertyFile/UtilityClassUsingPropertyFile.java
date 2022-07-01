package kiteAppUtility_UsingPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClassUsingPropertyFile 
{
  public static void takeScreenShot( WebDriver driver) throws IOException 
  {
	 File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   // to Takes Multiple ScreenShot used method RandomString.make() and creat its refe variable used in file dest.path
	 String Random = RandomString.make(5);
		   
	 File destination =  new File("F:\\ScreenShot\\multiples"+Random+".png");
  // add refe variable random in path name"+random+"png"
		   
	 FileHandler.copy(Source, destination);
  }
  public static String readDataFromFile(String key) throws IOException
  {
	  Properties prop = new Properties();
	  FileInputStream myprop = new FileInputStream("C:\\Users\\Windows 10\\eclipse-workspace\\Selenium\\TestDataFile.properties");
	  prop.load(myprop);
	  String value = prop.getProperty(key);
	  return value;
  }
  public static void implicitWait(WebDriver driver,int timeUnit)
  {
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
  }
}
