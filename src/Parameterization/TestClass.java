package Parameterization;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass extends Baseclass  {
	
	@Test

	@Parameters({"URL","usern","passwrd"})
	 
	public  void login(String urlname,String userid,String paaswrd ) {
		
	driver.get(urlname);
	
	  driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userid);

	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(paaswrd);
	
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
	}

}
