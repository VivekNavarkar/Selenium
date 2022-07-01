package testNG_keyword_A2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods
{// if any one TC is is depends on other/multiple  TC than we used dependsOnMethods Keyword. @Test(dependsOnMethods = {"TC Name"})



@Test(timeOut=1000)
public void LogIn() throws InterruptedException
{   Thread.sleep(900);
	Reporter.log("TC1 Is Running ", true);
}

@Test(priority=1)
public void VerifyPIN()
{
	Reporter.log("TC2 Is Running ", true);
}

@Test(dependsOnMethods = {"LogIn"},priority=2)  // Used multiple annotation
public void LogOut()
{
	Reporter.log("TC3 Is Running ", true);
}
}
