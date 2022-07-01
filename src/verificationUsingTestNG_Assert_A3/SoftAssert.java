package verificationUsingTestNG_Assert_A3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert
{/* Soft Assert
    To overcome assert class drowback we need to use soft assert.
    It is a class which contains non-static methods use to do verification.
    Soft assert will do verification if any executes the rest of verification in a test method*/


	
	  @Test
	  public void methode1() 
	  {
	    SoftAssert soft =new SoftAssert();
		String ActualResult   ="VCTC";
		String ExpectedResult ="VCTCPune";
	
		
		soft.assertEquals(ActualResult, ExpectedResult, "Value is not matching");
		
		Reporter.log("TC1 softAssert is running",true);
		
		soft.assertNotNull(ActualResult);
		Reporter.log("running TC",true);
		
		soft.assertAll();
		  
	  }

	private void assertEquals(String actualResult, String expectedResult, String string)
	{
	
	
     }

	private void assertAll()
	{
		// TODO Auto-generated method stub
		
	}

	private void assertNotNull(String actualResult)
	{
		// TODO Auto-generated method stub
		
	}

	
}
