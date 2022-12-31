package Assertion_Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_True_and_False {
	@Test
	public void Assert_False() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
	   
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.fb.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")).click();
	
	Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).isSelected());
	
	driver.quit();

}
}
