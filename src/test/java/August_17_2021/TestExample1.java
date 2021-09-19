package  August_17_2021;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestExample1
{
	
	static WebDriver driver;
	
	@Parameters({"Browser"})
	@BeforeTest
	public void Test1(String Browser1) throws Exception {
		
		
		if(Browser1.equalsIgnoreCase("Chrome"))
		{
			driver=TestBrowser.OpenChromeBrowser();
		}
		
		if(Browser1.equalsIgnoreCase("FireFox"))
		{
			driver=TestBrowser.FirefoxBrowser();
		}
		
		  
	}
	
	@Parameters({"NationalityText"})
	@Test
	public void Test2(String NationalityText1) throws Exception {
		
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	    Reporter.log("Pass- open Orangehrm1");
		
		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		Reporter.log("Pass- Enter User Name1");
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");	
		Reporter.log("Pass- Enter Password1");
		
		driver.findElement(By.xpath(OR.login_click)).click();
		Reporter.log("Pass- Click on Signin1");
	
	}
	
	
	
	@AfterTest
	public void Test3() throws Exception {
		
		// Reporter.log("Pass- After TEst Section");
		driver.close();
		
	}
	
	
	
	
	

}












