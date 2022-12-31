package Day3_Grouping;

import org.testng.annotations.Test;

public class Group2 {
  @Test(groups= {"dell","Hp","Redmi"})
  public void TC1() {
	  System.out.println("Test Case 1");
  }
  
  @Test(groups= {"gm","gn","ge"})
  public void TC2() {
	  System.out.println("Test Case 2");
  }
  
}
