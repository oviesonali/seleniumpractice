package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testvtiger {
	public static void main(String args[]) {
		//step1. open browser
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		//step2.enter url
		cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//implicit wait
		 cdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //full screen
		cdriver.manage().window().maximize();
		//login page title
		System.out.println("page title before login"+cdriver.getTitle());
		//locate user name field
		WebElement userName=cdriver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys("admin");
		System.out.println("username visibility is:" +userName.isDisplayed());
		System.out.println("username visibility is:" +userName.isEnabled());
		
		//locate passwordfield
	WebElement passwordinputfild= cdriver.findElement(By.id("password"));
	passwordinputfild.clear();
	passwordinputfild.sendKeys("Test@123");
	System.out.println("password visibiliy:"+passwordinputfild.isDisplayed());
	System.out.println("password visibiliy:"+passwordinputfild.isEnabled());

	//locate login button
	WebElement logincutton= cdriver.findElement(By.tagName("button"));
	System.out.println("password visibiliy:"+logincutton.isDisplayed());
	System.out.println("password visibiliy:"+logincutton.isEnabled());
      logincutton.click();
      
      cdriver.findElement(By.className("userName")).click();//ye q are hai n kaise karee hai
		cdriver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	
		
	}

}

