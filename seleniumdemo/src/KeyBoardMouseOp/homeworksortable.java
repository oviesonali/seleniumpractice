package KeyBoardMouseOp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homeworksortable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //for url
		driver.get("https://jqueryui.com/sortable");
		//Switch to frame
		driver.switchTo().frame(0);
		
		// S1: Create an instance of Actions class and pass webdriver instance as an argument to its constructor
		Actions action = new Actions(driver);
		
		//Identify source and target element for Drag and Drop
		
				WebElement src=driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[7]"));
		       WebElement target= driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[1]"));
		       
		     //call dragAndDrop() of actions class
		       Thread.sleep(2000);
		       WebElement src1=driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[6]"));
		       WebElement target2= driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[1]"));
		       
		       
		       Thread.sleep(2000);
		       WebElement src3=driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[5]"));
		       WebElement target3= driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[1]"));
		       
		       Thread.sleep(2000);
		       WebElement src4=driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[4]"));
		       WebElement target4= driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[1]"));
		       
		       Thread.sleep(2000);
		       WebElement src5=driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[3]"));
		       WebElement target5= driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[1]"));
		    
		       Thread.sleep(2000);
		       WebElement src6=driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[2]"));
		       WebElement target6= driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[1]"));
		    
		    
		       
		       action.dragAndDrop(src, target).build().perform();
		      Thread.sleep(2000);
		       action.dragAndDrop(src1, target2).build().perform();
		       action.dragAndDrop(src3, target3).build().perform();
		       Thread.sleep(2000);
		       action.dragAndDrop(src4, target4).build().perform();
		       action.dragAndDrop(src5, target5).build().perform();
		       Thread.sleep(2000);
		       action.dragAndDrop(src6, target6).build().perform();
		       
		       
		       
				//call dragAndDropBy() of actions class
		       // action.dragAndDropBy(src, 150, 50).build().perform();""
		        System.out.println("done");
			}

}


