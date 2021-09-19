package August_13_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import ExcelUtil.ExcelApiTest4;

public class TC01_Skills_Excel2 {
	
	static WebDriver driver;
	
	//Step1
	//String TestURL="https://opensource-demo.orangehrmlive.com/";
	//String UserName="Admin",Password="admin123";
	//String SkillName="Java12",SkillDescr="Java12 descr";
	
	@DataProvider(name = "Skills")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Skills_14.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
	}
	
	
	
	@Test(dataProvider="Skills")//Step2
	public void loginTest(String Browser,String TestURL,
			String UserName,String Password,
			String SkillName,String SkillDescr) throws Exception//Step3
	{

		TC01_Skills_Excel2 T1 = new TC01_Skills_Excel2();
		
		//T1.OpenChromeBroswer(TestURL);
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
		driver=TestBrowser.OpenChromeBrowser();
		
		}
		
		if(Browser.equalsIgnoreCase("FireFox"))
		{
		driver=TestBrowser.FirefoxBrowser();
		Thread.sleep(4000);
		}
		
		T1.Login(TestURL,UserName,Password);
		T1.AddSkills(SkillName,SkillDescr);
		T1.CloseBrowser();
	}
	
	
	
	

	public void Login(String TestURL1,String UserName1,String Password1) throws Exception
	{
		driver.get(TestURL1);
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
