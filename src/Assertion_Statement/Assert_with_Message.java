package Assertion_Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_with_Message {		//( Assert.assertEquals(actual,expected.message)---example


	@Test
	public void Assert_with_message_example() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
	   
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.fb.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")).click();
	
	Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")).isSelected(),true,"Option is Not Selected");
	
	driver.quit();

	}
}
