package misc_9;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartReview {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.name("q")).sendKeys("OnePlus 9R 5G ");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement review = driver.findElement(By.xpath("(//div[@class='gUuXy-']//span)[6]"));
        System.out.println(review.getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        WebElement rating = driver.findElement(By.xpath("(//div[@class='gUuXy-']//span)[4]"));
        System.out.println(rating.getText());
    }

}
