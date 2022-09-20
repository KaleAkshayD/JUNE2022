package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class seleniumOperation
{
	
	public static WebDriver driver=null;
			
			//LAUNCHBROWSER
	public static void browserLaunch(Object[]inputParameters)
	{
		try {
		String bName = (String) inputParameters[0];
		
		String WebDriverExePath=(String) inputParameters[1];
		
		if(bName.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", WebDriverExePath);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
		else if(bName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", WebDriverExePath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		
	
			//OPEN Application
	public static void openApplication(Object[]input1Parameters) 
	{
		try {
		String strgurl= (String) input1Parameters[0];
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(strgurl);
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
			//ClickOnElement
	public static void clickOnElement(Object[]input2Parameters)
	{
		try {
		String Locator= (String) input2Parameters[0];
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(Locator)).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
			//MouserOver
	public static void mouseOverAction(Object[]input3Parameters)
	{
		try {
		String Locator= (String) input3Parameters[0];
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		
	WebElement Abc=driver.findElement(By.xpath(Locator));
		
		act.moveToElement(Abc).build().perform();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
			//SendText
	public static void sendText(Object[]input4Parameters) 
	{
		try {
		String Locator= (String) input4Parameters[0];
		
		String sendText= (String) input4Parameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Locator)).sendKeys(sendText);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void Validation(Object[]input5Parameters)
	{
		
		String xpath= (String) input5Parameters[0];
		String givenText= (String) input5Parameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String findedText = driver.findElement(By.xpath(xpath)).getText();
		
		if(findedText.equalsIgnoreCase(givenText))
		{
			System.out.println("Test Case is Pass");
		}
		
		else
		{
			System.out.println("Test Case is Fail");
			
		}
		
		}
		
	/*
	public static void InValidation(Object[]input5Parameters)
	{
		try {
		String xpath= (String) input5Parameters[0];
		String givenText= (String) input5Parameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String findedText = driver.findElement(By.xpath(xpath)).getText();
		
		if(findedText.equalsIgnoreCase(givenText))
		{
			System.out.println("Test Case Pass");
		}
		
		else
		{
			System.out.println("Test Case Fail");
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}*/
	}
	

	
	
	

