package testNG_Listener_A6;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG_Listener_A6.Listener.class)// call listeners annotation and give path of listener.
public class ListenerTestClass
{
/* Listener 
   There are different interfaces provided by Java that allow you to modify TestNG behavior. These interfaces are further known as 
  TestNG Listeners in Selenium WebDriver. TestNG Listeners also allow you to customize the tests logs or report according to your 
  project requirements. TestNG Listeners in Selenium WebDriver are modules that listen to certain events and keep track of test 
  execution while performing some action at every stage of test execution.
TestNG Listeners in Selenium WebDriver can be implemented at two levels:
1.Class level: In this, you can implement listeners for each particular class, no matter how many test cases it includes.
2.Suite level: In this, you implement listeners for a particular suite which includes several classes of test cases. 
*/
// creat TC by using @Test.
  @Test
   public void myTC1()
   {  Assert.fail();
   Reporter.log("My TC1 is Running ",true);
   }
   @Test(dependsOnMethods = {"myTC1"})
   public void myTC2()
   {
   Reporter.log("My TC2 is Running ", true);
   }
}
