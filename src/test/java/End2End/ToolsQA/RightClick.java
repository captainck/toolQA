package End2End.ToolsQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pageFactory.demoqa.com.Slider_Factory;

public class RightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CK\\eclipse-workspace\\ToolsQA\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/");

		driver.findElement(By.linkText("Slider")).click();
		Slider_Factory sf = new Slider_Factory(driver);

		int a = 0;
		while (a < 80) {

			a++;

			sf.slidder().sendKeys(Keys.ARROW_RIGHT);
			
			

		}
	}

}
