package misc_9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsUnorderedList
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("honda");
		List<WebElement> search = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		// for print list 
		for(WebElement l:search) 
		{
			System.out.println(l.getText());
		}
		
        String expectedresult = "honda amaze";
        for(WebElement a:search)
        {
        	//System.out.println(a.getText());
        	String actualresult = a.getText();
        
       if(actualresult.equals(expectedresult))
       {
    	   a.click();
    	   break;
       }
     }
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
       driver.findElement(By.linkText("Images")).click();
     
        
	}

}
