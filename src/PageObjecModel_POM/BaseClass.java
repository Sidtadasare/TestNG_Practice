package PageObjecModel_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseClass {
	public static WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void CloseBrowser() {
		
		driver.quit();
	}
}
