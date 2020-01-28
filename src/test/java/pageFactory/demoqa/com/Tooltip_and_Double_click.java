package pageFactory.demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tooltip_and_Double_click {

	WebDriver driver;;

	public Tooltip_and_Double_click(WebDriver driver) {

		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//button[@id='doubleClickBtn']")
	WebElement doubleClick;

	@FindBy(xpath = "//button[@id='rightClickBtn']")
	WebElement rightClick;

	@FindBy(xpath = "//div[@class='tooltip']")
	WebElement age;

	@FindBy(xpath = "//div[@onclick][1]")
	WebElement edit;

	@FindBy(xpath = "//div[@onclick][2]")
	WebElement copy;

	@FindBy(xpath = "//div[@onclick][3]")
	WebElement tag;

	@FindBy(xpath = "//div[@onclick][4]")
	WebElement favourites;

	@FindBy(xpath = "//div[@onclick][5]")
	WebElement export;

	public WebElement doubleClick() {
		return doubleClick;

	}

	public WebElement rightClick() {
		return rightClick;

	}

	public WebElement Edit() {
		return edit;
	}

	public WebElement copy() {
		return copy;
	}

	public WebElement tag() {
		return tag;
	}

	public WebElement favourites() {
		return favourites;
	}

	public WebElement export() {
		return export;
	}
	
	public WebElement age()
	{
		return age;
	}

}
