package Testng;

import org.testng.annotations.Test;

public class descriptiontest {
	@Test(description="Tc1:Login With Valid User")
	 public void loginWithValidUser() {
		  System.out.println("loginWithValidUser");
	  }
	 @Test(description="TC2: Login with invalid user")
	  public void loginWithInValidUser() {
		  System.out.println("loginWithInValidUser");
	  }
	  @Test(description="TC3: Login with empty user")
	  public void loginWithEmpty() {
		  System.out.println("loginWithEmpty");
	  }
}

