package KeyBoardMouseOp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hwdropndown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//Switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='post-2669']/div[2]/div/div/div[1]/p/iframe")));
		
		// S1: Create an instance of Actions class and pass webdriver instance as an argument to its constructor
	   Actions action = new Actions(driver);
	    Thread.sleep(2000);
	  //Identify source and target element for Drag and Drop
	WebElement src=driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
	WebElement src2=driver.findElement(By.xpath("//ul[@id='gallery']/li[2"));
	WebElement src3=driver.findElement(By.xpath("//ul[@id='gallery']/li[3]"));
	WebElement src4=driver.findElement(By.xpath("//ul[@id='gallery']/li[4]"));
	
	//for target
    WebElement target=driver.findElement(By.cssSelector("div[id='trash'] "));
	
	  Thread.sleep(2000);
	//call dragAndDrop() of actions class
	 action.dragAndDrop(src, target).build().perform();
	 Thread.sleep(2000);
	 action.dragAndDrop(src2, target).build().perform();
	 Thread.sleep(2000);
	 action.dragAndDrop(src3, target).build().perform();
	 Thread.sleep(2000);
	 action.dragAndDrop(src4, target).build().perform();
	//call dragAndDropBy() of actions class
			//action.dragAndDropBy(src, 50, 0).build().perform();
			//System.out.println("done");

	}

}
