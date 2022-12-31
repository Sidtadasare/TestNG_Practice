package PageObjecModel_POM;

import org.testng.annotations.Test;

public class LoginPage extends BaseClass {
	
	@Test
	public void logo() throws InterruptedException {
		SignInPage si= new SignInPage("http://www.facebook.com");	//Object kela ahe 
		si.loginpage("9637912772", "12271227");
		Thread.sleep(5000);
	}

}
