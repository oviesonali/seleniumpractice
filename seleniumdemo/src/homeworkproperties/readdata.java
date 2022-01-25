package homeworkproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdata {
	public static void main(String args[]) throws IOException {
		
		//Step1: Create an instance of FileInputStream class and pass property file location to its constructor
		//using absolute path
		
		FileInputStream fis = new FileInputStream(".\\Testdata\\Appdata.properties");
		
		//Step2: Create an instance of Properties class
		Properties prop=new Properties();
		
		//Step3: call load() method of Properties class and pass FileInputStream instance as an argument to it
				prop.load(fis);
				
				//step4: read the required data from property file based on the Key defined in the file
				String url=prop.getProperty("url");
				System.out.println("Applicaition URL: "+url);
				System.out.println(prop.getProperty("firstname"));
				System.out.println(prop.getProperty("lastname"));
				System.out.println(prop.getProperty("Address"));
				System.out.println(prop.getProperty("email"));
				System.out.println(prop.getProperty("phoneno"));
				
				
				System.out.println(prop.getProperty("language"));
				
				//Step1: open browser
				System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("url"));
				
			WebElement name=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
                name.sendKeys(prop.getProperty("firstname"));
                
               WebElement lname= driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
               lname.sendKeys(prop.getProperty("lastname"));
               
               WebElement add=driver.findElement(By.tagName("textarea"));
               add.sendKeys(prop.getProperty("Address"));
               
              WebElement m1=driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
             m1.sendKeys(prop.getProperty("email"));
             
             
              
             WebElement ph=driver.findElement(By.cssSelector("input[ng-model='Phone']"));
              ph.sendKeys(prop.getProperty("phoneno"));
              
              driver.findElement(By.cssSelector("input[value='FeMale']")).click();
              
              driver.findElement(By.cssSelector("input[value='Cricket']")).click();
              
              driver.findElement(By.cssSelector("input[value='Movies']")).click();
               
              driver.findElement(By.cssSelector("input[value='Hockey']")).click();
              
              
              WebElement l1=driver.findElement(By.id("msdd"));
              l1.sendKeys(prop.getProperty("language")); 
              
              
              
              
              
	
	}

}






