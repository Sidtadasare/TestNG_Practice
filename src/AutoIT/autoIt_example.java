package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoIt_example {

	
	@Test
	public void Example() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/Seljars/ChromeDriver/chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/span[1]")).click();
	
	try {
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Seljars\\11.exe");
		Thread.sleep(5000);
	} 
	
	catch (IOException e) {
		
		e.printStackTrace();
	}
	
		
	
		}
	
	}
	

