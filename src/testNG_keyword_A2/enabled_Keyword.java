package testNG_keyword_A2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled_Keyword 
{
//enabled annotation is used to disable/hide the any test case/method for execution with @Test annotation. eg. enabled = false.
	
	@Test(enabled= true)
	public void methodeA()
	{
	 Reporter.log("My Method 1 is running", true);
	}
	@Test(enabled= false)// method 2 is disable
	public void methodB()
	{
		Reporter.log("My Method 2 is running ", true);
	}
	@Test() 
	public void methodC()
	{
		Reporter.log("My Method 3 is running", true);
	}

}
