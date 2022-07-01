package testNG_keyword_A2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout_Keyword 
{
/* timeout Keyword is used to if we have Multiple TC & any test case/Method is requried more time to execute than we give timeout
   to that TC & by default TestNG is Failed That TC, and further TC is will be EXecute.*/
 
 @Test
 public void method1()
 {
	 Reporter.log(" Method 1 is running ", true);
 }
 @Test(timeOut=1000)
 public void method2() throws InterruptedException
 {   Thread.sleep(1200);// tc failed
	 Reporter.log(" Method 2 is running ", true);
 }
 @Test(timeOut=1000)
 public void method3() throws InterruptedException
 {   Thread.sleep(900);// tc pass 
	 Reporter.log(" Method 3 is running ", true);
 }
 @Test
 public void method4()
 {
	 Reporter.log(" Method 4 is running ", true);
 }
}
