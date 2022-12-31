package Day3_Grouping;

import org.testng.annotations.Test;

public class Grouping {
 
	
	@Test(groups= {"dell","Hp","Redmi"})
  public void case1() {
		System.out.println("Test11");
  }
	
	@Test(groups= {"Java","Oracle",})
	  public void case2() {
		System.out.println("Test22");
	  }
	
	@Test(groups= {"gm","gn","ge"})
	  public void case3() {
		System.out.println("Test33");
	  }
	
	@Test(groups= {"dell","Hp","Redmi"})
	  public void case4() {
		System.out.println("Test44");
	  }
}
