package IRetry_Analyser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryExample2 {
	
	
	@Test(retryAnalyzer=IRetry_Analyser.Method_OF_Iretry.class)
	public void Second_run() throws InterruptedException {
	    
		  System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.google.com");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(3000);
		  
		  Assert.assertEquals("driver.getCurrentUrl()", "https://www.fb.com");
		  
		  driver.quit();

}
}