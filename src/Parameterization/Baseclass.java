package Parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Baseclass {
	
	 
static WebDriver driver;
 
	 
	@Test
	@Parameters({"Browsername"})
 public void openbrowser(String browsername) {
		
		if(browsername.equals("Firefox"))

		{	
			  System.setProperty("webdriver.gecko.driver","C:/Seljars/Geckodriver/geckodriver.exe");
				
			 driver = new FirefoxDriver();
		}
		else 

		{
			System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
		    
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}

  
    

	}
}
