package generic;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Test extends UtilityMethods{

	@BeforeSuite
	public void beforesuite()
	{
		Reporter.log("connect to server",true);
	}
	
	@BeforeTest
	
	public void beforetest()
	{
		Reporter.log("connetct to database",true);
	}
	
	@BeforeClass
	
	public void beforeclass()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	
	public void afterclass()
	{
		//driver.quit();
		
	}
	
	@AfterTest
	
	public void aftertest()
	{
		Reporter.log("dissconnect to database",true);
	}
	
	@AfterSuite
	
	public void aftersuite()
	{
		Reporter.log("dissconnect to server",true);
	}
}
