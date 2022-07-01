package scrolling_8;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {
// this method is used to set size of window by using diamention of window in x,y direction
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
        Thread.sleep(1000);
        System.out.println(driver.manage().window().getSize());// this Method is used to get size of actul webpage
        Thread.sleep(1000);
        
         Dimension d = new Dimension(1000,300);  
         driver.manage().window().setSize(d);
         System.out.println(driver.manage().window().getSize());
	}

}
