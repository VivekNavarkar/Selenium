package xml_SUITE_Study_A4;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2_Grouping 
{
	@Test(groups ="sanity")
	public void TestCase6()
	{
		Reporter.log("My sanity testCase 6 is Running ", true);
 	}
    @Test(groups ="sanity")
    public void TestCase7()
    {
    	Reporter.log("My  sanity testCase 7 is running",  true);
    }
    @Test(groups ="sanity")
    public void TestCase8()
    {
    	Reporter.log("My sanity testCase 8 is running",  true);
    }
    @Test(groups ="sanity")
    public void TestCase9()
    {
    	Reporter.log("My sanity testCase 9 is running", true);
    }
    @Test(groups ="sanity")
    public void TestCase10()
    {
    	Reporter.log("My sanity testCase 10 is running", true);
    }
    @Test(groups ="regresstion")
	public void TestCase11()
	{
		Reporter.log("My Regresstion testCase 11 is Running ", true);
 	}
    @Test(groups ="regresstion")
    public void TestCase12()
    {
    	Reporter.log("My Regresstion testCase 12 is running",  true);
    }
    @Test(groups ="regresstion")
    public void TestCase13()
    {
    	Reporter.log("My Regresstion testCase 13 is running",  true);
    }
    @Test(groups ="regresstion")
    public void TestCase14()
    {
    	Reporter.log("My Regresstion testCase 14 is running", true);
    }
    @Test(groups ="regresstion")
    public void TestCase15()
    {
    	Reporter.log("My Regresstion testCase 15 is running", true);
    }
}
