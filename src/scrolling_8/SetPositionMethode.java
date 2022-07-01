package scrolling_8;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethode
{
 // this method is used to set the position of window on the broser.
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());
        Thread.sleep(1000);
         Point p = new Point(300, 100);
        driver.manage().window().setPosition(p); 
	}

}
