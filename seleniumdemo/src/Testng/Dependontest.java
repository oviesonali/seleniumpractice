package Testng;

import org.testng.annotations.Test;

public class Dependontest {
	@Test
	public void webStudentLogin(){
		System.out.println("Student login through web");
		
	}

	@Test
	public void MobileStudentLogin() {
		System.out.println("Student login with mobile");
	}
	
    @Test(dependsOnMethods= {"webStudentLogin"})
    public void ApiStudentLogin() {
    	System.out.println("tudent login through Api");
    }
    
    
    
}
