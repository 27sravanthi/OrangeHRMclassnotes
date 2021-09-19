package A1_Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_jobs_Methods {
	
	WebDriver driver;
	
	 public   WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}
	 
	 
	 public  void openChromeBrowser()throws Exception
	 {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;
		 
	 }
	 
	 public void OpenOrgangeHRM()throws Exception
	 {
			driver.get("https://opensource-demo.orangehrmlive.com/");
	 }
	 
	 public void Login()throws Exception
	 {
			findElement(By.id("txtUsername")).sendKeys("Admin");
			findElement(By.id("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();
		 
	 }
	 
	 public void Add_Jobs()throws Exception
	 {
			findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Job")).click();
			findElement(By.id("menu_admin_viewJobTitleList")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.id("jobTitle_jobTitle")).sendKeys("Sales7");
			findElement(By.id("jobTitle_jobDescription")).sendKeys("Sales7 desr");
			findElement(By.id("jobTitle_note")).sendKeys("Sales7 Note");
			findElement(By.id("btnSave")).click();
	 }
	 
	 public void CloseBrowser()throws Exception
	 {
		 driver.quit();
	 }
	 
	 
	 
	
  @Test
  public void Add_jobs_Test() throws Exception  {
	  
	  TC01_Add_jobs_Methods T12= new TC01_Add_jobs_Methods();
	  
	 T12.openChromeBrowser();
	 T12.OpenOrgangeHRM();
	 T12.Login();
	 T12.Add_Jobs();
	 T12.CloseBrowser();
		
  }
  
  
  
  
}
