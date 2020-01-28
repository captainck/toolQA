package demoqa.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.demoqa.com.HomePage;
import pageFactory.demoqa.com.Slider_Factory;
import pageFactory.demoqa.com.Tooltip_and_Double_click;

public class ActionClass {
	WebDriver driver;
	HomePage hp;
	Actions act;
	Tooltip_and_Double_click tp;
	WebDriverWait wait;

	@BeforeClass
	public void BrowserLunching() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CK\\eclipse-workspace\\ToolsQA\\BrowserDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.hp = new HomePage(driver);
		driver.get(hp.HomeUrl());
		this.wait = new WebDriverWait(driver, 30);
		this.tp = new Tooltip_and_Double_click(driver);
		this.act = new Actions(driver);

	}

	@AfterClass
	public void ClosingBrowser() {
		this.driver.quit();
	}

	@Test
	public void doubleclick() {

		hp.Tooltip_and_Double_click().click();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		act.doubleClick(tp.doubleClick()).build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

	@Test
	public void rightClick() throws IOException {

		hp.Tooltip_and_Double_click().click();

		act.contextClick(tp.rightClick()).build().perform();
		tp.Edit().click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\test.png"));

		act.contextClick(tp.rightClick()).build().perform();
		tp.tag().click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		act.contextClick(tp.rightClick()).build().perform();
		tp.favourites().click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		act.contextClick(tp.rightClick()).build().perform();
		tp.export().click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

	@Test
	public void slider() {

		hp.Slider().click();
		Slider_Factory sf = new Slider_Factory(driver);

		int a = 0;
		while (a < 80) {

			a++;

			sf.slidder().sendKeys(Keys.ARROW_RIGHT);
		}

	}

}
