package verificationUsingTestNG_Assert_A3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Verification {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
	   /*if(checkBox1.isSelected())   // normal condition
		 {
		 Reporter.log("TC is passed", true);
		 }
		 else 
		 {
		 Reporter.log("TC is failed", true);
		 }*/
		checkBox1.click(); // checkbox is selected.
		Thread.sleep(100); 
	    Assert.assertTrue(checkBox1.isSelected(), "CheckBox is not Selected TC is faild");
		Reporter.log("CheckBox is Selected TC is Passed", true);
	
    }
	/*  If above verification process is used to verify expected result of a test case, length of Test 
        script will take more time for execution.
        To reduce length of test script(code Optimaization) we need to use Assert class for verification which contains static methods.
        Important static methods present in Assert class (Hard Assert).All static method should be imported from org.TestNG
        1) assertEquals()  2) assertNotEquals() 3) assertTrue()  4) assertFalse() 5) assertNull()
        6) assertNotNull() 7) fail() */

}
