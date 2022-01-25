package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://demoqa.com/automation-practice-form");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Get mobile phone name count from phone finder
		WebElement fname=driver.findElement(By.id("firstName"));
		System.out.println(fname.isDisplayed()+": "+ fname.isEnabled());
		fname.clear();
		System.out.println("First Name:"+fname.getTagName());
		System.out.println("First Name:"+fname.getAttribute("class"));
		fname.sendKeys("sonali");
		
		WebElement lname=driver.findElement(By.id("lastName"));
		System.out.println(lname.isDisplayed()+": "+ lname.isEnabled());
		lname.clear();
		System.out.println("last Name:"+fname.getTagName());
		System.out.println("last Name:"+fname.getAttribute("class"));
		lname.sendKeys("wanjari");
		
		WebElement email= driver.findElement(By.id("userEmail"));
		System.out.println(email.isDisplayed()+": "+ email.isEnabled());
		email.clear();
		System.out.println("last Name:"+email.getTagName());
		email.sendKeys("sonali.wanjarit@gmail.com");
		
		
	}

}
