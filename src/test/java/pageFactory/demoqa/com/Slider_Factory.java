package pageFactory.demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slider_Factory {

	
	WebDriver driver;
	public Slider_Factory(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='slider']/span")
	WebElement slider;
	
	
	public WebElement slidder()
	{
		return slider;
	}

}
