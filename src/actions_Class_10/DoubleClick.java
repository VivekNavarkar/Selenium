package actions_Class_10;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        Actions a = new Actions(driver);  
        WebElement myele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        a.doubleClick(myele).perform();
        Alert al = driver.switchTo().alert();
        al.accept();
	}

}
