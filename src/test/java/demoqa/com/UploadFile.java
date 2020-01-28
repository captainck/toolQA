package demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.demoqa.com.HomePage;
import pageFactory.demoqa.com.Keyboard_Events;

public class UploadFile {

	WebDriver driver;

	@BeforeTest
	public void BrowserLunching() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CK\\eclipse-workspace\\ToolsQA\\BrowserDriver\\chromedriver.exe");

		this.driver = new ChromeDriver();

	}

	@AfterTest
	public void ClosingBrowser() {
		this.driver.quit();
	}

	@Test
	public void Uploading() {
		HomePage hp = new HomePage(driver);
		driver.get(hp.HomeUrl());
		hp.Keyboard_Events().click();

		Keyboard_Events kb = new Keyboard_Events(driver);
		kb.Choose_File().sendKeys("D:\\Testing Skills\\images.png");
		kb.Upload().click();
		System.out.println(driver.switchTo().alert().getText());

	}
	
}
