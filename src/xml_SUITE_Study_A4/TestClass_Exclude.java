package xml_SUITE_Study_A4;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass_Exclude 
{
	/* Test Suite is xml file which contains all the test classes name which need to be executed.
    Test Suite is used to execute all/multiple Test classes.  */
	
	@Test
	public void TestCase6()
	{
		Reporter.log("My testCase 6 is Running ", true);
 	}
    @Test
    public void TestCase7()
    {
    	Reporter.log("My testCase 7 is running",  true);
    }
    @Test
    public void TestCase8()
    {
    	Reporter.log("My testCase 8 is running",  true);
    }
    @Test
    public void TestCase9()
    {
    	Reporter.log("My testCase 9 is running", true);
    }
    @Test
    public void TestCase10()
    {
    	Reporter.log("My testCase 10 is running", true);
    }
}
