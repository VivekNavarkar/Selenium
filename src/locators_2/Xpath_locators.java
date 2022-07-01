package locators_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locators 
{

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
        
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.redbus.in/");
        
     //1 xpath attribute locators
       //driver.findElement(By.xpath("//input[@tabindex='3']")).click();

     //2 xpath text locators
        // driver.findElement(By.xpath("//a[text()='Help']")).click();
        
     //3 xpath contains text method
      //  driver.findElement(By.xpath("//a[contains(text(),'Hel')]")).click();
        
      //4 xpath  contains attribute method
      //  driver.findElement(By.xpath("//input[contains(@tabindex,'3')]")).click();
        
      //5 xpath by index
        driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).click();

	}

}
