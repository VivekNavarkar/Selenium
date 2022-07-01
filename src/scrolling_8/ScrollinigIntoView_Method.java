package scrolling_8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollinigIntoView_Method 
{
   // scrolingintoview method is used to scroll and find elements present on webpage.
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement MH = driver.findElement(By.id("mousehover"));
		JavascriptExecutor j = ((JavascriptExecutor)driver);
	
		j.executeScript("arguments[0].scrollIntoView(true);",MH);

	}

}
