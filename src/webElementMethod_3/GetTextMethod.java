package webElementMethod_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod// IT IS USED TO GET TEXT PRESENT IN WEBPAGE,RT TYPE IS STRING.
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();

	driver.get("https://zoom.us/signin");
	Thread.sleep(100);
	driver.manage().window().maximize();
	// creat reference variable/obj
	WebElement text1 = driver.findElement(By.xpath("//a[text()='Do Not Sell My Personal Information']"));
	System.out.println(text1.getText());
	String actualtext = text1.getText();// webpage text 
	String expectedtext ="Do Not Sell My Personal Information";// input mathing test to match with webpage text 
	//System.out.println(actualtext.equals(expectedtext));//compare the actual and expected text by using equals method
	if(actualtext.equals(expectedtext)) 
	{
		System.out.println("test is matching so test  case is pass");
	}
	else
	{
		System.out.println("test is Not matching so test case is fail ");
	}
	}

}
