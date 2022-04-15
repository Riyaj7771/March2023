package plainTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitTestCase {
	
	public static void main(String[] args)
	{
		
     System.setProperty("webdriver.chrome.driver", "E:\\March2022FlipkartNew\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com");
     //cancle Login page
     driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
     
     
		
	}

}
