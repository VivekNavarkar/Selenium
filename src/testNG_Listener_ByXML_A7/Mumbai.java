package testNG_Listener_ByXML_A7;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mumbai 
{
	@Test
	public void varali()
	{
		Reporter.log("My tc varali is running", true);
	}
    @Test
    public void goregoan()
    {
    	Reporter.log("my TC GG is running", true);
    }
}
