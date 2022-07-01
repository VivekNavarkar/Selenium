package testNG_A1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Annotation 
{
	
/*@Test:- Used for execution of every test method/TC.

  @BeforeMethod:- It is used for execution of method before execution of every test method with an annotation @Test.

  @AfterMethod:- It is used for execution of method after execution of every test method with an annotation @Test.

  @BeforeClass:- It is used for execution of method before execution of test class.

  @AfterClass:- It is used for execution of method after execution of test class.*/


	  @Test
	  public void ValidatePin()//Test case 1/method1
	  {
		  Reporter.log("Pin Validation done-->@Test used", true);
	  }
	  
	  @Test
	  public void ValidateUserId()//Test case 2/method2
	  {
		  Reporter.log("UserId Validation done--> @Test used", true);
	  }
	  @BeforeMethod
	  public void EnterUserIdAndPassword() //BeforeMethod-->before Test Case 1,2
	  {
		  Reporter.log("UserIdPasswordEntered  done--> @BeforeMethod used", true);
	  }

	  @AfterMethod
	  public void Logout() //AfterMethod-->Test Case 1,2 
	  {
		  Reporter.log("Logout  done--> @AfterMethod used", true);
	  }

	  @BeforeClass
	  public void BrowserLaunch() //BeforeClass--> come BeforeMethod 
	  {
		  Reporter.log("Launch Browser--> @BeforeClass used", true);
	  }

	  @AfterClass
	  public void CloseBrowser() //AfterClass--> come AfterMethod
	  {
		  Reporter.log("Closed Browser--> @AfterClass used", true);
	  }


}
