package xml_SUITE_Study_A4;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass_Include 
{
	/* Test Suite is xml file which contains all the test classes name which need to be executed.
    Test Suite is used to execute all/multiple Test classes.  
    1) Include is used to add which method we want in xml file/ suit.
    2) Exclude is used to skip which method we don't want in xml file/suit */
	
	@Test
	public void TestCase1()
	{
		Reporter.log("My testCase 1 is Running ", true);
 	}
    @Test
    public void TestCase2()
    {
    	Reporter.log("My testCase 2 is running",  true);
    }
    @Test
    public void TestCase3()
    {
    	Reporter.log("My testCase 3 is running",  true);
    }
    @Test
    public void TestCase4()
    {
    	Reporter.log("My testCase 4 is running", true);
    }
    @Test
    public void TestCase5()
    {
    	Reporter.log("My testCase 5 is running",true );
    }
}
