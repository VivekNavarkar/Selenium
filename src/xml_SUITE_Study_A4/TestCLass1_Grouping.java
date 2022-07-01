package xml_SUITE_Study_A4;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCLass1_Grouping
{/* Grouping in testng.xml  we have 15 TC in 2 classes in 
	Class1 Total 5  TC, 2 Regression Tc’s,  3 Sanity TC
	Class2 Total 10 TC, 5 Regression TC’s,  5 Sanity TC
	Regression 7 TC
	Sanity 8 TC
	eg-- @Test(groups= "sanity") */

	@Test(groups = "sanity")
	public void TestCase1()
	{
		Reporter.log("My sanity testCase 1 is Running ", true);
 	}
    @Test(groups ="regresstion")
    public void TestCase2()
    {
    	Reporter.log("My regresstion testCase 2 is running",  true);
    }
    @Test(groups="sanity")
    public void TestCase3()
    {
    	Reporter.log("My sanity testCase 3 is running",  true);
    }
    @Test(groups ="regresstion")
    public void TestCase4()
    {
    	Reporter.log("My regresstion testCase 4 is running", true);
    }
    @Test(groups ="sanity")
    public void TestCase5()
    {
    	Reporter.log("My sanity testCase 5 is running",true );
    }
}
