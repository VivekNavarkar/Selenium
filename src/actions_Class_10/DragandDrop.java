package actions_Class_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(200);

		
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest = driver.findElement(By.id("amt8"));
		Actions act= new Actions(driver);
	//1st way
		act.dragAndDrop(src, dest).perform();
	//2nd way
		act.clickAndHold(src).moveToElement(dest).release().build().perform();

	}

}
