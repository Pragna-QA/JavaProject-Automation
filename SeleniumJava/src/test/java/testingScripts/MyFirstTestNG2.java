package testingScripts;

import org.testng.annotations.Test;

// Lower Priority Execute First. By default priority is 0, if we don't provide

public class MyFirstTestNG2 
{
  @Test(priority = 1)
  public void loginApplication() 
  {
	  System.out.println("User is able to login");
  }
  
  @Test(priority = 2)
  public void createCouse()
  {
	  System.out.println("User is able to add courses");
  }
  
  @Test(priority = 3,enabled = false) //If we don't want to run any particular test, then we provide "enabled=false"
  public void deleteCourse()
  {
	  System.out.println("User is able to delete course");
  }
  
  @Test(priority = -4) // - Negative priority is the lowest priroty
  public void logoutFromApplication()
  {
	  System.out.println("User is able to logout");
  }
}
