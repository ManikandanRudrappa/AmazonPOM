package base;

import java.util.concurrent.TimeUnit;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import excel.Excel;



public class ProjectSpecMethods 
{
	public static ChromeDriver driver;
	public String FileName;
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_Workspace\\Sdet\\src\\main\\java\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
	}
	@AfterMethod
	public void logout()
	{
		driver.quit();
	}
	@DataProvider
	public String[][] sendData() throws IOException
	{
		Excel newExcel = new Excel();
		return newExcel.readExcel(FileName);
	}
	
	   
}
