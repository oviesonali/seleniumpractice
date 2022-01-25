package Testng;

import org.testng.annotations.Test;

public class withEnabled {
	@Test
	public void c_language(){
		System.out.println("c language");
	}
	@Test(enabled=false)
	public void jira() {
		System.out.println("jirta tool");
	}
	
	@Test
	public void java() {
		System.out.println("java language");
	}

}
