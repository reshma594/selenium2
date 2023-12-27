package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcomepage extends Basepage {

	public Welcomepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText="Register")
	private WebElement reglink;

	public WebElement getReglink() {
		return reglink;
	}
	
	@FindBy(linkText="Log in")
	private WebElement loginlink;

	public WebElement getLoginlink() {
		return loginlink;
	}
	
	

}
