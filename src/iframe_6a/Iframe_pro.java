package iframe_6a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_pro 
{

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
      WebDriver driver =new ChromeDriver();
      driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");//main website
      Thread.sleep(200);
      driver.switchTo().frame("iframeResult");//go to sub webpage by id or name find in iframe tag in inspect page
    
      Thread.sleep(200);
      driver.findElement(By.xpath("//button[@type='button']")).click();
      Thread.sleep(200);
      driver.switchTo().parentFrame();//to reverse back to main webpage 
      Thread.sleep(200);
      driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();

      }

}