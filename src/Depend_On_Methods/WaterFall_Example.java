package Depend_On_Methods;
									//DependOn Methods Mde Test Case Skip krta yetat
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaterFall_Example {

	
	

	@Test(priority=0  )
	public void Requirements() {
		System.out.println("1st Step Requirements");
	}
	
		
	@Test(priority=10,dependsOnMethods ="Requirements")
	public void Design() {
		System.out.println("2nd Step Design");
	Assert.assertTrue(true);
		
	}
	@Test(priority=20,dependsOnMethods ="Design")
	public void Implentation() {
		System.out.println("3rd Step Implentation");
		
	}
	
	@Test(priority=30,dependsOnMethods ="Implentation")
	public void Verification() {
		System.out.println("4th Step Verification");
		
	}
	
	@Test(priority=40,dependsOnMethods ="Verification")
	public void Maintainance() {
		System.out.println("5th Step Maintainance");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
