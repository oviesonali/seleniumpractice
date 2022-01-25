package HandlingmutipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class splitmethod {

	public static void main(String[] args) {
		// Step1: open browser
				System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				// full screen browser
				driver.manage().window().maximize();
				/** Step2: enter required URL */
				driver.get("https://opensource-demo.orangehrmlive.com/");
				// implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement user=driver.findElement(By.cssSelector("#wrapper>div:first-child>div:nth-of-type(2)>span"));
				String name=user.getText();
		    	System.out.println(name);
				String[] splitName=name.split(" ");
			   System.out.println("index 0: "+splitName[0]);
			    System.out.println("index 1: "+splitName[1]);
			    System.out.println("index 2: "+splitName[2]);
			    System.out.println("index 3: "+splitName[3]);
			    System.out.println("index 4: "+splitName[4]);
			    System.out.println("index 5: "+splitName[5]);
			    System.out.println("index 6: "+splitName[6]);
			    System.out.println("index 7: "+splitName[7]);
			    
			    driver.findElement(By.id("txtUsername")).sendKeys(user.getText().split(" ")[3]);
				
				WebElement pass=driver.findElement(By.cssSelector("#wrapper>div:first-child>div:nth-of-type(2)>span"));
			    
			    driver.findElement(By.name("txtPassword")).sendKeys(pass.getText().split(" ")[7]);
			    driver.findElement(By.id("btnLogin")).click();

	}

}
