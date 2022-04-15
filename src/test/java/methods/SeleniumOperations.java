package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {

	public static WebDriver driver=null;
	
	public static void browserLaunch(Object[]inputParameters)
	{
		String browser=(String) inputParameters[0];
		String exe=(String) inputParameters[1];
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", exe);
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
	public static void openApplication(Object[] inputParameters) 
	{
		String url=(String) inputParameters[0];
		driver.get(url);	
	}
	//click on element
   public static void clickOnEliment(Object[] inputParameters) 
   {
	String xpath=(String) inputParameters[0];
	driver.findElement(By.xpath(xpath)).click();
   }
   
   public static void LoginWindow(Object[] inputParameters) 
   {
	String abc=(String) inputParameters[0];
	WebElement log=driver.findElement(By.xpath(abc));
	Actions act=new Actions(driver);
	act.moveToElement(log).build().perform();
	
   }
   
   public static void clickOnProfile(Object[] inputParameters) {
	   String path=(String) inputParameters[0];
	   driver.findElement(By.xpath(path)).click();
   }
   
   public static void Username(Object[] inputParameters) 
   {driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String xname=(String) inputParameters[0];
	String uname=(String) inputParameters[1];
	driver.findElement(By.xpath(xname)).sendKeys(uname);
	
   }
	
	
	
	public static void main(String[] args)
	{
		//launch browser
		Object [] input=new Object[2];
	    input[0]="Chrome";
	    input[1]="E:\\March2022FlipkartNew\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
	  SeleniumOperations.browserLaunch(input);
	  
		//open application
	  Object [] input1=new Object[1];
	    input1[0]="https://www.flipkart.com";
	  SeleniumOperations.openApplication(input1);
	  
	  //click on Cancle
	  Object [] input2=new Object[1];
	    input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	  SeleniumOperations.clickOnEliment(input2);
	  
	  //Mouse move to login Button
	  Object [] input3=new Object[1];
	    input3[0]="//*[@class='_1_3w1N']";
	  SeleniumOperations.LoginWindow(input3);
	  
	  //click to my profile
	  Object [] input4=new Object[1];
	    input4[0]="(//*[@class='_3vhnxf'])[1]";
	  SeleniumOperations.clickOnEliment(input4);
	  
	  //myprofileWindow-username
	  Object[] input5=new Object[2];
	  input5[0]="//*[@class='_2IX_2- VJZDxU']";
	  input5[1]="9028281928";
	  SeleniumOperations.Username(input5);
	  
	  //password
	  Object[] input6=new Object[2];
	  input6[0]="//*[@type='password']";
	  input6[1]="Riyaj@7771";
	  Username(input6);
	  
	  //click on login
	  Object[] input7=new Object[1];
	  input[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
	  clickOnEliment(input7);
	  
	  
	  
	  
	  
	  
	  
	  
	}
	
}
