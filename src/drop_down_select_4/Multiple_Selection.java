package drop_down_select_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Selection
{
// M.S. is used to select and display the multiple dropdown opions/values from the list.
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	//1.Identify list box to be handled and store it in reference variable
	WebElement DropDownBox = driver.findElement(By.name("cars"));
	
	//2. create object of select class
	Select s = new Select(DropDownBox);
	//3. check is Multiple select or not 
	boolean result = s.isMultiple();
	System.out.println("is multiple result is "+result);
    //4.use one of select method select multipl values
	s.selectByIndex(0);
	Thread.sleep(500);
	s.selectByIndex(1);
	Thread.sleep(500);
	s.selectByIndex(2);
	Thread.sleep(500);
	// used of deselect method 
	//s.deselectByVisibleText("Volvo");

	//s.deselectall();---it is used for only deselect multiple value
	
	//now get first option text from dropdownbox---saab
	System.out.println(s.getFirstSelectedOption().getText());// for one time used 
	WebElement FirstWebElement = s.getFirstSelectedOption();// create reference Variable
	String MyText = FirstWebElement.getText();
	System.out.println("My First Selected Option From DropDown is "+MyText );
	//get all option text from dropdownbox ---we find size =maxm index+1 and by using for loop
    System.out.println(s.getAllSelectedOptions().size());//---2
    
    for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++)
    {
    
		System.out.println(s.getAllSelectedOptions().get(i).getText());
    	
    }

	}
}
