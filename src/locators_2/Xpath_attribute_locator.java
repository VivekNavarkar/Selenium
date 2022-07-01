package locators_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_attribute_locator 
{

	 public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");//creat path of chrome driver
        WebDriver driver = new ChromeDriver();// create object of chrome driver with web driver reference.
        
      // driver.get("https://vctcpune.com/selenium/practice.html");
        driver.get("https://www.facebook.com/");// to get link on browser
        
      //driver.findElement(By.xpath("//input[@ type ='radio']")).click();
      //driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

       // driver.findElement(By.xpath("//input[@name='email']")).click();// click is show the location of element on webpage
        
     // findelement method from webdriver in that we took xpath locator from By class which is static method
     //syntax of xpath--(By.xpath("//tagname[@attribute='attribute values']");
        
        Thread.sleep(200);
        //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("viv");
        Thread.sleep(200);
      //  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("new");
        Thread.sleep(200);
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        

	}
}