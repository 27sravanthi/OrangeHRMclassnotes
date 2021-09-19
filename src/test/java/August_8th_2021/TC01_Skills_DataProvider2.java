package August_8th_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Skills_DataProvider2 {
	
	static WebDriver driver;
	
	//Step1
	//String TestURL="https://opensource-demo.orangehrmlive.com/";
	//String UserName="Admin",Password="admin123";
	//String SkillName="Java12",SkillDescr="Java12 descr";
	
	
	//Step1
	 @DataProvider(name="Orange15")
	 public Object[] myDataProvider() throws Exception {
	      
	     Object data[][]=  new Object[3][5];
	     // First student details
	     data[0][0]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[0][1]= "Admin";
	     data[0][2]= "admin123";
	     data[0][3]= "Java22";
	     data[0][4]= "Java22 descr";
	      
	     // Second student details
	     data[1][0]= "https://opensource-demo.orangehrmlive.com/";
	     data[1][1]= "Admin";
	     data[1][2]= "admin123";
	     data[1][3]= "Java23";
	     data[1][4]= "Java23 descr";
	     
	     // Second student details
	     data[2][0]= "https://opensource-demo.orangehrmlive.com/";
	     data[2][1]= "Admin";
	     data[2][2]= "admin123";
	     data[2][3]= "Java24";
	     data[2][4]= "Java24 descr";
	     
	     return data;
	      
	      
	 }
	
	@Test(dataProvider="Orange15")//Step2
	public void loginTest(String TestURL,String UserName,String Password,String SkillName,String SkillDescr) throws Exception
	{

		TC01_Skills_DataProvider2 T1 = new TC01_Skills_DataProvider2();
		
		T1.OpenChromeBroswer(TestURL);
		T1.Login(UserName,Password);
		T1.AddSkills(SkillName,SkillDescr);
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
	

	public void AddSkills(String SkillName1,String SkillDescr1) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.linkText("Qualifications")).click();
		findElement(By.linkText("Skills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys(SkillName1);
		findElement(By.id("skill_description")).sendKeys(SkillDescr1);
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
