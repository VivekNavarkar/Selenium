package actions_Class_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_Sendkyes 
{
    public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        WebElement text = driver.findElement(By.id("autocomplete"));
    // 1.by using webelement method.
      //  text.sendKeys("Vivek Navarkar");
    // 2.by using Actions class
        Actions a = new Actions(driver);
       // a.sendKeys(text,"Pune").perform();
         a.keyDown(text,Keys.SHIFT).sendKeys("Pune").build().perform();
    // Keydown method is used to press the Shift key on keybord and perform action on element
        a.keyDown(text, Keys.SHIFT).sendKeys("V").keyUp(Keys.SHIFT).sendKeys("ivek").build().perform();
    // Keyup method is used to Relese the Shift key on keybord and perform action on element
	}
  
}
