package testNG_keyword_A2;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount_1 
{
/*  when same TC/test method we need to be executed multiple times which can be possible by using TestNG keyword  InvocationCount "
 *  eg. invocationCount=5; */
	
  @BeforeMethod()
  public void lunchbroser()
  {
	  Reporter.log("Lunch browser", true);
  }
  @Test(invocationCount = 5)// this test case is running 5 times.
  public void testCase1() 
  {
	 Reporter.log("My TC1 is Running ", true); 
  }
  @Test
  public void testCase2()
  {
	  Reporter.log("My Tc2is Running ", true);
  }
  @AfterMethod
  public void closeBrowser()
  {
	  Reporter.log(" close browser", true);
  }
}
