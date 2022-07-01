package verificationUsingTestNG_Assert_A3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_True_False 
{
// 3.asseertTrue is used to verify the condition true or false. If condition is TRUE TC is PASS, Othervise its Failed.
	
	boolean a=true;
	boolean b=false;
	
	@Test
	public void myMethod()
	{
		Assert.assertTrue(a, "if result is False TC is Failed ");
		Reporter.log("if result is true TC is pass",true);
		
	}
	
//4.asseertFalse is used to verify the condition true or false. If condition is FALSE TC is PASS, Othervise its Failed.
	boolean c=true;
	boolean d=false;
	
	@Test
	public void myMethod1()
	{   
		Assert.fail(); //5. Fail This method is used to intentionally failed test method.
		Assert.assertFalse(d, "result is true TC is Failed ");
		Reporter.log(" result is False TC is pass",true);
	}
	

}
