package pageFactory.demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandle {

	WebDriver driver;

	public WindowHandle(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@onclick='newBrwWin()']")
	WebElement new_browser_window;

	@FindBy(xpath = "//button[@onclick='newMsgWin()']")
	WebElement new_msg_window;

	@FindBy(xpath = "//button[@onclick='newBrwTab()']")
	WebElement new_browser_tab;

	public WebElement New_Browser_Window() {

		return new_browser_window;

	}

	public WebElement New_Message_Window() {

		return new_msg_window;

	}

	public WebElement New_Browser_Tab() {

		return new_browser_tab;

	}

}
