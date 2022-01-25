package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open browser
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//verify login page title
		System.out.println("login page:"+driver.getTitle());
		//verify user name
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		//verify password
		//enter password as Test@123
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test@123");
		//click on login button
		driver.findElement(By.tagName("button")).click();
		//verify home page title is dashborad
		//click on logout link & logout from the application
		//close the browser
		String expected=driver.getCurrentUrl();
		System.out.println("verify page title name"+driver.getTitle());
		System.out.println("verify current url:"+driver.getCurrentUrl());
		if(expected.equals("https://demo.vtiger.com/vtigercrm/index.php"))
		
			System.out.println("both are same");
		else {
		
			System.out.println("not same");
		}
			
		
	}
}
		
//https://www.guru99.com/install-testng-in-eclipse.html
		
		
        
		
		
	


