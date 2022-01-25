package day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activetimelogin {
	private static By logoutLink;

	public static void main(String args[]) {
		/**
		 * 1. Open browser
		 * 2. Enter application url
		 * 3. verify login page title is 'actitime - Login'
		 * 3. enter username as admin
		 * 4. enter password as manager
		 * 5. click on login button
		 * 6. verify home page title is 'actiTIME -  Enter Time-Track'
		 * 7. click on logout link and logout from the application
		 * 8. close the browser
	*/
		
		//1.open browser
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//2.enter application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//step3 verify login page title
		System.out.println("befor login:"+driver.getTitle());
		//step 4:enter user name as admin
		driver.findElement(By.id("username")).sendKeys("admin");
		//step 5: enter password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//step5.login
		driver.findElement(By.id("loginButtonContainer")).click();
		//step:logout
    WebElement logout =driver.findElement(By.id("logoutLink"));
	//   6. verify home page title is 'actiTIME -  Enter Time-Track'
     WebDriverWait wait = new WebDriverWait(driver,50);
    wait.until(ExpectedConditions.elementToBeClickable(logout));
       //step 7:click on logout link and logout from the application
      System.out.println("page title after login"+driver.getTitle());
     // 8. close the browser
     logout.click();
     driver.close();
     
     
     
      //or
		// System.out.println("page title after login"+driver.getTitle());
     // WebElement logout =driver.findElement(By.id("logoutLink"));
  	// 6. verify home page title is 'actiTIME -  Enter Time-Track'
      
         //step 7:click on logout link and logout from the application
       
       // 8. close the browser
       // logout.click();
      //  driver.close();
	
		
		
		
	}
}
		
		
		
      
      
      
      
      
      
      
       
        
			
		
		
		


