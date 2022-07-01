package popups_6b;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_popups 
{/*   1. We cannot inspect the elements present in popup, does not have any colors is call alert popups
	  2. These popup will contain ok button or cancel button & Text.
	  3. Sometimes these type of popup also contains ? or ! symbol. */


	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
	   driver.get("https://demoqa.com/alerts");
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
	   driver.findElement(By.id("alertButton")).click();// click on alert popus button
	   
	  // 1.To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
        Alert alt = driver.switchTo().alert();
        
	  // 2.Alert is an interface which contains abstract methods like:
	  System.out.println( alt.getText());  //1.getText(): use to get text present in a alert popup.
			              alt.accept();    //2.accept(): use to click on ok button.
		                                   //3. dismiss(): use to click on cancel button.
			
    // now i want to click on click me second button on webpage for new alert popups 
     Thread.sleep(5000);
	 driver.findElement(By.id("timerAlertButton")).click();
     Thread.sleep(15000);
	 Alert alt2 = driver.switchTo().alert();
	 alt2.accept();
	 
	 


	}

}
