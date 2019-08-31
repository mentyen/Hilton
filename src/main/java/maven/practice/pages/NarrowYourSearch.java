package maven.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class NarrowYourSearch extends BaseClass{
	public NarrowYourSearch() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="#filterAvailableOnly")
	public WebElement avalibleOnlyBtn;

}
