package testNG_A1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_AnnotationStyudy
{
  @Test  // test annotation is used to execute the every test case/method
  public void MyTestCase1() 
  {
	  Reporter.log("  My TestCase1 is Running TC", true);
  }
  @BeforeMethod// BeforeMethod annotation is used perform the steps comeing before execute the test cases.
  public void login()
  {
	  Reporter.log(" My login page  is Running BM", true);
  }
  @AfterMethod()// AfterMethod annotation is used perform the steps comeing after execute the test case.
  public void logout()
  {
	   Reporter.log(" My logout page is Running AM", true);
  }
  @BeforeClass// beforeClass annotationt is used to perform the steps comeing beforemethod annotation.
  public void launchBrowser()
  {
	  Reporter.log("My browser is launch BC", true);
  }
  @AfterClass // afterClass annotation is used to perform the steps coming aftermethod annotation.
  public void browserClose()
  {
	  Reporter.log("My browser is close AC", true);
  }
  @AfterTest
  public void method6()
  {
	  Reporter.log("My Method6 is Running AT", true);
  }
  @BeforeTest
  public void method7()
  {
	  Reporter.log("My Method7 is running BT ", true);
  }
  @BeforeSuite
  public void method8()
  {
	  Reporter.log("My method8 is running BS ", true);
  }
  @AfterSuite
  public void method9()
  {
	  Reporter.log("My method9 is running AS", true);
  }
   
  
}
