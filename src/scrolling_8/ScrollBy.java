package scrolling_8;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy
{
// scrollby method is used scroll the webpage up and down by using x,y coorinate.
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//for scrollby methode first we need to typecast the driver obj with javascriptexector interface. 
		JavascriptExecutor j = ((JavascriptExecutor)driver);// store in reference variable 
		//and call executeScript method pass argu("window.scrollBy(x,y)")
		j.executeScript("window.scrollBy(80,2000)");
	    Thread.sleep(1000);
		j.executeScript("window.scrollBy(80,-200)");
        Thread.sleep(1000);
        j.executeScript("window.scrollBy(4000,80)");

        Thread.sleep(1000);
        j.executeScript("window.scrollBy(400,80)");
	}

}

