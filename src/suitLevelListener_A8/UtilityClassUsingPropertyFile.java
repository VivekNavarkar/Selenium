package suitLevelListener_A8;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class UtilityClassUsingPropertyFile 
{
 
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
