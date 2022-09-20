package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.seleniumOperation;

public class Login
{
	@Given ("^User provide browser name as \"(.*)\" and exeLocation \"(.*)\"$")

	public void bLaunch(String name, String exeLocation) 
	{
		
		Object[]input=new Object[2];
		input[0]=name;
		input[1]= exeLocation;
		seleniumOperation.browserLaunch(input);
		
	}
    @Given ("^User enter url as\"(.*)\"$")
    public void openApp(String url)
    {
    	Object[]input1=new Object[1];
		input1[0]=url;
		seleniumOperation.openApplication(input1);	

    }
	@Given("^user Cancel initial Login window$") 
	public void userCancelInitialLoginWindow() 
	{
		Object[]input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		seleniumOperation.clickOnElement(input2);
		}
	@When("^User Click on MyProfile$")
	public void user_Click_on_MyProfile() throws Throwable
	{
		Object[]input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		seleniumOperation.mouseOverAction(input3);
		
	     Object[] input6=new Object[1];
         input6[0]="(//*[@class='_2NOVgj'])[1]";
         seleniumOperation.clickOnElement(input6);     
	}
		

	@When("^User enter username as \"(.*?)\"$")
	public void user_enter_username_as(String arg1) throws Throwable 
	{
		Object[]input4=new Object[2];
		input4[0]="//*[@class='_2IX_2- VJZDxU']";
		input4[1]=arg1;
		seleniumOperation.sendText(input4);
	}

	@When("^User enter password as \"(.*?)\"$")
	public void user_enter_password_as(String arg1) throws Throwable 
	{
		Object[]input4=new Object[2];
		input4[0]="//input[@class='_2IX_2- _3mctLh VJZDxU']";
		input4[1]=arg1;
		seleniumOperation.sendText(input4);

	}

	@When("^User Click on Login button$")
	public void user_Click_on_Login_button() throws Throwable
	{
		Object[]input2=new Object[1];
		input2[0]="(//button[@type='submit'])[2]";
		seleniumOperation.clickOnElement(input2);
		
	}
	@Then ("^Application shows user profile to user$")
	public void Valid()
	{
		Object[]input5=new Object[2];
		input5[0]="//*[text()='AKSHAY  Kale']";
		input5[1]="AKSHAY Kale";
		seleniumOperation.Validation(input5);
	}
	
	


	
}
