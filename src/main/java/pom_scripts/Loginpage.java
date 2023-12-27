package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{

	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(className="email")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(className="password")
	private WebElement password;

	public WebElement getPassword() {
		return password;

   }
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginbutton;
	public WebElement getLoginbutton() {
		return loginbutton;
	}
}

