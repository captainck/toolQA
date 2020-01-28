package pageFactory.demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
		
	}

	// 1_Interactions

	// 1
	@FindBy(linkText = "Sortable")
	WebElement Sortable;

	// 2
	@FindBy(linkText = "Selectable")
	WebElement Selectable;

	// 3
	@FindBy(linkText = "Resizable")
	WebElement Resizable;

	// 4
	@FindBy(linkText = "Droppable")
	WebElement Droppable;

	// 5
	@FindBy(linkText = "Draggable")
	WebElement Draggable;

	// (2_Widgets)

	// 1
	@FindBy(linkText = "Keyboard Events")
	WebElement Keyboard_Events;
	// 2
	@FindBy(linkText = "Automation Practice Switch Windows")
	WebElement Automation_Practice_Switch_Windows;

	// 3
	@FindBy(linkText = "Tooltip and Double click")
	WebElement Tooltip_and_Double_click;
	// 4
	@FindBy(linkText = "Tooltip")
	WebElement Tooltip;

	// 5
	@FindBy(linkText = "Tabs")
	WebElement Tabs;

	// 6
	@FindBy(linkText = "Spinner")
	WebElement Spinner;

	// 7
	@FindBy(linkText = "Slider")
	WebElement Slider;

	// 8
	@FindBy(linkText = "Selectmenu")
	WebElement Selectmenu;

	// 9
	@FindBy(linkText = "Progressbar")
	WebElement Progressbar;

	// 10
	@FindBy(linkText = "Menu")
	WebElement Menu;

	// 11
	@FindBy(linkText = "Dialog")
	WebElement Dialog;

	// 12
	@FindBy(linkText = "Datepicker")
	WebElement Datepicker;

	// 13
	@FindBy(linkText = "Controlgroup")
	WebElement Controlgroup;

	// 14
	@FindBy(linkText = "Checkboxradio")
	WebElement Checkboxradio;

	// 15
	@FindBy(linkText = "Button")
	WebElement Button;

	// 16
	@FindBy(linkText = "Autocomplete")
	WebElement Autocomplete;

	// 17
	@FindBy(linkText = "Accordion")
	WebElement Accordion;

	// 18
	@FindBy(linkText = "Home")
	WebElement Home;

	// methods_Interactions

	public String HomeUrl() {

		return "https://demoqa.com/";
	}

	public WebElement Sortable() {

		return Sortable;

	}

	public WebElement Selectable() {

		return Selectable;

	}

	public WebElement Resizable() {

		return Resizable;

	}

	public WebElement Droppable() {

		return Droppable;

	}

	public WebElement Draggable() {

		return Draggable;

	}

	// methods_Widgets

	public WebElement Keyboard_Events() {

		return Keyboard_Events;

	}

	public WebElement Automation_Practice_Switch_Windows() {

		return Automation_Practice_Switch_Windows;

	}

	public WebElement Tooltip_and_Double_click() {

		return Tooltip_and_Double_click;

	}

	public WebElement Tooltip() {

		return Tooltip;

	}

	public WebElement Tabs() {

		return Tabs;

	}

	public WebElement Spinner() {

		return Spinner;

	}

	public WebElement Slider() {

		return Slider;

	}

	public WebElement Selectmenu() {

		return Selectmenu;

	}

	public WebElement Progressbar() {

		return Progressbar;

	}

	public WebElement Menu() {

		return Menu;

	}

	public WebElement Dialog() {

		return Dialog;

	}

	public WebElement Datepicker() {

		return Datepicker;

	}

	public WebElement Controlgroup() {

		return Controlgroup;

	}

	public WebElement Checkboxradio() {

		return Checkboxradio;

	}

	public WebElement Button() {

		return Button;

	}

	public WebElement Autocomplete() {

		return Autocomplete;

	}

	public WebElement Accordion() {

		return Accordion;

	}

	public WebElement Home() {

		return Home;

	}

}
