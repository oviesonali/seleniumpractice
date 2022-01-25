package day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operationbrowser {
	public static void main(String args []) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//full screen browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//step2.enter url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//implicit wait
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //TO MAXIME SCREEN
		 driver.manage().window().maximize();
		 //MINIMIZE
		  driver.manage().window().setSize(new Dimension(500, 600));
		 
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  //MAXIMIZE
		  driver.manage().window().maximize();
		  //locate for username
		//  WebElement userNameInputfield=driver.findElement(By.id("txtUsername"));
		//	userNameInputfield.sendKeys("Admin");
	
			
		//locate for password
		//	WebElement passwordInputfield=driver.findElement(By.id("txtPassword"));
		//	passwordInputfield.sendKeys("admin123");
			 
			
			//locate login button field
	//	WebElement loginInputfield=driver.findElement(By.id("btnLogin"));
		//	loginInputfield.click();
			

			// driver.navigate().back();
		  //for forgot password
			//driver.findElement(By.linkText("Forgot your password")).click();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//reload
	  driver.navigate().refresh();
	    Thread.sleep(5000);
	    //move to other url
		driver.navigate().to("https:www.saucedemo.com/");
	}
		 
		 
		 
		 
	
}