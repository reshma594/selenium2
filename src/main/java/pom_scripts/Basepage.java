package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class Basepage extends UtilityMethods {

	public Basepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
