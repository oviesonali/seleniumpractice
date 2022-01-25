package HandlingmutipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://www.espncricinfo.com/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Get mobile phone name count from phone finder
		
		List<WebElement> gsmLinks=driver.findElements(By.cssSelector("#navbarSupportedContent>ul>li"));
		
		
		System.out.println("links count:"+gsmLinks.size());
		//for fetching
	for(WebElement element:gsmLinks) {
		System.out.println(element.getText());
		}
}



	}


