package PropertyFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get(PropertyDemo.readproperty("URl"));
		
		driver.findElement(By.id("email")).sendKeys(PropertyDemo.readproperty("username"));		
		
		driver.findElement(By.name("pass")).sendKeys(PropertyDemo.readproperty("Password"));					
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}
}
