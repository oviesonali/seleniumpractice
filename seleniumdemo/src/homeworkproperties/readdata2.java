package homeworkproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readdata2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Step1: Create an instance of FileInputStream class and pass property file location to its constructor
				//using absolute path
				
				FileInputStream fis = new FileInputStream(".\\Testdata\\Appdata2.Properties");
				//Step2: Create an instance of Properties class
				Properties prop=new Properties();
				
				//Step3: call load() method of Properties class and pass FileInputStream instance as an argument to it
						prop.load(fis);
						
				
						
						//step4: read the required data from property file based on the Key defined in the file
						String url=prop.getProperty("url");
						System.out.println("Applicaition URL: "+url);
						System.out.println(prop.getProperty("username"));
						System.out.println(prop.getProperty("password"));
						
						//open browse
						//System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
						WebDriverManager.chromedriver().setup();
						WebDriver driver=new ChromeDriver();
						driver.manage().window().maximize();
						driver.get(prop.getProperty("url"));
						
						WebElement u1 = driver.findElement(By.id("username"));
						u1.sendKeys(prop.getProperty("username"));
						
						WebElement p1 = driver.findElement(By.name("pwd"));
						p1.sendKeys(prop.getProperty("password"));
						
						driver.findElement(By.id("loginButton")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.id("container_tasks")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//div[text()='Add New']")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.cssSelector(".createNewTasks")).click();
						Thread.sleep(2000);
						
				//	driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']")).click();
					
					//driver.findElement(By.xpath("//div[@class='dropdownButton']")).click();
					Thread.sleep(2000);
					
					
					//driver.findElement(By.xpath("//div[@class='searchItemList']/div[4]")).click();
					//Thread.sleep(2000);
					//project 
					
					//driver.findElement(By.cssSelector(".projectSelector>div>div>div")).click();
					//Thread.sleep(2000);
					//driver.findElement(By.cssSelector(".projectSelector>div>div:nth-of-type(2)>div>div>div>div:last-child")).click();
					
					//WebElement task=driver.findElement(By.xpath("//div[text()='Create Tasks']"));
					//task.click();
					
					//Thread.sleep(2000);
				//driver.findElement(By.xpath("//input[@placeholder='Enter task name'][@class='inputFieldWithPlaceholder error']")).sendKeys("Testing");
					
					//task.click();
					//Thread.sleep(2000);
					
				//driver.findElement(By.className("checkbox inactive")).click();
					
						
	}

}
