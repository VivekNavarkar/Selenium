package suitLevelListener_A8;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerClass implements ITestListener
{
  BaseClass bc = new BaseClass();// creaated object of  Base Class 
  
  @Override
  public void onTestFailure(ITestResult result)
  {
	    String TCname = result.getName();
	    try
	    {
			bc.captureScreenshot(TCname);
		}
	    catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  public void onTestSuccses(ITestResult result)
  {
	    
	    Reporter.log("TC is Sucusess", true);
	    ITestListener.super.onTestSuccess(result);
	    Reporter.log("TC is Sucusess "+result.getName(),true);
	    
  }
  @Override
  public void onTestSkipped(ITestResult result) 
  {
       Reporter.log("TC is skipped, please check dependent TC",true);
       Reporter.log("Skipped TC is "+result.getName(),true);
       ITestListener.super.onTestSkipped(result);
  }
}
