package Assertion_Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_example {
	
	@Test
	public void login() {
	
		System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
   
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.html");//Hard Assert define kela ahe
																			//expected wromg deun
																		//aithun pudh execution hot nhi
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Swara");
		
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Naik");
		
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("416304");
		
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    
 
		
}
}