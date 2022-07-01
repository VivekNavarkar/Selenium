package testNG_Listener_A6;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
/*There are numerous TestNG listeners in Selenium WebDriver, some of them are used very frequently by the testing community. 
1.ITestListener, 2.IAnnotationTransformer,   3.IInvokedMethodListener,  4.ISuiteListener,    5.IReporter

 ITestListener is the most adopted TestNG listener in Selenium WebDriver. It provides you with an easy to implement interface through
 a normal Java class, where the class overrides every method declared inside the ITestListener. By using this TestNG listener in
 Selenium WebDriver, you can change the default behaviour of your test by adding different events to the methods. It also defines a
 new way of logging or reporting.
The following are some methods provided by this interface:
1 onStart:       This method is invoked before any test method gets executed. This can be used to get the directory from where the tests are running.
2 onFinish:      This method is invoked after all tests methods gets executed. This can be used to store information of all the tests that were run.
3 onTestStart:   This method is invoked before any test methods are invoked. This can be used to indicate that the particular test method has been started.
4 onTestSkipped: This method is invoked when each test method is skipped. This can be used to indicate that the particular test method has been skipped.
5 onTestSuccess: This method is invoked when any test method succeeds. This can be used to indicate that the particular test method has successfully finished its execution.
6 onTestFailure: This method is invoked when any test method fails. This can be used to indicate that the particular test method has failed. You can create an event for taking a screenshot which will show where the test has been failed.
*/
	// implement ItestListner and calling its methodess
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC is pass", true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC is pass", true);
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC is skipped, please check dependent TC",true);
		ITestListener.super.onTestSkipped(result);
	}
}
