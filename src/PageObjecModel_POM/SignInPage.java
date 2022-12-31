package PageObjecModel_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignInPage extends BaseClass{
						WebElement username;
						WebElement Password;			//WebElement Declare Kela Ahe(**GLOBALLY**)
						WebElement submit;
	        
						
			 SignInPage(String url)	{					//Page cha Reference Ghetla ahe
		
	         driver.get(url);
	         
	         username=driver.findElement(By.id("email"));		//webelement locate kela
	         
	         Password=driver.findElement(By.name("pass"));
	         
	         submit=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));			
	         
	         		               }
	
public void loginpage(String userid,String pass) {		//method ahe
		username.sendKeys(userid);
		Password.sendKeys(pass);							//webelement mde value pass keli ahe
		submit.click();
		
	}
	}


