package utility;

public class Calling 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		//BrowserLaunch
				Object[]input=new Object[2];
				input[0]="Chrome";
				input[1]="F:\\Automation Tools n Driver\\chromedriver.exe";
				seleniumOperation.browserLaunch(input);

		//OpenApplication
				Object[]input1=new Object[1];
				input1[0]="https://www.flipkart.com/";
				seleniumOperation.openApplication(input1);	
		
		// clickonElement
				Object[]input2=new Object[1];
				input2[0]="//*[@class='_2KpZ6l _2doB4z']";
				seleniumOperation.clickOnElement(input2);
		//navigate TO
				Object[]input3=new Object[1];
				input3[0]="//*[@class='_1_3w1N']";
				seleniumOperation.mouseOverAction(input3);
	
						
	
				
				 //clickOnMyProfile
 	              Object[] input6=new Object[1];
	                       input6[0]="(//*[@class='_2NOVgj'])[1]";
	                       seleniumOperation.clickOnElement(input6);     
				
		//UserName
				Object[]input4=new Object[2];
				input4[0]="//*[@class='_2IX_2- VJZDxU']";
				input4[1]="8446501909";
				seleniumOperation.sendText(input4);
				
		//Password
				input4[0]="//input[@class='_2IX_2- _3mctLh VJZDxU']";
				input4[1]="8446501909";
				seleniumOperation.sendText(input4);

		//clickonSubmit
			input2[0]="(//*[text()='Login'])[3]";
			seleniumOperation.clickOnElement(input2);
			
			
			Object[]input5=new Object[2];
			input5[0]="//*[@class='_1ruvv2']";
			input5[1]="AKSHAY Kale";
			seleniumOperation.Validation(input5);
			
		
	}
	
}
