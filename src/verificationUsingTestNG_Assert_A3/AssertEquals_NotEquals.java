package verificationUsingTestNG_Assert_A3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals_NotEquals
{
// 1.AssertEquals is used to verify the actual and expected result,If both results are same/Matching TC is Pass. othervise its Failed.
	
	
	@Test
	public void myMethod() 
	{
    String actualresult = "Vivek123";
    String Expectedresult="Vivek123";
    
    Assert.assertEquals(actualresult, Expectedresult,"Both Results are Not Matching TC is Fail ");
    Reporter.log("Both Result is Matching TC is Pass", true);
    
  /*  Assert.assertNotEquals(actualresult,Expectedresult," Both Result are matching TC is Fail ");
    Reporter.log("Both Result are not matching TC is pass", true);
    this is Disadvatages of hard asssert only one asert is execution at a time to overcome this we used soft assert*/
    
	}
	@Test
	public void myMethod1()
	{
// 2. AssertNotEquals is used to verify the actual and expected result,If both results are not matching TC is passed.otherwise its failed.
		
    String AR = "Vivek95";
    String ER = "Vivek9";
    Assert.assertNotEquals(AR,ER," Both Result are matching TC is Fail ");
    Reporter.log("Both Result are not matching TC is pass", true);
	}
   
   
   
   
}

