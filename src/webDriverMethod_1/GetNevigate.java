package webDriverMethod_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNevigate {

	public static void main(String[] args) throws InterruptedException 
	{
		//to open the new url after first url is close we creat new object of cromedriver with diff name in same class
		// org.openqa.selenium.NoSuchSessionException this exception is came close the first url
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");// chrome path
			
	         WebDriver driver = new ChromeDriver();  // upcasting
	          driver.get("https://www.google.com/"); // to open the application we uesd the get 
               Thread.sleep(500);
	         driver.close();// to close the application we used close method 
	      
	         
	         WebDriver driver1 = new ChromeDriver();
	         Thread.sleep(500);
	        
	         driver1.get("https://www.w3schools.com/sql/");
	         driver1.close();

	         WebDriver driver2 = new ChromeDriver();
	         Thread.sleep(500);
	        
	         driver2.get("https://www.w3schools.com/sql/");
	        


	}

}
