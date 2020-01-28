package pageFactory.demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Keyboard_Events {

	WebDriver driver;

	public Keyboard_Events(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='browseFile']")
	WebElement choose_file;

	@FindBy(xpath = "//button[@id='uploadButton']")
	WebElement upload;

	public WebElement Choose_File() {

		return choose_file;

	}

	public WebElement Upload() {
		return upload;
	}

}
