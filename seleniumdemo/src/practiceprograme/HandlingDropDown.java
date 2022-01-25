package practiceprograme;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//full screen browser 
	driver.manage().window().maximize();
	/**Step2: enter required URL */
	driver.get("https://courses.letskodeit.com/practice");
	//implicit wait: Interface->Interface->Interface->abstract method*/
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement v1=driver.findElement(By.cssSelector("#carselect"));
	Select s1=new Select(v1);
	System.out.println(s1.getFirstSelectedOption().getText());
	List<WebElement> options=s1.getOptions();
	
	System.out.println(options.size());
	System.out.println(s1.getFirstSelectedOption().getText());
	//select option from dropdown
	s1.selectByIndex(2);
	System.out.println("Selected option: "+s1.getFirstSelectedOption().getText());
	Thread.sleep(2000);
	s1.selectByValue("benz");
	System.out.println("Selected option: "+s1.getFirstSelectedOption().getText());
	Thread.sleep(2000);
	s1.selectByVisibleText("BMW");
	System.out.println("Selected option: "+s1.getFirstSelectedOption().getText());
		
	
	
	

}
}