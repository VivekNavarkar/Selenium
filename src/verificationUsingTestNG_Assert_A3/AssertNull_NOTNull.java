package verificationUsingTestNG_Assert_A3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull_NOTNull 
{/*
6] assertNull() This method is use to verify components or text fields empty/blankT if it is empty output is pass otherwise fail.
*/
 @Test()
 public void mymethod()
 {
	 String a=null;
	 String b = "Vivek";
	  
	 Assert.assertNull(a,"not null value TC is Failed ");
	 Reporter.log("Null value TC is Pass", true);
 }
	
 @Test()
 public void mymethod1()
 {
	 String c =null;
	 String d = "Vivek";
	  
	 Assert.assertNotNull("d null value TC is Failed ");
	 Reporter.log("NOt Null value TC is Pass", true);
 }
}
