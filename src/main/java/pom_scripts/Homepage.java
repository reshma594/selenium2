package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {

	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(className="button-1 register-continue-button")
	private WebElement continuebutton;

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	//product1-----------14.1-inch Laptop--------------
	
	@FindBy(xpath ="(//input[@value='Add to cart'])[1]")
	private WebElement laptop;

	public WebElement getLaptop() {
		return laptop;
	}
	
	//product2-----------computer--------------
	
	@FindBy(xpath ="(//input[@value='Add to cart'])[2]")
	private WebElement system;

	public WebElement getSystem() {
		return system;
	}
	//product3-----------computer---------------
	
	@FindBy(xpath ="(//input[@value='Add to cart'])[3]")
	private WebElement system1;

	public WebElement getSystem1() {
		return system1;
	}
	//product4-----------computer---------------
	
		@FindBy(xpath ="(//input[@value='Add to cart'])[4]")
		private WebElement system2;

		public WebElement getSystem2() {
			return system2;
		}
		
		
	//------------DIGITAL DOWNLOADS IN MENUBAR-----------------
	@FindBy(xpath = "(//a[contains(normalize-space(text()),'Digital downloads')])[1]")
	private WebElement digital;

	public WebElement getDigital() {
		return digital;
	}
	
}
