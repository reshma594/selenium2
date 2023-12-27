package Test_script;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Homepage;
import pom_scripts.Loginpage;
import pom_scripts.Registerpage;
import pom_scripts.Welcomepage;

public class RegisterTest extends Base_Test {


	@DataProvider(name="registerdata")
	public static Object[][] excel() throws IOException
	{
		return ReadExcel.getmultipledata("sheet1");
	}

	@Test(dataProvider="registerdata")
	public void testcase1(String firstname,String lastname,String email,String password,String confirmpwd) throws Throwable
	{
		//WELOME PAGE
		Welcomepage w=new Welcomepage(driver);
		w.getReglink().click();
		
		
		//REGISTRATION PAGE
		Registerpage r=new Registerpage(driver);
		r.getFirstname().sendKeys(firstname);
		r.getLastname().sendKeys(lastname);
		r.getEmail().sendKeys(email);
		r.getPassword().sendKeys(password);
		r.getConfpwd().sendKeys(confirmpwd);
		Thread.sleep(3000);
		r.getRegbutton().click();
			
	}
	}
	
	
