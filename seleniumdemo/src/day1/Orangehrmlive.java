package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmlive {
	public static void main(String args[]) {
		//set path for driver executables
			System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
				//open Chrome browser
				WebDriver cdriver = new ChromeDriver();
				//open actitime browse
			//enter url//
				cdriver.get("https://Opensource-demo.Orangehrmlive.com");
				
				//locate user name field 
				WebElement userNameInputfield=cdriver.findElement(By.id("txtUsername"));
				userNameInputfield.sendKeys("Admin");
		
				
			//locate for password
				WebElement passwordInputfield=cdriver.findElement(By.id("txtPassword"));
				passwordInputfield.sendKeys("admin123");
				 
				
				//locate login button field
			WebElement loginInputfield=cdriver.findElement(By.id("btnLogin"));
				loginInputfield.click();
	

}
}