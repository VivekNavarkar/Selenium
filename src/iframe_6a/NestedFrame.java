package iframe_6a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");//main webpage 
		driver.switchTo().frame("frame1");// switch to frame1/parents frame
		//driver.switchTo().frame(0);//size-1,1-1=0
		Thread.sleep(200);
		WebElement child = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));//find xpath of child frame
		driver.switchTo().frame(child);
		String text1 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        System.out.println(text1);
        driver.switchTo().parentFrame();
        WebElement parent = driver.findElement(By.xpath("//body[text()='Parent frame']"));
        String text2 = parent.getText();
        System.out.println(text2);
        driver.switchTo().defaultContent();
        String text3 = driver.findElement(By.className("main-header")).getText();
        System.out.println(text3);
	}

}
