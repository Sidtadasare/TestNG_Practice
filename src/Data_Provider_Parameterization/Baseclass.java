  package Data_Provider_Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Baseclass {
  @Test(dataProvider = "testdata")
 
  public void FirstPage(String uname,String pass) {
	  
	  System.setProperty("webdriver.gecko.driver","C:/Seljars/Geckodriver/geckodriver.exe");
		
	  WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(uname);

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
		
		driver.quit();
		
  }
  
  @DataProvider(name="testdata")
  
  public Object[][] testdata(){
	  
	Object [][] data=new Object[2][2] ;
	
	data[0][0] ="standard_user";
	data[0][1] ="secret_sauce";
    data[1][0] ="performance_glitchuuser";
    data[1][1] ="secret_sauce";
	return data;	
  }		
  }