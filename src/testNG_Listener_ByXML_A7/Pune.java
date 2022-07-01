package testNG_Listener_ByXML_A7;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pune
{
   @Test(priority= 1, dependsOnMethods = {"shivaginagar"})
   public void swarget()
   { 
	   Reporter.log("My TC SG is Running ", true);
   }
   @Test(priority=0)
   public void shivaginagar()
   {   
	   Reporter.log("my TC SN is Running ", true);
   }
   @Test(priority=-1)
   public void Hadpasar()
   {  
	   
	   Reporter.log("my tc hadapsir is running", true);
   }
}
