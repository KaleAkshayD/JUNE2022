package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{

	
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Tools n Driver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	driver.navigate().to("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
			
	driver.findElementByXPath("//a[contains(@href,'/account/login?ret=/')]").click();
		
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("8446501909");
		
	driver.findElementByXPath("//input[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("8446501909");
		
		driver.findElementByXPath("(//button[@type='submit'])[2]").click();
	
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(4000);
		
		WebElement a=driver.findElement(By.xpath("(//*[@class='go_DOp'])[1]"));
 			
		act.moveToElement(a).build().perform();
		
		Thread.sleep(4000);
 		
		driver.findElement(By.xpath("//*[text()='My Profile']")).click();

		driver.findElement(By.xpath("//*[text()='Manage Addresses']")).click();
	 	
	}
	
}
		
		
		
		
		

