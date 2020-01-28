package demoqa.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageFactory.demoqa.com.HomePage;
import pageFactory.demoqa.com.WindowHandle;


public class WindowRelated {
	WebDriver driver;
	HomePage hp;
	WebDriverWait wait;

	@BeforeClass
	public void BrowserLunching() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CK\\eclipse-workspace\\ToolsQA\\BrowserDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.hp = new HomePage(driver);
		driver.get(hp.HomeUrl());
		this.wait = new WebDriverWait(driver, 30);
		
		

	}

	@AfterClass
	public void ClosingBrowser() {
		this.driver.quit();
	}
	
	@Test
	public void newWindowHandle() {
		
		hp.Automation_Practice_Switch_Windows().click();
		
		WindowHandle wh= new WindowHandle(driver);
		
		wh.New_Browser_Window().click();
		
		Set<String> s = driver.getWindowHandles();
		
		s.iterator();
		Iterator<String> w = s.iterator();
		String w1= w.next();
		
		driver.switchTo().window(w1);
		driver.manage().window().maximize();
		System.out.println("second Window" + driver.getTitle());
		
			
	}

}
