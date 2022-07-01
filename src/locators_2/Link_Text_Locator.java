package locators_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text_Locator 
{

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.tirumala.org/");
        
        driver.manage().window().maximize();
        Thread.sleep(10000);
       // driver.findElement(By.linkText("SriVenkateshwara Recording Project")).click();
        
       driver.findElement(By.partialLinkText("SriVenkateshwara")).click();
        
	}

}
