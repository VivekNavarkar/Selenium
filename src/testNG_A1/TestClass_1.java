package testNG_A1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
//TestNG is a java unit framework use for writing/designing of Test classes. 
public class TestClass_1 
{
  @Test// multiple test annotation included in test class.
  public void mymethod()
  {
	   System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://kite.zerodha.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));  
  }
  @Test //test annotation is mandatary to execute the method.
  public void mymethod2()
  {
  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://vctcpune.com/selenium/practice.html");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  Reporter.log("MyMethod2 is running");// Reporter is class and log is ststic method. this report status is show in Report Card. 
  }
  @Test
   void mymethod3()// we can used method with any accsees specifires.
  {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.guru99.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  Reporter.log("Mymethode3 is running", true);
	  // Reporter is class and log is ststic method. this report status is show in Report card and also console when true. 
  }
}
