package maven.practice.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search-input-box")
	public WebElement search;
	
	@FindBy(xpath="//span[@class=\"sc-dvCyap dObzjp\"][contains(text(),'Los Angeles')]")
	public WebElement LAoptionFromList;
	
	@FindBy(xpath="//button[@aria-controls='rooms-details-panel']")
	public WebElement roomControllBtn;
	
	@FindBy(xpath="//button[@aria-label='Add adult']")
	public WebElement addAdultBtn;
	
	@FindBy(xpath="//button[@aria-label='Remove adult']")
	public WebElement removeAdultBtn;
	
	@FindBy(xpath="//button[@aria-label='Add child']")
	public WebElement addChildBtn;
	
	@FindBy(xpath="//button[@aria-label=''Remove child']")
	public WebElement removeChildtBtn;
	
	@FindBy(xpath="//a[@aria-label='Update & Close Rooms & Guests']")
	public WebElement closeAdultWindow;
	
	@FindBy(xpath="//button[@aria-controls='special-rates']")
	public WebElement specialRates;
	
	@FindBy(xpath="//div[@id='special-rates']//div[2]//div/div[1]/label/div")
	public WebElement usePointsBox;
	
	@FindBy(xpath="//div[@id='special-rates']//div[2]/div[2]/a")
	public WebElement closeSpecialRates;
	
	@FindBy(xpath="//div[@class='sc-likbZx hheLpA']//button[starts-with(@aria-label,'check-in ')]")
	public WebElement datePickerButtn;
	
	@FindBy(xpath="//div[@class='sc-kQsIoO enZocq']//div[1]/button")
	public List<WebElement> fromdates;
	@FindBy(xpath="//div[@class='sc-kQsIoO enZocq']//div[2]/button")
	public List<WebElement> todates;
	
	@FindBy(xpath="//div[@class='sc-gVyKpa icHUVj']/a")
	public WebElement closeDatePicker;
	
	@FindBy(xpath="//button[@data-e2e='findHotel']")
	public WebElement findHotel;
	
	@FindBy(xpath="//p[@class='matchingNumberOfHotels']")
	public WebElement matchingResult;
	

}
