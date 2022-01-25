package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElement {

	public static void main(String[] args) {
		  
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//enter required url
		driver.get("https://demo.actitime.com/login.do");
		
		/**
		 * By is predefined class in selenium and all its method are static which are also known as "locator"
		 * Selenium support following locator:
		 * id , name, linkText, partialLinkText, className, tagName, cssSelector, xpath
		 * 
		 * Action: all the below actions will be performed on the webelement
		 * 			type--> sendKeys("");
		 * 		   click---> click();
		 * 		   clearing existing value from the field ---> clear();
		*/
		// locate user name field
		WebElement userinputfield=driver.findElement(By.id("username"));
		userinputfield.sendKeys("admin");
		//locate for password
		WebElement passwordinputfield=driver.findElement(By.className("pwd"));
          passwordinputfield.sendKeys("manager");
          //locate element for login button
          
	}

}

