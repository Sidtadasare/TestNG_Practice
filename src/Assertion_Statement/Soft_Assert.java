package Assertion_Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	
	@Test
	public void Soft_assertexample() {
		
		SoftAssert sa=new SoftAssert();
	
		System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
   
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
sa.assertEquals(driver.getCurrentUrl(),"http://google.com");
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		driver.quit();
		
		sa.assertAll();

}
}