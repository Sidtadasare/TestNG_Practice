package Listeners_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baseclass {
	
	static WebDriver  driver;
	@Test
	public void openBrowser() {
       
		System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
		
		 driver =new ChromeDriver();
		
		
		
	}

}
