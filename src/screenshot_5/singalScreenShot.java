package screenshot_5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class singalScreenShot 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
      System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://vctcpune.com/");
      driver.manage().window().maximize();
      Thread.sleep(200);
//1.To take screenshot using selenium webdriver, we need to type cast driver object to TakesScreenshot interface.
 //2.Then we need call function getscreenshotAs(); there we need to pass the argument ---Outputtype.FILE
      // Creat Reference Variable source
      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
      // create new destination variable/obj for select the memory location path of SS by using file object reference
      File destinatin = new File("F:\\ScreenShot\\myscreenshot.png");// give file exetention \\name.png after copy address  
      // now calling screenshot by FileHandler.copy method
      
      FileHandler.copy(source, destinatin);
	}

}
