package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sourcedemo {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
	driver.get("https://www.saucedemo.com/");
	
	WebElement UserNnameInputField=driver.findElement(By.id("user-name"));
	UserNnameInputField.sendKeys("standard_user");
	                           //or
	//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	WebElement UserpasswordInputField=driver.findElement(By.id("password"));
	UserpasswordInputField.sendKeys("secret_sauce");	
                                 //or
     //driver.findElement(By.id(""password")).sendKeys("secret_sauce");
	
	driver.findElement(By.id("login-button")).click();
	
	System.out.println("page Title:"+driver.getTitle());
	
	System.out.println("Page url:"+driver.getCurrentUrl());

	
		
		
		
	
	}

}
