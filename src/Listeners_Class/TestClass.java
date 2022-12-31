package Listeners_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends Baseclass {
  @Test
  public void login() throws InterruptedException {
	  
	  driver.navigate().to("https://www.fury.com");
		
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("/html/body/div/form/input[1]")).sendKeys("User@123");
	  
	  driver.findElement(By.xpath("/html/body/div/form/input[2]")).sendKeys("Pass@123");
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("/html/body/div/form/button")).click();
	  
	  
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com");
  }
}
