package actions_Class_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_actions
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(200);
	//move to element using mouse actions 
	    //1. first create actions class object and pass driver obj as argument
		Actions a = new Actions(driver);
		//2.find an element to perform action and store in refe. variable
		WebElement Myelement = driver.findElement(By.className("dropdown-toggle"));
 //3.calling methods using action class obj and pass refe variable of find ele in methods and take perform m in last
		a.moveToElement(Myelement).perform();
		
	//click using mouse actions
		// 1 way
    //  a.click().perform();
		// 2 way
	//  a.moveToElement(Myelement).click().build().perform();// build method is used to calling 2 or more method in combine
		//3 way
	//	a.click(Myelement).perform();
		
	//right click--context click
	    a.moveToElement(Myelement).contextClick().build().perform();
	    a.contextClick().perform();
	    a.contextClick(Myelement).perform();
		
	}

}
