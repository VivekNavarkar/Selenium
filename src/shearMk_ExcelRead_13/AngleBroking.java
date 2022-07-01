package shearMk_ExcelRead_13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngleBroking 
{
    public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://trade.angelbroking.com/Login");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
         
        WebElement userid = driver.findElement(By.id("txtUserID"));
        WebElement userpwd = driver.findElement(By.id("txtTradingPassword"));
        WebElement signin = driver.findElement(By.id("loginBtn"));
        
        userid.sendKeys("V282235");
        userpwd.sendKeys("Vivek95");
        signin.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        // now check actual and expected result
        WebElement Useridname = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[10]"));
        String actualUserId = Useridname.getText();
        String ExpectedResuldId="V282235";
        if(actualUserId.equals(ExpectedResuldId)) 
        {
        System.out.println("User id is match test case is passed");	
        }
        else
        {
        	System.out.println("User id is not matching Test case is failed");
        }
        Useridname.click();
        Thread.sleep(1000);
        WebElement Logoutbutton = driver.findElement(By.xpath("//a[text()='Logout']"));
        Logoutbutton.click();
        driver.close();
        
	 }

}
