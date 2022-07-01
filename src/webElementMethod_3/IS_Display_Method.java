package webElementMethod_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_Display_Method 
{
//this method is used to verify the element present or not on the webpage,RT is Boolean,
	//if element present its return true, otherwise it return exception.
    public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
       WebElement textbox = driver.findElement(By.id("displayed-text"));
       boolean result =textbox.isDisplayed();
       System.out.println("element display status "+result);
       Thread.sleep(100);
       textbox.sendKeys("vivek");
       
       driver.findElement(By.id("hide-textbox")).click();
          boolean result2 = textbox.isDisplayed();
          System.out.println("element display status "+result2);
       
       
	}

}

