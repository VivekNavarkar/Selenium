package popups_6b;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise_alerts 
{

	public static void main(String[] args) throws InterruptedException
    {

		   System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		   driver.manage().window().maximize();
		   Thread.sleep(1000);
		   driver.findElement(By.name("confirmalertbox")).click();
		   Thread.sleep(1000);
           Alert alt = driver.switchTo().alert();
           Thread.sleep(500);
           System.out.println(alt.getText());
           Thread.sleep(1000);
           alt.accept();
	}

}
