package webElementMethod_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_SendKeys_Clear 
{
// webelement Method is working on web page.
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// now open any website with the help of get method
		driver.get("https://www.airtel.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.findElement(By.id("quickRechargeInput"));
		//create REf variable for multiple time used of find element method
		WebElement text = driver.findElement(By.id("quickRechargeInput"));
		Thread.sleep(500);
		text.click();
		Thread.sleep(1000);
		text.sendKeys("9503887981");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='txtMobile']")).clear();
        Thread.sleep(300);
        driver.navigate().back();
		driver.navigate().refresh();


	}

}
