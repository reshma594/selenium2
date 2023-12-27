package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Basepage{

	public Registerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Register")
	private WebElement reglink;

	public WebElement getReglink() {
		return reglink;
	}
	@FindBy(id="gender-male")
	private WebElement gender1;
	
	public WebElement getGender() {
		return gender1;
	}
	@FindBy(id="gender-female")
	private WebElement gender2;
	
	
	public WebElement getGender2() {
		return gender2;
	}
	@FindBy(id="FirstName")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(name="LastName")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(name="Email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	@FindBy(name="Password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(name="ConfirmPassword")
	private WebElement confpwd;

	public WebElement getConfpwd() {
		return confpwd;
	}
	@FindBy(name="register-button")
	private WebElement regbutton;

	public WebElement getRegbutton() {
		return regbutton;
	}
	
}
