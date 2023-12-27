package generic;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom_scripts.Homepage;
import pom_scripts.Loginpage;
import pom_scripts.Welcomepage;

public class LoginTest extends Base_Test{
	
	@DataProvider(name="logindata")
	public static Object[][] loginpageexcel() throws IOException
	{
		return ReadExcel.getmultipledata("sheet2");
		
	}

	@Test(dataProvider="logindata")
	public void testcase2(String email,String password) throws Throwable
	{
		       //WELOME PAGE
				Welcomepage w=new Welcomepage(driver);
				w.getLoginlink().click();
				
				//LOGIN PAGE
				w.getLoginlink().click();
				Loginpage l=new Loginpage(driver);
				l.getEmail().sendKeys(email);
				l.getPassword().sendKeys(password);
				Thread.sleep(3000);
				l.getLoginbutton().click();
	}
	
				/*@Test(dependsOnMethods = "testcase2")
				public void home() throws Throwable
				{
				//HOME PAGE		
				Homepage h=new Homepage(driver);
				h.getDigital().click();
	             Thread.sleep(5000);

				
	}*/
				
}


