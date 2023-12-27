package EXTENTREPORT;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class program {
	@Test
	public void report()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String screen_shot = driver.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter esp=new ExtentSparkReporter("Extentreport//attachfile.html");
		ExtentReports er=new ExtentReports();
		er.attachReporter(esp);
		ExtentTest test = er.createTest("program");
		test.log(Status.INFO,"pass");
		test.addScreenCaptureFromBase64String(screen_shot);
		er.flush();
		
	}

}
