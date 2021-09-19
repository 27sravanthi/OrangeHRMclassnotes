package August_8th_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Nationality_DataProvider2 {
	
 static	WebDriver driver;
	
	//Step1
	//String TestURL="https://opensource-demo.orangehrmlive.com/";
	//String UserName="Admin",Password="admin123";
	//String Nationality_Text="Indian891";
	
	//Step1
	
 
 @DataProvider(name="Orange15")
 public Object[] myDataProvider() throws Exception {
      
     Object data[][]=  new Object[3][4];
     // First student details
     data[0][0]= "https://opensource-demo.orangehrmlive.com/"; 
     data[0][1]= "Admin";
     data[0][2]= "admin123";
     data[0][3]= "Indian56";
      
     // Second student details
     data[1][0]= "https://opensource-demo.orangehrmlive.com/";
     data[1][1]= "Admin";
     data[1][2]= "admin123";
     data[1][3]= "Indian57";
     
     data[2][0]= "https://opensource-demo.orangehrmlive.com/";
     data[2][1]= "Admin";
     data[2][2]= "admin123";
     data[2][3]= "Indian58";
     
     return data;
      
      
 }
	
	@Test(dataProvider="Orange15")//Step2
	public void loginTest(String TestURL,String UserName,String Password,String Nationality_Text) throws Exception//Step3
	{

		TC01_Nationality_DataProvider2 T1 = new TC01_Nationality_DataProvider2();
		
		T1.OpenChromeBroswer(TestURL);
		T1.Login(UserName,Password);
		T1.AddNationalities(Nationality_Text);
		T1.CloseBrowser();
	}
	
	
	public void OpenChromeBroswer(String TestURL1) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get(TestURL1);
	}
	

	public void Login(String UserName1,String Password1) throws Exception
	{
		findElement(By.id("txtUsername")).sendKeys(UserName1);
		findElement(By.id("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
	}
	

	public void AddNationalities(String Nationality_Text1) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality_Text1);
		findElement(By.id("btnSave")).click();
	}
	

	public void CloseBrowser() throws Exception
	{
		driver.quit();
	}
	

	
	
	
	
	public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}

	

}
