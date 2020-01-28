package pageFactory.demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Droppable {
	
	
	WebDriver driver;
	
	public Droppable(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[@id='draggable']")
	WebElement draggable;
	

	@FindBy(xpath = "//div[@id='droppable']")
	WebElement droppable;
	
	
	public WebElement Draggable() {
		return draggable;
	}
	
	public WebElement Droppabel() {
		
		return droppable;
	}
	
	
}
