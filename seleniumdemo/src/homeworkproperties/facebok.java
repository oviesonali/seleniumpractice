package homeworkproperties;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebok {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://www.facebook.com/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//identify dropdown
		driver.findElement(By.cssSelector("a[role='button'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		

	}

}
