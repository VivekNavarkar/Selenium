package testNG_keyword_A2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority_KeyWord 
{
	/* When we want to change TC execution order we need to use TestNG keyword "priority".eg. priority = 1
	   Note:  priority can be    --->>   i. bydefault=0 	ii. +ve integer	  iii. -ve integer	iv. Duplicate
	          priority can't be  --->>   i. Decimals	    ii. Variables	 */	
    // working of priority is in numberline.  -5, -4, -3, -2, -1, 0 , 1, 2, 3, 4, 5.

  @Test(priority = 2)   //4.
  public void methodD() 
  {
	 Reporter.log(" my method D  is running ", true);
  }
  @Test(priority = -1)  //2.
  public void methodB() 
  {
	 Reporter.log(" my method B  is running ", true);
  }
  @Test                 //3.-- its take priority by default is 0.
  public void methodC() 
  {
	 Reporter.log(" my method C  is running ", true);
  }
  @Test(priority = -1)  //1.-- if priority is same than its take TC/ methodname  as per alfhabetical order & its execute its first.
  public void methodA()
  {
	  Reporter.log(" my method A  is running ", true);
  }
}
