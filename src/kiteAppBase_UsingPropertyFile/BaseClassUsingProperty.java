package kiteAppBase_UsingPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility_UsingPropertyFile.UtilityClassUsingPropertyFile;

public class BaseClassUsingProperty 
{
	
  protected WebDriver driver;
  // browser setup
  public void openBrowser() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(UtilityClassUsingPropertyFile.readDataFromFile("URL"));
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
}
