package webElementMethod_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_EnabledMethod 
{
// isenabled method
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jio.com/selfcare/login/mobile");
		Thread.sleep(500);
		driver.manage().window().maximize();
		
		WebElement OTP_Button = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		//find xpath for otp button and create ref variable of otp button
	    boolean result = OTP_Button.isEnabled();// create reference variable for multiple used
	    
        System.out.println("otp button is enabled "+result);//--false
        
        driver.findElement(By.xpath("//input[@name='jioNrInputName']")).sendKeys("9595959595");//creat path of text fild
        Thread.sleep(2000);
        boolean result1 =OTP_Button.isEnabled();// check otp button
        System.out.println("otp button is enabled "+result1);//---true
        
	}

}