package kiteAppTestClass_UsingPropertyFile;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBase_UsingPropertyFile.BaseClassUsingProperty;
import kiteAppUtility_UsingPropertyFile.UtilityClassUsingPropertyFile;
import testNG_kitePomClasses_A4.HomePage;
import testNG_kitePomClasses_A4.LogInPage;
import testNG_kitePomClasses_A4.Logout;
import testNG_kitePomClasses_A4.PinPage;

public class KiteUNTestUsingProperty extends BaseClassUsingProperty
{
	LogInPage login;
	PinPage pin;
	HomePage home; 
	Logout logout;
	
 @BeforeClass
 public void launchBrowserprop() throws IOException
 {
	 openBrowser();
	 login=new LogInPage(driver);
	 pin =new PinPage(driver);
	 home=new HomePage(driver);
	 logout=new Logout(driver);
 }
 @BeforeMethod
 public void logintokiteapp() throws IOException
 {
	 login.sendUserId(UtilityClassUsingPropertyFile.readDataFromFile("UN"));
	 login.sendPassword(UtilityClassUsingPropertyFile.readDataFromFile("PWD"));
	 login.clickOnLoginButton();
	 UtilityClassUsingPropertyFile.implicitWait(driver, 500);
	 pin.sendPin(UtilityClassUsingPropertyFile.readDataFromFile("PIN"));
	 pin.clickOnContinueButton();
 }
 @Test 
 public void validateUN() throws IOException
 {
	String actualUN = home.getActulUserID();
	String expectedUN = UtilityClassUsingPropertyFile.readDataFromFile("UN");
	Assert.assertEquals(actualUN, expectedUN,"actualun and expected is not matching TC is Fail");
	Reporter.log("actualUN and expectedUN is  matching TC is Pass", true);
	
 }
 @AfterMethod
 public void logout() throws InterruptedException
 {
	 home.clickonUseridbutton();
	 home.clicOnLogoutButton();
	 logout.clicOnChangeUser();
 }
 @AfterClass
 public void closeBrowser()
 {
	 driver.close();
 }
}
