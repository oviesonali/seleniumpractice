package HandlingmutipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.flipkart.com");
		//implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//to remove login popup press Escape button
				driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
				
				List<WebElement> v1=driver.findElements(By.cssSelector("._37M3Pb>div>a"));
				System.out.println("element count:"+v1.size());
				for(int i=0;i<v1.size();i++) {
					WebElement option=v1.get(i);
					System.out.println(option.getText());
					

			}
				Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Top Offers']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='VIEW ALL']")).click();
				
				

	}

}


