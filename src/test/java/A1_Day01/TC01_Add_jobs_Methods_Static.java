package A1_Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_jobs_Methods_Static {
	
	static WebDriver driver;
	
	 public static  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}
	 
	 
	 public static void openChromeBrowser()throws Exception
	 {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;
		 
	 }
	 
	 public static void OpenOrgangeHRM()throws Exception
	 {
			driver.get("https://opensource-demo.orangehrmlive.com/");
	 }
	 
	 public static void Login()throws Exception
	 {
			findElement(By.id("txtUsername")).sendKeys("Admin");
			findElement(By.id("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();
		 
	 }
	 
	 public static void Add_Jobs()throws Exception
	 {
			findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Job")).click();
			findElement(By.id("menu_admin_viewJobTitleList")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.id("jobTitle_jobTitle")).sendKeys("Sales8");
			findElement(By.id("jobTitle_jobDescription")).sendKeys("Sales8 desr");
			findElement(By.id("jobTitle_note")).sendKeys("Sales8 Note");
			findElement(By.id("btnSave")).click();
	 }
	 
	 public static void CloseBrowser()throws Exception
	 {
		 driver.quit();
	 }
	 
	 
	 
	
  @Test
  public void Add_jobs_Test() throws Exception  {
	  
	
	  
	  TC01_Add_jobs_Methods_Static.openChromeBrowser();
	  TC01_Add_jobs_Methods_Static.OpenOrgangeHRM();
	  TC01_Add_jobs_Methods_Static.Login();
	  TC01_Add_jobs_Methods_Static.Add_Jobs();
	  TC01_Add_jobs_Methods_Static.CloseBrowser();
		
  }
  
  
  
  
}
