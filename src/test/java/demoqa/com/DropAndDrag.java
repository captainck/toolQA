package demoqa.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.demoqa.com.Droppable;
import pageFactory.demoqa.com.HomePage;

public class DropAndDrag {

	WebDriver driver;
	HomePage home;
	Actions act;

	@BeforeClass
	public void LunchingBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CK\\eclipse-workspace\\ToolsQA\\BrowserDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.home = new HomePage(driver);
		driver.get(home.HomeUrl());

	}

	@AfterClass
	public void ClosingBrowser() {
		driver.close();
	}

	@Test
	public void Sortable() throws IOException {

		home.Sortable().click();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,
				new File("C:\\Users\\CK\\eclipse-workspace\\ToolsQA\\OutPut Folder\\Before screenshot.png"));

		act = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
		WebElement dest = driver.findElement(By.xpath("//ul[@id='sortable']/li[4]"));

		act.click(source).clickAndHold().moveToElement(dest).build().perform();

		File src002 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src002,
				new File("C:\\Users\\CK\\eclipse-workspace\\ToolsQA\\OutPut Folder\\Sortable\\After screenshot.png"));

	}

	@Test
	public void droppable() throws IOException {

		home.Droppable().click();

		Droppable dropable = new Droppable(driver);

		act.dragAndDrop(dropable.Draggable(), dropable.Droppabel()).build().perform();

		File src003 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src003,
				new File("C:\\Users\\CK\\eclipse-workspace\\ToolsQA\\OutPut Folder\\Dropable\\After screenshot.png"));

	}

}
