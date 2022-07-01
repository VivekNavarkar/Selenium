package webDriverMethod_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverMethod 
{
 // webdriver method is used to perform the action on web browser.
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");// chrome path
		
         WebDriver driver = new ChromeDriver();  // upcasting
          driver.get("https://www.google.com/"); // to open the application we uesd the get method
         // driver.close();// to close the application we used close method 
         driver.manage().window().maximize();
         // driver.manage().window().minimize();
          driver.navigate().to("https://www.w3schools.com/sql/");// it is used to navigate to new url from old url
          driver.navigate().back();// it is used to navigate to back url.
          driver.navigate().forward();// it is used to navigate to forward url.
          driver.navigate().refresh();// it is used to refresh the url.
          driver.getTitle();// it is used to get title of url
          System.out.println(driver.getTitle());// to print title 
          String title =  driver.getTitle(); // creat refrerance variable
          System.out.println("title of url is  "+title);//calling reference variable 
          driver.getCurrentUrl();// it is used to find current url in selenium webdriver
          System.out.println(driver.getCurrentUrl());
          
          
 
   }

}
